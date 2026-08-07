package ch03;

import java.sql.SQLOutput;

public class Comstant1 {

    public static void main(String[] args) {
        int num = 10;
        num = 101;

        //상수 사용해보기
        //final 키워드를 사용하고 변수명에
        // 이름을 작성할떄 대문자, _ 를 사용하는게 권장사항이다
        final int MAX_NUM = 100; // 한번 값이 변경되면 다시 값을 변경할수없다.
        //MAX_NUM =1;

//       원주율을 상수로 선언 해보자
        final double PI = 3.14159;
        final int RADIUS = 5;
        //  원의 반지름을 구하는 공식

        //준비물:
        // 원에 둘레를 계산해보자 2*PI*RADIUS
        // 원에 면적을 계산해보자 RADIUS * RADIUS * PI

        double permiter = 2 * PI * RADIUS;
        System.out.println("원에 둘레:" + permiter);
        double area = RADIUS * RADIUS * PI;
        System.out.println("원에 넓이:" + area);

    }
}
