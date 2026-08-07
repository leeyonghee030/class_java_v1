package com.oop10;

import java.util.Random;

public class Calculator {

    static int aa = 2;

    //일반 인스턴스 메소드(객체를 생성해야 사용 가능)
    //-사실 static 메소드 만드는거 권장
    public  int multiply(int n1, int n2) {
        return  n1 * n2;
    }

    //static 메소드 (객체 생성없이 클래스 이름.메소드이름() 사용가능)
    //객체마다 결과가 달라질 이유가 없으므로 static 함수가 적합하다
    // ??멤버변수 사용 불가
    public static int add(int n1, int n2) {
        return n1 * n2;
    }
    //사실 우리는 이미 static을 사용하고 있었음.
    public static void main(String[] args) {
        System.out.println("여기에서 별도로 main 실행가능");

        Calculator.add(1,2);
        //가능한이유는 static메오리 영역에 위치하고있어 사용가능

        //자바 표준 API 사용해 보기
        //1. 클래스이름.메소드 라서 static 메소드이다.
        double ren = Math.random(); //이게먼지?
        System.out.println("ren : " + ren);

        //자바 표준 API 사용해보기 - Random 사용해보기
        Random random = new Random(); // 이게먼지?
        int ranInt = random.nextInt();
        System.out.println("renInt : " + ranInt);

        int ren45 = random.nextInt(0,45)+1;
        System.out.println("ren45 : " + ren45);

    }

}
