package client_socket.ch01;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile2 {
    public static void main(String[] args) {
//192.168.7.51
        try (Socket socket = new Socket("127.0.0.1", 5000)) {

            System.out.println("------서버 연결 완료-------");

            //쓰기 스트림 (클라이언트 --> 서버)
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            //읽기 스트림 (클라이언트 <-- 서버)
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            InputStream is = socket.getInputStream();
            // 서버측으로 쓸 메세지
            writer.println("하세요 서버야 안녕");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("assets/v.txt"));

            //서버측에 받을 메세지
            int responseMessage;
                while ((responseMessage = reader.read()) != -1) {
                    bos.write(responseMessage);
                }
                bos.flush();
                bos.close();

            //서버에서 데이터 보낸떄 까지 블로킹
            System.out.println("서버 응답 : " + responseMessage);


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
