package http.ch07;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/// /api/users -
///  GET: 목록 조회한다
///  POST : 새 사용자를 등록한다
public class userApiHandler implements HttpHandler {

    //실제로는 DB에 저장한다. 지금은 메모리 리스트로 대신 한다 즉 서버를 껏다 키면
    // 내용이 다 사라진다
    private static final List<User> userList = new ArrayList();

    private static int nextId = 1;

    //static 초기화 블록
    //클래스가 메모리에 처음 올라갈 떄 딱 한번만 실행되는 코드 묶음
    //이름도 없고 직접 호출하지않는다 . Jvm이  알아서 실행한다
    static {
        //샘플 객체만들기
        addUser(new User("홍길동", "a@naver.com"));
        addUser(new User("철수킴", "c@naver.com"));
    }


    //동기화 시켜야함
    private static synchronized int addUser(User user) {
        user.setId(nextId); // 최초 1 들어감
        nextId++;
        userList.add(user);
        return user.getId();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        //http://localhost:8080/api/users

        try {
            // /api/users 경로 + Method(동잗정의) -GET,POST
            //즉, 경로가 같아도 Method가 다르면 하는 일이다르다
            //그래서 이 핸들러 안에서 메서드로 한번더 갈라준다.

            String method = exchange.getRequestMethod();

            if (method.equals("GET")) {
                handleGet(exchange);
            } else if (method.equals("POST")) {
                handlePost(exchange);
            } else {
                //405를 보낼떄는 어떤 메서드가 되는지 Allow헤더로 알려주는것이 규칙이다
                exchange.getResponseHeaders().set("Allow","GET, POST");
                SimpleHttpServer.sendResponse(exchange,405,SimpleHttpServer.TYPE_TEXT,"지원하지 않는 메서드입니다");
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            exchange.close();
        }
    }
    ///
    /// 목록을 복사해서 다시 돌려준다.
    /// 왜 복사하는가?
    /// 원본을 그대로 넘기면, Gson이 Json으로 바꾸면서 순회 도중에
    /// 다른 스레드가 POST로 add 요청을 만약 한다면 중간에 예외가 발생한다
    /// 즉, 순회 도중에 ArrayList 크기가 바뀌면 예외를 던진다
    private ArrayList<User> copyUserList() {
        return new ArrayList<>(userList);
    }

    /// GET : 사용자 목록을 조회, (HTTP 메서지 body 없음)
    /// List<User>를 그대로 넘기면 Gson이 JSOn 배열로 바꿔준다.
    ///
    private void handleGet(HttpExchange exchange) throws IOException {
        SimpleHttpServer.sendJson(exchange,200,copyUserList());
    }

    ///POST 요청: 요청 본문이(HTTP 요청메세지 바디) 있다
    ///
    private  void handlePost(HttpExchange exchange) throws IOException {
        //1. HTTP 요청 본문 바디를 읽어야 한다
        String requestBody = SimpleHttpServer.readRequestBody(exchange);
        System.out.println("포스트 요청[api/users] 받은 본문확인 : "+requestBody);

        //2. JSON 객체를 User객체로 바꾼다
        //주의
        User user;
        try {
            user = new Gson().fromJson(requestBody, User.class);
        } catch (JsonSyntaxException e) {
            SimpleHttpServer.sendResponse(exchange,400,
                    SimpleHttpServer.TYPE_TEXT,"JSON 형식이 올바르지 않습니다");
            return;
        }

        //3. 검증
        if (user == null || user.getName() == null || user.getName().isBlank()) {
            SimpleHttpServer.sendResponse(exchange,400,SimpleHttpServer.TYPE_TEXT,"name은 반드시 있어야합니다");
            return;
        }

        if (user.getEmail()== null) {
            user.setEmail("");
        }

        //4. 저장 처리 id 값은 고정값이 아니라서 저장 결과를 다시 돌려준다
         int newId = addUser(user);

        //5. 등록 성공은 200 대신 201로 Created로 응답을 한다
        SimpleHttpServer.sendJson(exchange,201,user);

    }


}
