package com.oop5;

public class Student {
    String name;
    int money;


    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //학생이 버스를 탄다.
    void takeBus(Bus bus) {
        //자기에 일을 직접 스스로 해결한다.
        bus.take(1000);
        money -= 1000;
    }

    void takeSubway(Subway subway) {
        subway.take(1500);
        money -= 1500;
    }

    void eatRice(Rice rice, int eatAmount) {
        if (rice.reduce(eatAmount)) {
            System.out.println(name + "님이 " + rice.menu + "를 먹었습니다");
        } else {
            System.out.println("양이 부족해서 먹질 못했습니다");
        }
    }

    // 학생 정보 보여주는 기능
    void showInfo() {
        System.out.println(name + "님의 현재 남은 금액 : " + money);
    }
}
