package io.ch02;

import java.io.IOException;

public class KeyboardInputTest2 {

    public static void main(String[] args) throws IOException {
        //in - 한번에 여러 데이터를 받을 수 있는 기능을 구현 (Scanner 대신 )
        System.out.println("알파벳 여러개을 쓰고 enter를 누르세요");

        int i;
        //
        while (((i = System.in.read()) != '\n')) {
//            System.out.println(" i :" + i);
            System.out.print((char)i);


        }

    }
}
