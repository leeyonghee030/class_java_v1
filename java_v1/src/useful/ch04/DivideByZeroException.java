package useful.ch04;

public class DivideByZeroException extends RuntimeException {

    //사용자 정의 예외 클래스 만들기

    private String msg;

    public DivideByZeroException(String msg) {
        super(msg); //RuntimeException
        // 생성자에 우리가 작성한 메세지 넣을수있도록 설계 e.getMessage();
        this.msg = msg;
    }





}
