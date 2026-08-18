package socket.ch06;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MultiFileServer {

    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "uploads";

    private static Vector<PrintWriter> clientWriterList = new Vector<>();

    public static class ClientHandler extends  Thread  {
        private Socket socket;
        private InputStream in;
        private OutputStream out;
        private File dir;

        public ClientHandler (Socket socket,File dir) {
            this.socket = socket;
            this.dir = dir;
        }

        @Override
        public void run() {

            try (Socket s = socket) {
                in = socket.getInputStream();
                out = socket.getOutputStream();


                int nameLength = in.read();

//            방어적코드
                if (nameLength == -1) {
                    System.out.println("클라이언트가 아무것도 보내지않았습니다");
                    return;
                }
                System.out.println("파일길이" + nameLength + " 바이트");

//            2. 파일 이름을정확하게 nameLength만큼읽기
                byte[] nameBuffer = new byte[nameLength];
                int nameRead = 0;

                while (nameRead < nameLength) {
                    int count = in.read(nameBuffer, nameRead, nameLength - nameRead);
                    if (count == -1) {
                        throw new IOException("파일 이름을 받는 중에 연결이 끊겼습니다");
                    }
                    nameRead += count;
                }

                String filename = new String(nameBuffer);

                if (filename.contains("..") || filename.contains("/") || filename.contains("\\")) {
                    System.out.println("허용되지 않는 파일 이름입니다 : " + filename);
                    return;
                }
                System.out.println("수신 할 파일 이름 " + filename);

//            3.파일 내용을 받아서 서버측 디스크에 저장
                File taget = new File(dir,filename);

                long total;
                try (FileOutputStream fos = new FileOutputStream(taget)) {

                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    total = 0;

                    while ((bytesRead = in.read(buffer)) != -1) {
                        fos.write(buffer, 0, bytesRead);
                        total += bytesRead;
                    }
                    System.out.println("저장 완료 : " + taget.getPath() + " 총 " + total + " 바이트");
                }
                //FileOutputStream은 소켓과 아무 연관이 없는 완전히 별개의 자원이에요
                // . 아무도 대신 닫아주지 않습니다
                // . 명시적으로 close()를 호출하지 않으면 절대 안 닫혀요.


                out.write(("업로드 성공 : " +filename).getBytes());
                out.flush();// 통로에 남은 데이터를 다밀어낸다




            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {


            }


        }



    }




    public static void main(String[] args) {
        File dir = new File(UPLOAD_DIR);

        if (!dir.exists()){
            boolean created = dir.mkdirs();
            System.out.println("업로드 폴더 생성: " + created);
        }
        System.out.println("파일 서버 시작 - 포트 : " + PORT);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                new  ClientHandler(socket,dir).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
