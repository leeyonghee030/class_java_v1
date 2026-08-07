package useful.ch04;

public class ThrowsHandling2 {

    public static void main(String[] args) {


        Calc2 calc = new Calc2();

        try {
            calc.divide(100,0);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }

    }
}

class Calc2 {
    public int divide(int n1, int n2) throws DivideByZeroException {
        System.out.println("사용자 정의 예외 클래스 사용하는 방법");
        int result = 0;
        try {
            result = n1 /n2;
        }catch (Exception e) {
            throw new DivideByZeroException("0을 어떤수로 나눌 수 없음");
        }
        return result;
    }
}