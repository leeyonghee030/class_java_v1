package client_socket.ch05;

import java.io.IOException;
import java.net.Socket;

public class ChatClient extends AbstractClient {


    public ChatClient(String name) {
        super(name);
    }

    @Override
    protected void connectToServer() {
        //서버 아이피 지정
        try {
            setSocket(new Socket("localhost", 5002));
        } catch (IOException e) {
            System.err.println("서버측 연결 도중 예외발생(IP,PORT 주소확인)");
        }
    }

    public static void main(String[] args) {

        new ChatClient("홍길동").run();
    }




}
