package http.ch07;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/// 데이터를 담는 클래스 DTO
///
/// Gson은 자바 객체와 Json 문자열을 서로 바꿔 주는 라이브러리 이다
/// 그럴려면 먼저 담을 그릇 즐즉 클래스 객체가 있어야한다
///
/// 필드 이름이 곧 JSON의 키가 된다
/// {"id" : i, "name" : "홍길동", "email" : "abc@naver.com"}
///
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private  String name;
    private  String email;

    public User (String name, String email) {
//        setId(id+=1);
        this.name = name;
        this.email = email;
    }
}
