package ch05;

/**
 * 부호 연산자
 * 단항 연산자, 변수에 부호를 변경한다
 * 단. 변수안에 들어가 있는 값의 부호를 변경하려면 대입연사자와 함께 사용해야한다.
 */
public class Operation1 {

    public static void main(String[] args) {

        int intData = 100;
        System.out.println(+intData);
        System.out.println(-intData);
        System.out.println("___________");
        // 주의 부호 연산자는 실제 변수에 값을 변경하는 개념이 아니다
        System.out.println("intData:" + intData);

        //그러면 실제 변수에 값을 변경하려면 대입연사자와 함꼐 사용해주어야한다
        intData = -intData; //부호 연산자 사용해서 새로 대입하는 개념이다.
        System.out.println(intData);

        //3, 7896456 값이 홀수인지 짝수 인지 화면에 1 또는 0으로 표시하는 코드를 출력하세요
        System.out.println("짝수:0 홀수:1: "+ 7896456 % 2); // 0 이면 짝수로 판별 할수있다

    }
}
