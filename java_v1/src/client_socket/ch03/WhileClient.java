package client_socket.ch03;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class WhileClient {

    public static void main(String[] args) {

        //도전과제 주석으로 무엇을 해야될지만 작성해보세요
        try (Socket socket = new Socket("localhost", 5000)) {
            //소켓 입출력 스트림 만들기
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

            //클라이언트 측 키보드 스트림 필요
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //서버에게 문자 보내기
            String line;
            while (true) {
                System.out.println("[client]콘솔 로그 클라이언트 입력 >>");
                String input = keyboardReader.readLine();
                writer.println(input);


                if ("exit".equalsIgnoreCase(input)) {
                    break; //즉 키보드 입력 스트림 종료
                }

                //서버픅에서 보낸 메서지를 받아서 클라이언트 콘솔창에 출력
                String response = reader.readLine();
                if ("exit".equalsIgnoreCase(response)){
                    break;
                }
                System.out.println("서버측 응답: " + response);
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
