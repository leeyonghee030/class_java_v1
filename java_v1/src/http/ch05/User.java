package http.ch05;

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

