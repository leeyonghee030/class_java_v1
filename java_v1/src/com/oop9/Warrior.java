package com.oop9;

public class Warrior {

    private String name;
    private int level;
    private int hp;

    public Warrior(String name) {
        this.name = name;
        level = 1;
        hp = 100;
    }

    //일반 메서드
    public void levelUp() {
        //멤버 변수 level 1증가 멤버 변수 + 50
        level++;
        hp += 50;
        System.out.println(name + "의 현재 레벨은 " + level + "입니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level <= 0) {
            System.out.println("0보다 작은 값을 입력할 수 없습니다.");
            return;
        }
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            System.out.println("0보다 작은 값은 입력할수없습니다");
            return;
        }
        this.hp = hp;
    }
}
