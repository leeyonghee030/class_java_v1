package http.ch04;

import com.google.gson.Gson;

import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class UserClient {

    public static void main(String[] args) {
        ////https://jsonplaceholder.typicode.com/users/1
        String urlStr = "https://jsonplaceholder.typicode.com/users/1";
        HttpURLConnection connection = null;
        try {
            URL url = new URL(urlStr);
             connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            System.out.println("응답 코드 : " + responseCode);

            if (responseCode != 200) {
                System.out.println("응답 실패");
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            Gson gson = new Gson();


             User user = gson.fromJson(sb.toString(),User.class);

            System.out.println(user.toString());



        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
