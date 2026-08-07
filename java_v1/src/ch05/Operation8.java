package ch05;

/**
 * 조건 연산자(상항연산자)
 * 조건식 ? 결과1 : 결과2
 * 조건식에 결과값이 true 이면 결과1 반환 아니면 결과 2를 반환한다
 */

public class Operation8 {
    public static void main(String[] args) {
    //조건식
        int num = 7; // 7이라는 값이 홀수인지 짝수인지 판별해보자
        //조건식 ?
        char  result1 = (num % 2 == 0) ? '짝' : '홀';
        System.out.println("result1: " + result1); //false 홀

        boolean isOk = (5 > 3) ? true : false;
        System.out.println("isOk: " + isOk); // true

        // 두수중에 큰수를 max라면 변수에 담아보세요
         int max = (10 > 1) ? 10 : 1;
        System.out.println("max: " + max);

        int n1 = 100;
        int n2 = 300;

        int max2;
//        n1 과 n2 를 비교해서 너 큰 수를 max2 변수에 담는 코드를 작성하시오
//        max2 = (n1 < n2) ? n2 : n1;
        max2 = (n1 > n2) ? n1 : n2;
        System.out.println("max2: " + max2);




    }
}
