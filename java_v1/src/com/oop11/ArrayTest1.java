package com.oop11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest1 {

    public static void main(String[] args) {

        //배열(Array) - 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입이다
        //즉 ,변수가 하나의 데이터를 저장하기 위한것이라면
        //배열은 여러개의 데이터를 하나의 변수에 저장하기위한것

        //문법, 왜 사용하는가?
        //중요 -배열 선언이 아닌 사용 할려면 반드시 먼저 몇개의 데이터가
        //들어갈지 배열의 길이를 지정해야 사용할수있다
        int[] intArr1 = new int[3]; // [][][]  이 방법을 많으씀
        int intArr2[] = new int[3]; // [][][]

        intArr1[0] = 10;
        intArr1[1] = 20;
        intArr1[2] = 30;
        // [10][20][30]
//        intArr1[3] = 40; // 런타임 오류 발생 배열에 길이를 벗어남

        //배열 사용 방법 2번쨰
        //배열 선언 과 동시에 값 까지 초기화
        int[] gradArray = new int[]{1,2,3};  // [1][2][3]
        int[] gradArray2 = {1,2,3,4}; // new int[] <-- 생략가능

        // 5개의 길이를 가지는 double 타입의 배열을 선언해보자
        double[] dArr2 = new double[5];
        double[] dArr = {0.1,0.2,0.3};

        dArr2[0] = 0.1; //[0.1][][][][]
        dArr2[1] = 0.2; //[0.1][0.2][][][]
        //tip 배얄에 길이와 인덱스의 크기는 다르다 즉,인덱스 크기는 n-1이다
        //배열의 길이가 30, 인덱스 크기는 n -1 = 29(인데스 크기)
        //인덱스의 시작은 0번부터 시작한다

        //문제1
        //char 배열 2개 선언해서 초기화하는 코드 작성
        char[] cArr;
        cArr = new char[2];

        cArr[0] = 'a';
        cArr[1] = 'b';


        //문제2
        //boolean 배열 3개 선언해서 초기화 하는 코드 작성
        boolean[] bArr = {false, true, false};

        System.out.println(cArr);
        System.out.println(bArr);





    }
}
