package com.oop13;

public class Calculator {

    //메서드 오버로딩 : 같은 이름에 메서드를 여러개 정의 하는것을 말한다.

    //정수형 덧셈 메서드
    public int add(int a, int b) {
        return a + b;
    }

    //실수형 덧셈 메서드
    public double add(double a, double b) {
        return a + b;
    }

    //세 정수의 덧셈 메서드
    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {

        //println 메서드 오버로딩 기법이다
        System.out.println(1);
        System.out.println(0.1);

        //메서드 오버로딩 기법이 없다면 아마 이렇게 호출 되었을 겁니다
//        printlnInt()
//        printlnDouble()
    }

}
