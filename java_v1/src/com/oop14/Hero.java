package com.oop14;

public class Hero {

    String name;
    int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void attack(Hero hero1,Hero hero2) {
        System.out.println(hero1.name+ "가 " + hero2.name + "을 공격 했습니다.");
    }
}
