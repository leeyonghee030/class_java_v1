package useful.ch04;

public class Password {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) {
            throw new PasswordException("비밀번호는  null 일 수 없습니다");
        }else if (password.length() < 4 ){
            throw new PasswordException("비밀번호는  4 글자 이상이어야 합니다");
        }

        this.password =password;
    }

    public static void main(String[] args) {
        Password password = new Password();
        try {
            password.setPassword("123");
        } catch (PasswordException e) {
            e.getMessage();
        }
        System.out.println("비 정상 종료 안됨");
    }

}

//1. 사용정의 예외 클래스를 설계
//2. message를 받아서 출력할수있도록 설계
//3. setPassword에 오류 안내 메서지를 직접 만들어 둔  예외 클래스로 활용하시오
//4. 예외 클래스 이름ㅇ느 PasswordException 으로 설계
