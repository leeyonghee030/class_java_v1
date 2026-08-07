package com.oop14;

public class Warrior extends Hero{

    public Warrior(String name, int hp) {
        super(name,hp);
    }


    public void comboAttack(Hero hero) {
        System.out.println(this.name +  "가 " + hero.name + "을 더블공격 했습니다.");
    }
}
