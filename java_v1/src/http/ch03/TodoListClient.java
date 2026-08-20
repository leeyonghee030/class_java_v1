package http.ch03;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class TodoListClient {

    public static void main(String[] args) {

        // HTTP 통신을 활용한  조회
        String urlString = "https://jsonplaceholder.typicode.com/todos";

        HttpURLConnection conn = null;
        try {

            URL url = new URL(urlString);

            conn = (HttpURLConnection) url.openConnection();

            //HTTP 프로토콜 설정 (GET요청)
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode(); // 통신 진행
            System.out.println("응답코드 확인 : " + responseCode);

            if (responseCode != 200) {
                System.out.println("요청 실패");
                return;
            }

            //응답 본문 (HTTP메서지 Body 영역에서 추출)
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
//                System.out.println(sb);

                //GSON 라이브러리 활용
                //formJson() 메소드로 파싱을 편하게 가능 + 객체만들기 편함
                Gson gson = new Gson();
                //Json Array 형태 파싱처리

                //formJson(문자열 변환타입(여기에 사용됨))
                // 1.타입 지정
                TypeToken<List<Todo>> typeToken = new TypeToken<List<Todo>>() {
                };
                //설꼐된 타입에 실제 파싱 처리
                List<Todo> todoList = gson.fromJson(sb.toString(), typeToken.getType());

                System.out.println("전체 개수 : " + todoList.size());


            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                if (conn != null) {
                    conn.disconnect();
                }
            }
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}