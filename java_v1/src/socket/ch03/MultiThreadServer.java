package socket.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {

    public static void main(String[] args) {
        System.out.println("======서버실행=======");
        try (ServerSocket serverSocket = new ServerSocket(5001)) {
            Socket socket = serverSocket.accept();
            System.out.println("======클라이언트 연결됨=====");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

            //읽기 스레드 : 클라이언트에게 온 메세지만 수신 함
            Thread readerThread = new Thread(() -> {
                String clientMessage;
                try {
                    while ((clientMessage = reader.readLine()) != null) {
                        if ("up".equalsIgnoreCase(clientMessage)){
                            clientMessage = "⬆️";
                        }
                        System.out.println("[클라이언트 메세지]" + clientMessage);
                        if ("exit".equalsIgnoreCase(clientMessage)) {
                            System.out.println("클라이언트가 종료를 원합니다");
                            break;
                        }
                    }
                } catch (IOException e) {
                    // throw new RuntimeException(e);
                    System.err.println("클라이언트가 강제로 연결을 끊었습니다");
                }
            });


            //쓰기 스레드 : 키보드에서 값을 입력받아서 클라이언트에게 전달

            Thread writerThread = new Thread(() -> {
                String serverMessage;
                try {
                    while ((serverMessage = keyboardReader.readLine()) != null) {
                        if ("exit".equalsIgnoreCase(serverMessage)) {
                            writer.println(serverMessage);
                            System.out.println("서버에서 종료했습니다");
                            break;
                        }
                        if ("up".equalsIgnoreCase(serverMessage)){
                            serverMessage = "⬆️";
                        }
                        writer.println("[서버] 응답 메세지 : " + serverMessage);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            readerThread.start();
            writerThread.start();

                //메인 스레드에게 내가 종료 될떄까지 기다려
                readerThread.join();
                writerThread.join();



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
