package socket.ch05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public abstract class AbstractChatServer {

//    private static final int PORT = 5002;
//    private static Vector<PrintWriter> clientWriterList = new Vector<>();
    private ServerSocket serverSocket;
    private static Vector<PrintWriter> clientWriterList;

    public AbstractChatServer() {
    }

    public final void run() {
        connectToSoket();
        setupStreams();
        connectToClientHandler();
        startClientHandler();
    }




    protected abstract void connectToSoket();

    private void setupStreams() {
        clientWriterList = new Vector<>();
    }

    private void connectToClientHandler() {
    }

    private void startClientHandler() {
        try {
            while (true) {
                Socket socket = serverSocket.accept();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
