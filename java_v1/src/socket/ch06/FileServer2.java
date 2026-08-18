package socket.ch06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer2 {

    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "uploads";

    public static void main(String[] args) {

        //서버 클라이언트한테 받은 파일 저장할 폴더만들기
        File dir = new File(UPLOAD_DIR);

        if (!dir.exists()) {
            boolean created = dir.mkdirs();//폴더 만들기
            System.out.println("업로드 폴더 생성" + created);
        }

        System.out.println("파일 서버 시작 - 포트 " + PORT);
//    2. 서버열기
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket socket = serverSocket.accept();

            System.out.println("클라이언트 연결됨" + socket.getInetAddress().getHostAddress());

            //소켁 연결된 입출력 스트림 출력
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            // 1. 파일 이름 길이 읽기

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

            FileOutputStream fos = new FileOutputStream(taget);

            byte[] buffer = new byte[4096];
            int bytesRead;
            long total = 0;

            while ((bytesRead = in.read(buffer)) != -1) {
                fos.write(buffer,0,bytesRead);
                total += bytesRead;
            }
            System.out.println("저장 완료 : " + taget.getPath() + " 총 " + total + " 바이트");

            out.write(("업로드 성공 : " +filename).getBytes());
            out.flush();// 통로에 남은 데이터를 다밀어낸다

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
