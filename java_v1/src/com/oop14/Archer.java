package com.oop14;

public class Archer extends Hero{

    public Archer(String name, int hp) {
        super(name,hp);

        //부모 클래스의 사용자 정의 생성자 있다면 반드시 부모 생성자를 호출할수있다
    }


    public void fireArrow(Hero hero) {
        System.out.println(this.name +  "가 " + hero.name + "을 불화살공격 했습니다.");
    }
}
