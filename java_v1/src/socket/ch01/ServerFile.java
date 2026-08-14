package socket.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {
    public static void main(String[] args) {
        //192.168.7.232
        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            System.out.println("서버측 프로그램 시작 포트 번호 : 5000에서 대기중...");

            //클라이언트가 내 IP 주소와 포트번호르 사용해서 연결할떄까지 이줄에서 멈춤(블로킹)
            Socket socket = serverSocket.accept();

            //I/O 배웠던 스트림 사용
            //스트림 체이닝 연결 socket + 브릿지(InputStreamReader) + BufferedReader
            InputStream in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            System.out.println("클라이언트가 연결 되었습니다");

            //클라이언트가 보낸 데이터를 한줄을 읽어보자.
            String message = br.readLine(); //연결된후 데이터 보내기전까지 블로킹
            System.out.println("클라이언트가 보낸 메세지 : " + message);





        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
