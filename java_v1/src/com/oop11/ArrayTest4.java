package com.oop11;

public class ArrayTest4 {

    public static void main(String[] args) {

        //문자열 사용 방법
        String s1 = "안녕";
        String s2 = new String("안녕");

        //문자열로 배열을 사용해보자
        String[] names = new String[10];

        //인덱스 연산자 활용하여 값을 초기화
        names[0] = "홍길동";
        names[1] = "이순신";
        names[2] = "장보고";
        names[3] = "장영실";
        names[9] = "허균";

        //배열에 길이와 요소의 개수는 동일하지않다.
        //
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i]);
            }
        }


    }
}
