package http.ch07;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

/// GET 요청 처리
///  만드는 규칙
///  1.  HttpHandler 인터페이스를 구현한다
///  2. handler(HttpExchange) 메서드 하나를 재정의 한다
///  3. main애서 createContext 로 경로를 짝지어 등록한다
///

public class HomeHandler implements HttpHandler {

    private static final String HOME_PAGE = """
            <!doctype html>
            <html lang="ko">
              <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>나의 HTTP 서버</title>
              </head>
              <body>
                <h1 style = 'color:red'>내가 자바로 만든 수순 HTTP 서버</h1>
                <ul>
                  <li><a href="/health">서버 상태 확인</a></li>
                  <li><a href="/api/users">사용자 목록(Json)</a></li>
                </ul>
              </body>
            </html>
            """;

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // / <-- 이경로 를 처리하는 핸들러
        //주의할점
        // "/"로 등록한 핸들러는 다른 핸들러가 맟지않은 모든 경로를 받아요
        // 그래서 정확히 "/" 인지 직접 확인하고 아니묜 404 를 돌려줘야한다
try {
    String path = exchange.getRequestURI().getPath();

    if (!path.equals("/")) {
        SimpleHttpServer.sendResponse(exchange,
                404, SimpleHttpServer.TYPE_TEXT, "404 Not Found : " + path);
        return;
    }
    //Content-Type 을 text/html로 보내야 브라우저가 HTML로 해석한다
    // text-plain으로 하면 응답 제대로안됨
    SimpleHttpServer.sendResponse(exchange,200,SimpleHttpServer.TYPE_HTML,HOME_PAGE);



}finally {
    exchange.close();
}

    }
}
