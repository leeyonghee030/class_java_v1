package com.oop14;

public class Wizard extends Hero {

    public Wizard(String name, int hp) {
        super(name, hp);
    }

    public void freezing(Hero hero) {
        System.out.println(this.name +  "가 " + hero.name + "을 얼음마법 공격 했습니다.");
    }
}
