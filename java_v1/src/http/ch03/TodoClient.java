package http.ch03;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class TodoClient {

    public static void main(String[] args) {

        // HTTP 통신을 활용한 단건 조회
        String urlString = "https://jsonplaceholder.typicode.com/todos/1";

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
                while ((line = reader.readLine()) != null){
                    sb.append(line);
                }
//                System.out.println(sb);

                //GSON 라이브러리 활용
                //formJson() 메소드로 파싱을 편하게 가능 + 객체만들기 편함
                Gson gson = new Gson();
                //fromJson(json 문자열,변환할 클래스)
                Todo todo = gson.fromJson(sb.toString(),Todo.class);

                System.out.println("파싱결과");
                System.out.println(todo.getId());
                System.out.println(todo.getUserId());
                System.out.println(todo.getTitle());
                System.out.println(todo.isCompleted());

                System.out.println(todo.toString());
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if(conn != null) {
                conn.disconnect();
            }
        }

    }
}
