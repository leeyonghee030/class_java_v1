package ch05;

/**
 *
 */
public class Operation2 {

    public static void main(String[] args) {
        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(5 / 3); // 결과 1이 나온 이유
        // 1.66666 -> int -> int 떨어지는 소수점 버려짐
        System.out.println(5 / (double)3); // 강제형변환으로 값을 가질수있음
        System.out.println(5 % 3);

        //문제
        //1. (12+3)/3을 화면에 출력해보세요 단 결과값을 변수에 담아서 출력
        double n1 = ( 12 + 3 )/ 3;
        System.out.println("(12 + 3) / 3 =" + n1);

        //2. (25 % 2)값을 화면에 출력해보세요
        System.out.println( 25 % 2 );
        //나머지 연산자는 해당하는 값이 홀수인지 짝수인지 판별할떄 유용하다
        //어떤 수를 2로 나누었을댸 나모지가 0이면 짝수 1이면 홀수 판별할수있다
    }
}
