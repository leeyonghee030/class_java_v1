package useful.ch04;

public class ThrowsHandling {

    public static void main(String[] args) {

        Calc calc = new Calc();
        //컴파일떄 에러 코드 안뜸(unchecked)
        //강제성으로 예외 에러뜸
        try {
            calc.divide(100,0);
        } catch (Exception e) {
            System.out.println("어떤 수를 0으로 나눌 수 없습니다");
        }


    }
}

//calc 클래스 설계
class Calc {
//예외처리를 사용하는 사랑이 직접 다룰수있도록 던질수있다
    //throws는 메서드 선언부에서 사용함
    //강제성이 벌생됨 (사용하는 측에서 반드시 처리해야되는)
    public int divide(int n1, int n2) throws DivideByZeroException {
        System.out.println("나누기 동작");
        return n1 / n2;
    }
}