package ch05;


public class Operation6 {
    public static void main(String[] args) {

       //논리 연산자 (&&, || , !)
        int num1 = 100;
        int num2 = 200;

        // 1. 논리 곱 (&&)
        boolean flag1 = (num1 > 0 ) && (num2 > 0);
        System.out.println("flag1:" + flag1); //true

        boolean flag2 = (num1 > 0 ) && (num2 < 0);
        System.out.println("flag2:" + flag2); //false

        //2.논리합 (||)
        boolean flag3= (num1 > 0 ) || (num2 > 0); //true
        System.out.println("flag3:" + flag3); //true

        boolean flag4= (num1 < 0 ) || (num2 < 0); //false
        System.out.println("flag4:" + flag4); //false

        //정리
        // 놀리곱 - 둘다 참일 뗴 true
        // 놀리합 - 둘 하나라도 참일 뗴 true 반환

        //부정 논리 연산자 확인
        System.out.println(!true); //false
        System.out.println(!false); // true

    }
}
