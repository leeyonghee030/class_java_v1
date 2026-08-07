package com.oop11;

public class ArrayTest3 {

    public static void main(String[] args) {

        //
        char[] alpahbets = new char[26];
        char ch1 = 'A';
        char ch2 = 'B';
        char ch3 = 'C';
        char ch26 = 'Z';

        alpahbets[0] = ch1;
        alpahbets[1] = ch2;
        alpahbets[2] = ch3;
        alpahbets[25] = ch26;

        System.out.println(alpahbets[0]);
        System.out.println(alpahbets[1]);
        System.out.println(alpahbets[2]);
        System.out.println(alpahbets[25]);


        System.out.println(alpahbets[3]);

        int forCount = 0;
        //배열은 반복문과 함꼐 많이 사용된다
         for (int i = 0; i < alpahbets.length; i++) {
             forCount++;
             System.out.println(alpahbets[i]
             );
         }
        System.out.println(forCount);

         //배열에 길이와 요소의 개수는 동일하지 않을수있다







    }
}
