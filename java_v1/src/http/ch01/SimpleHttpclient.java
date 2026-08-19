package http.ch01;

//이파일에서 HTTP 통신으로 접근할 서버 주소
//https://jsonplaceholder.typicode.com   <-- 서버주소
//                                    /todos/1 엔드 포인트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class SimpleHttpclient {

    public static void main(String[] args) {

        String baseURL = "https://jsonplaceholder.typicode.com";
        String urlString = baseURL + "/todos/2";
//        String urlString = "https://www.google.com/?hl=ko";
        //http: 프로토콜 암호화해서 값을 응답 요청 ?
        //이거 왜 따로하는거야 ? 확장을 위해?
        HttpURLConnection connection = null;


        try {
            // 1단계 : URI 로 파싱한 뒤 URL 객체로 변환
            URI uri = URI.create(urlString);
            URL url = uri.toURL();

            //connection이 무엇인가??
            //2단계 :연결 객체 생성 (아직 연결 되지않는다)
            connection = (HttpURLConnection) url.openConnection();

            //3단계 : 요청 방식 성정 (Method 등 설정)
            connection.setRequestMethod("GET");
            //GET 요청은 HTTP 요청 메세자 HTTP 바디 영역없는 요청이다
            //추가 설정도 셋팅 가능하다.
            connection.setRequestProperty("Accept", "application/json");

            //4단계 : 이 시점에서 실제로 TCP 연결 + 나의 요청 전송이 일어남
            int responseCode = connection.getResponseCode();
            System.out.println("응답 코드 (HTTP 상태코드) : " + responseCode);

            //방어적 코드 작석
            if (responseCode != 200) {
                //실제 응답의 본문의 getInputStream이 아니라
                //getErrorStream()으로 읽어야합니다
                System.err.println("요청 실패!");
                return;
            }

            //5단계 : 응답 본문 (HTTP 응답 메세지 바디 부분) 읽기
            //I/O 단원에서 배운 그래로 데이터 추출 +보조 스트림 버퍼 스트림 활용

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line).append("\n");
                }

                System.out.println("응답 내용 : ");
                System.out.println(response);
            }


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //6단계 연결종료
            //HttpURLConnection: 예전에 만들어져서 try-with-resources를 사용불가
            // 문법적으로 인터페이스 Closeable 구분하지 않아서 사용불가
            if (connection != null) {
                connection.disconnect();// 연결 끊기
            }
        }


    }
}
