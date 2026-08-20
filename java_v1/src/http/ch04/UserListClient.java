package http.ch04;
//{
//"id": 1,
//"name": "Leanne Graham",
//"username": "Bret",
//"email": "Sincere@april.biz",
//"address": {
//"street": "Kulas Light",
//"suite": "Apt. 556",
//"city": "Gwenborough",
//"zipcode": "92998-3874",
//"geo": {
//"lat": "-37.3159",
//"lng": "81.1496"
//}
//},
//"phone": "1-770-736-8031 x56442",
//"website": "hildegard.org",
//"company": {
//"name": "Romaguera-Crona",
//"catchPhrase": "Multi-layered client-server neural-net",
//"bs": "harness real-time e-markets"
//}
//},

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

//https://jsonplaceholder.typicode.com/users
public class UserListClient {
    public static void main(String[] args) {
        String urlStr = "https://jsonplaceholder.typicode.com/users";
        HttpURLConnection connection = null;

        try {
            URL url = new URL(urlStr);
             connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if (responseCode != 200) {
                System.out.println("응답실패");
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            Gson gson = new Gson();

            TypeToken<List<User>> typeToken = new TypeToken<>(){};
            List<User> userList = gson.fromJson(sb.toString(),typeToken.getType());

            System.out.println(userList.size());


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
