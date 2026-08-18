package socket.ch01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile2 {
    public static void main(String[] args) {
        //192.168.7.232
        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            System.out.println("서버측 프로그램 시작 포트 번호 : 5000에서 대기중...");

            //클라이언트가 내 IP 주소와 포트번호르 사용해서 연결할떄까지 이줄에서 멈춤(블로킹)
            Socket socket = serverSocket.accept();

            //읽기 스트림 문자기반 , 클라이언트 -->서버
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //쓰기 스트림 문자기반 서버 --> 클라이언트
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

            //읽기 스트림
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("assets/a.txt"));


            //클라이언트가 보낸 데이터  한줄 읽기
            String message = reader.readLine();
            System.out.println("클라이언트 메세지 : " + message);

            //서버가 클라이언트에게 파일 내용을 읽고 보낸다
            int data;
            while ((data = bis.read()) != -1) {
                writer.print((char)data);
            }
            writer.flush();
            writer.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
