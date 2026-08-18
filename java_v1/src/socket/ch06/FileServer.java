package socket.ch06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class FileServer {
    private static final int PORT = 5000;
    private static final String UPLOAD_DIR = "uploads";

    //서버 - 클라이언트 약속 (프로토콜)
    // [1바이트] 파일의 이름의 길이 (0 - 255) [][][][][][][][] 8비트
    // [n바이트] 파일 이읆
    // [나머지] 파일 내용 (클라이언트가 출력 방향을  닫으면 -1 끝)

    public static void main(String[] args) {

        //File 객체 = 경로가 적힌 쪽지 일뿐 , 실제 폴더나 파일이 아니다
        //아래 한줄로는 uploads 폴더가 만들어지지 않는가
        //그냥 uploads 경로를 가르키는 객체가 메모리에 하나 생겼을뿐이다
        File dir = new File(UPLOAD_DIR);

        if (!dir.exists()) {
            //mkdirs() 를 호출하는 순간에 비로서 실제 폴더를 만들 수 있음
            //mkdir() 과 달리 중간 경로 까지 한번에 만들어준다
            boolean created = dir.mkdirs();
            System.out.println("업로드 폴더 생성: " + created);
        }

        System.out.println("파일 서버 시작 - 포트 : " + PORT);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket socket = serverSocket.accept();

            System.out.println("클라이언트 연결됨 : " + socket.getInetAddress().getHostAddress());

            //소켓에 연결된 입출력 스트림 준비
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

//            _________________________________________
            //1단계 : 파일 이름의 길이 읽기 (1바이트)
//            -----------------------------------------

            // byte 가 아니라 int 돌려주는 이유
            // byte는 -128~127이라 끝(-1)을 표현할 자리가 없다
            //그래서 0~255는 데이터를 구분에서 -1이 들어오면 끝 신호로 구분해서 쓴다
            int nameLength = in.read();

            //방어적 코드
            //이 검사룰 뺴면 아래에서는 new byte[-1]이 되어 오류가 발생한다.
            if (nameLength == -1) {
                System.out.println("클라이언트가 아무것도 보내지않고 종료 했습니다");
                return;
            }

            System.out.println("파일에 이름 길이 : " + nameLength + "바이트로 들어온다고 확인 됨");

//             _________________________________________
            //2단계 : 파일 이름을 정확하게 nameLength 만큼 읽기
//            -----------------------------------------
            byte[] nameBuffer = new byte[nameLength];
            int nameRead = 0; //지금 까지 읽어서 채운 바이트수

            //이 while 문법이 이번 예제에 가장 중요한 부분이라 할수있다
            //read(값을 담을 배열 , 시작위치, 최대개수)는 요청한 만큼 반드시 읽어 준다는
            // 보장이 없다.
            //네트워크 사정에 따라 총 30바이트를 받는다 가정하면 처번쟤에 3바이트만 올수도 있다.
            while (nameRead < nameLength) {
                int count = in.read(nameBuffer,nameRead,nameLength-nameRead);
                if (count == -1) {
                    throw new IOException("파일 이름을 받는 중에 연결이 끊겼습니다");
                }
                //받은 만큼 커서를 앞으로 민다. 이줄이 없으면 무한루츠가 된다
                nameRead += count;
            }
            //예 a.zip 을 받는경우 -->[5][a][.][z][i][p][...파일내용]


            String fileName = new String(nameBuffer); //바이트로 들어온 데이터를 문자열로 생성함

            //방어적 코드:악의적인 클라이언트가 "../../비밀.txt와 같은 이름을 보내면
            if(fileName.contains("..") || fileName.contains("/") || fileName.contains("\\")){
                System.out.println("허용되지 않는 파일 이름입니다 :" +fileName);
                return;
            }
            System.out.println("수신항 파일 이름 : " +fileName);

//                  _________________________________________
            //3단계 : 파일 내용을 받아서 서버측 컴퓨터 디스크에 저장
//            -----------------------------------------

            //여기서도 아직 파일은 만들어 지지않았다. 경로를 가리키는 객체일뿐이다
            File target = new File(dir,fileName);

            //FileOutputStream 생성자가 실행되는 순간 비로서 디스크에 실제 파일이 생긴다
             // 있으면 내용이 지워지고 새로시작
            FileOutputStream fos = new FileOutputStream(target);

            byte[] buffer = new byte[4096]; // 4KB 운영체계가 디스크를 다루르는 단위와 맞춤크기
            int bytesRead;
            long total = 0;

            //클라이언트가 shutdownOutput() 을 호출하면 (클라이언트가 소켓 close전에 -1을 보낼수있다 )
            //그 신호가도착하해서 read()가 -1을 반환한다

            while ((bytesRead = in.read(buffer)) != -1){
                fos.write(buffer,0,bytesRead);
                total += bytesRead;
            }
            System.out.println("저장 완료 : "+ target.getPath() + " 총 " +total + " 바이트");


//            _________________________________________
            //4단계 : 완료 응답 전송
//            -----------------------------------------
            //클라이언트 출력 방향만 닫았고 입력방행은 살아있으므로 서보가 보낸 응답을 정삭적으로 받을수있다
            out.write(("업로드 성공 : " +fileName).getBytes());
            out.flush();// 통로에 남은 데이터를 다밀어낸다



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
