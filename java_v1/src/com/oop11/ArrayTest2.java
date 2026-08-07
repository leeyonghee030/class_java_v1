package com.oop11;

public class ArrayTest2 {

    public static void main(String[] args) {

        //문자열 사용 방법
        String s1 = "안녕";
        String s2 = new String("안녕");

        //문자열로 배열을 사용해보자
        String[] names = new String[5];

        //인덱스 연산자 활용하여 값을 초기화
        names[0] = "홍길동";
        names[1] = "이순신";
        names[2] = "장보고";
//        names[3] = "장영실";
        names[4] = "허균";

        System.out.println(names); //주소값 출력 [][][][][]
        System.out.println(names[0]);
        System.out.println(names[1]);

        //인덱스 연산자를 통해서 값을 수정
        names[0] = "Mr Kim";
        names[1] = "Mr Na";

        //인덱스 연산자를 통해서 값을 삭제 String <--값이 없음 null
        names[0] = null;
        names[2] = null;


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        System.out.println("배열에 길이 : " + names.length);
        System.out.println("인덱스에 길이 : " + (names.length -1));
        // length 변수를 이용해 배열의 길이를 구할수있다








    }
}
