package com.oop8;

import com.oop9.Warrior;

public class WarriorMainTest1 {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("홍길동");
        Warrior warrior2 = new Warrior("일지매");

        //get,set메서드확인
        //피료에 의해서 멤버변수 상태값을 변경해보자.
        //객체의 상태 변경은 행위(메서드)를 통해 변경해야한다
        warrior.setLevel(3);
        warrior.setName("김부장");
    }
}
