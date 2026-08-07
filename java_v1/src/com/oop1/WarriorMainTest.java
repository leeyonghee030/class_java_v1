package com.oop1;

import java.util.SortedMap;

public class WarriorMainTest {
    //코드 실행의 진입점 (메인함수) -JVM - stack(메모리)
    public static void main(String[] args) {
        //new - 키워드, Warrior() <- 생성자 호출
        Warrior warrior = new Warrior(); //인스턴스화
        //Warrior = w1 //Warrior 변수선언시 만들어지지않으걸하면 오류

        warrior.name = "티모";
        warrior.height = 10.5;
        warrior.health = 100;
        warrior.attackPower = 70;
        warrior.defensePower = 30;
        //참조변수에 접근해서 값을 할당해보자
        //객체의 접근은 .연산자로 할수있다
        System.out.println(warrior);

        System.out.println("이름:" + warrior.name);
        //주소값으로 필드로가서 필드에 name변수값을 주는거 ?
        System.out.println("키:" + warrior.height);
        System.out.println("체력:" + warrior.health);
        System.out.println("공격력:" + warrior.attackPower);
        System.out.println("방어력:" + warrior.defensePower);

        System.out.println("_________________");
        //warrior 타입에 객체를 생성해서 해당 상태값을 입력하고
        //화면에 출력하시오

        Warrior warrior2 = new Warrior();
        warrior2.name = "호랑이";
        warrior2.height = 180.5;
        warrior2.health = 100;
        warrior2.defensePower = 10;
        warrior2.attackPower = 100;

        System.out.println(warrior2.name);
        System.out.println(warrior2.height);
        System.out.println(warrior2.attackPower);
        System.out.println(warrior2.defensePower);
        System.out.println(warrior2.health);


    }
}
