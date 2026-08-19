package http.ch01;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.sql.Connection;

public class DeleteHttpClient {

    public static void main(String[] args) {

        //URL에 들어갈 주소 만들기
        String baseURL = "https://jsonplaceholder.typicode.com";
        String urlString = baseURL + "/todos/1";

        HttpURLConnection connection = null;
        //URL만들기

        try {
            URI uri = URI.create(urlString);
            URL url = uri.toURL();

            //connection만들어서 연결 객체생성
            connection = (HttpURLConnection) url.openConnection();

            //connection 요청 방식 성정 (Method 등 설정)
            connection.setRequestMethod("DELETE");


            //추가설정
            connection.setRequestProperty("Accept", "application/json");

            // 연결확인? 실제로 TCP 연결 + 나의 요청 전송이 일어남
            int responseCode = connection.getResponseCode();
            System.out.println("응답 코드 : " + responseCode);

            if (responseCode != 200){
                System.err.println("요청 실패");
                return;
            }


            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                System.out.println("응답 내용 : ");
                System.out.println(response);
            }



        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }


        //

    }
}
