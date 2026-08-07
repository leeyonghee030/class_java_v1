package com.oop7;

public class Student {

    private String name;
    private int money;
    private int foodAmount;

    public Student() {
    }

    public Student(String name, int money, int food_amount) {
        this.name = name;
        this.money = money;
        this.foodAmount = food_amount;
    }

    Rice rice = new Rice();
    Bus bus = new Bus();
    Subway subway = new Subway();

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("용돈 : " + money);
        System.out.println("먹는양 : " + foodAmount);
    }

    //먹는다

    public void eatMenu(int foodAmount, Rice rice) {
        if (rice.eat(foodAmount)) {
            System.out.println(name + "이 " + rice.getMenu() + "을 먹었습니다.");
        } else {
            System.out.println(rice.getMenu() + "양이 부족해 먹지 못했습니다");
        }
    }

    // 버스 타기
    public void takeBus(int getMoney, Bus bus) {
        if (bus.take(getMoney)) {
            System.out.println(name + "이 " + bus.getBusNumber() + "번 버스를 탔습니다");
            money -= bus.getMoney();
        } else {
            System.out.println("돈이 부족합니다");
        }
    }

    //지하철 타기

    public void takeSubway(int getMoney, Subway subway) {
        if (subway.take(getMoney)) {
            System.out.println(name + "이 " + subway.getLineNum() + "호선 지하철을 탔습니다");
            money -= subway.getMoney();
        } else {
            System.out.println("돈이 부족합니다");
        }
    }


    public int getMoney() {
        return this.money;
    }

    public int getFoodAmount() {
        return this.foodAmount;
    }
}
