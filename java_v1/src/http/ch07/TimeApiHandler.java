package http.ch07;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.time.LocalDateTime;

public class TimeApiHandler implements HttpHandler {


    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            SimpleHttpServer.sendJson(exchange,200,new Time());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            exchange.close();
        }
    }
}
