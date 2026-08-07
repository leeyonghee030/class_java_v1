package com.oop14;


public class CMainTest {

    public static void main(String[] args) {

        C c = new C();
//      물려 받기는 하지만 접근제어 지시자에 따라서 접근을 할수있거나 못할수있다
        // protecteddms 자식 클래스에서 접근할수있게 허용한다

        c.age = 10;
        c.height = 100;
        c.weight = 200;
        c.level =1 ;
        c.nickName = "C";
        c.name = "sd";
        System.out.println(c.age);
        System.out.println(c.height);
        System.out.println(c.weight);

        c.showInfo();
    }
}
