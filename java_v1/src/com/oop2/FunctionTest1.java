package com.oop2;

public class FunctionTest1 {


    //두개의 정수 값을 인풋값으로 받아서 덧셈을 하고 그결과를 반환하는 일련에 작업 묶음
    static int add (int n1, int n2) {//함수의 선언문
       int result;
       result = n1 + n2;
       return result; //값을 반환한다.
    }
    //함수 사용하기
    public static void main(String[] args) {
        System.out.println("내가 설계한 함수를 사용해 보자");
        //함수이름 호출 그리고 모양 맞추기
        int result = add(10,20);
        System.out.println(result);
    }

}
