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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//https://jsonplaceholder.typicode.com/users/1
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;


    @Data
    static class Address {;
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private Geo geo;

        @Data
        static class Geo {;
            private String lat;
            private String lng;
        }
    }


    @Data
    static class Company {;
        private String name;
        private String catchPhrase;
        private String bs;
    }
}

