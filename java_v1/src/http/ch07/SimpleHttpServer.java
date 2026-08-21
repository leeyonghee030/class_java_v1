package http.ch07;

//순수 자바 로 만드는 HTTP서버

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executors;

/// 등장 클래스
/// HttpServer : 포트를 열고 연결을 받는 것을 담당
/// HttpHandier :  특정 경로의 처리 로직을 담당
/// HttpExchange : 요청 하나의 내용과 응답 처리를 담당하는 클래스
/// 요청이 들어올떄 마다 서버가 새로만들어 handle() 에 넘겨주고 끝나버린다
///
/// socket VS HttpExchange
///
///  getInputStream()   getRequestBody()
///  getOUtputStream()   getResponseBody()
///  직접 파싱 했다        getRequestMethod()
///  직접 파싱 했다        getRequsetURL()
///
/// 즉 소켓은 바이트가왔다 까지만 알려주고
/// HttpExchange 그 바이트를 HTTP 규칙 대로 해석해 둔 결과까지 들고왔따
public class SimpleHttpServer {

    private static final int PORT = 8080;
    private static int THREAD_POOL_SIZE = 10; //미리 생성 해두는 스레드 갯수의미

    static final String TYPE_HTML = "text/html; charset=UTF-8";
    static final String TYPE_TEXT = "text/plain; charset=UTF-8";
    static final String TYPE_JSON = "application/json; charset=UTF-8";
    // 서버는 브라우저한테 데이터 보낼떄 (HTML형식, 일반텍스트, Json형식 타입 등등)
    // 형식에 맞게 미리 약속이 되어있다 그거에 의미하는약속된 형식

    public static void main(String[] args) throws IOException {

        //1. HTTP 서버 객체 생성
        // 지금 까지 쓰던 ServerSocket(8080) 과 같은 일을 한다
        // HttpServer.create(new InetSocketAddress(PORT),0);
        //둘다 이 포트로 들어오는 연결을 내가 받겠다 라고 운영 체제에 등록하는 일이다
        // 차이는 받는 바이트를 누가 해석하는냐 뿐이다.


        // 첫번쨰 인자 :  InetSocketAddress = 주소 + 포트번호
        // new InetSocketAddress("127.0.0.1",PORT) 그 주소로 들어온 요청만 받는다
        // 즉 외부에서 오는 요청은 안받음

        // 두번쨰 인자 : 블로킹 , 대기 큐 크기
        // 서버가 아직 처리하지 못한 연결이 줄서서 기다리는 자리수다
        // 0 이나 음수를 주면 현재 코드에서는 아마 내부적으로 50으로 바꿔서 처리를 한다
        // 대기큐보다 많은 데이터 수가 들어오면 어떻게돼?
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);

        // 2. 경로와 담당 핸들러 연결
        // /signup <-이러한 (약속) 경로가 들어오면 어떤 메서드(핸들러),객체를 실행해 라고 미리 정의하는거
        // 등록 순서는 상관이 없다. 요청이 오면 가장 길게 일치하는 경로가 선택된다
        // 즉 /api/users 요청이 들어오면 "/",와 "/api/users" 둘다 걸리지만 더 긴쪽이 이긴다.

        // 저급 경로 예시 http://localhost:8080/
        server.createContext("/", new HomeHandler());
        // 저급 경로 예시 http://localhost:8080/health
        server.createContext("/health", new HealthHandler());
        // 저급 경로 예시 http://localhost:8080/api/users
        server.createContext("/api/users", new userApiHandler());

//        3. 요청을 처리할 스레드 풀 지정 (HTTP 서버는 멀티 스레드 프로그램이라서 미리 생성할 스레드 지정)
        //매번 스레드를 생성하면 요청과 응답이 느려져서 미리 생성
        server.setExecutor(Executors.newFixedThreadPool(THREAD_POOL_SIZE));


        //4. 서버시작 (main은 여기사 끝나고, 서버는 별도 스레드에서 계속 된다)
        // main이 끝나도 프로그램이 종료되지 않는 이유는 HttpServer가 만든 스레드가 살아있기 떄문이다
        //멈추려면 종료 눌려야한다
        server.start();

        System.out.println("HTTP 서버 시작");

    }

    /// //////////////////
    //공통 메서드 정의

    // 응답을 보낸다
    static void sendResponse(HttpExchange exchange, int statusCode, String contentType, String bodyText)
            throws IOException {
        // 1. 보낼 데이터 (매개 변수 bodyText)
        // 2. 문자열을 바이트 배열로 바꾼다.
        byte[] bodyBytes = bodyText.getBytes(StandardCharsets.UTF_8);
        // 3. 응답의 종류를 헤더에 적는다 ( 응답 HTTP 메세지 )
        exchange.getResponseHeaders().set("Content-Type", contentType);
        // 4. 상태 코드와 본문 길이를 설정하며 헤더를 실제로 내보난다.
        exchange.sendResponseHeaders(statusCode, bodyBytes.length);
        // 5. 헤더가 나간 다음에야 본문 통로가 열린다.
        // getResonseBody() OutputStream 이므로 문자열이 아니라 바이트를 쓰고 있다.
        try (OutputStream out = exchange.getResponseBody()) {
            out.write(bodyBytes);
        }

    }

    //JSON으로 응답하는 경우는 다른 핸들러에서도 사용할수있어서 여기러 로직을 작성한다
    static void sendJson(HttpExchange exchange, int statusCode, Object data) throws IOException {
        //new Gson().toJson(data) 을 자바객체를 --> json문자열로 반환
        sendResponse(exchange, statusCode, TYPE_JSON, new Gson().toJson(data));
    }

    // 요청 본문을 문자열로 읽는 기능
    static String readRequestBody(HttpExchange exchange) throws IOException {
        StringBuffer requestBody = new StringBuffer();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(exchange.getRequestBody()
                        , StandardCharsets.UTF_8))) {

            String line;

            while ((line = reader.readLine()) != null) {
                requestBody.append(line);
            }
        }
        return  requestBody.toString();
    }
}
