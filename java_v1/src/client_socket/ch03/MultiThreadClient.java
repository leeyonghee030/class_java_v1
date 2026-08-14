package client_socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiThreadClient {

    public static void main(String[] args) {
        //도전과제
        //소켓 만들기
//        192.168.7.51
        //192.168.7.232
        try (Socket socket = new Socket("192.168.5.101", 5002)) {
            //읽기 , 쓰기(키보드) 스트림 만들기
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            //읽기 스레드 만들기
            Thread readerThread = new Thread(() -> {
                String serverMassege;
                try {
                    while ((serverMassege = reader.readLine()) != null) {
                        //프롤토콜 1 -exit
                        if ("exit".equalsIgnoreCase(serverMassege)) {
                            System.out.println("서버가 종료를 원합니다");
                            break;
                        }
                        System.out.println(serverMassege);
                    }
                } catch (Exception e) {
                    System.err.println("서버가 강제 종료 했습니다");
                }

            });

            //출력 스레드 만들기 (클라이언트 키보드값을 받아서 서버측으로 전송)
            Thread writerThread = new Thread(() -> {

                String clientMessage;

                    try {
                        while ((clientMessage = keyboardReader.readLine()) != null){
                            writer.println(clientMessage);
                            if ("exit".equalsIgnoreCase(clientMessage)) {
                                System.out.println("클라이언트 종료 됨");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("메세지 전송중 오류 발생");
                    }


            });


            readerThread.start();
            writerThread.start();

            readerThread.join();
            writerThread.join();


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
