package com.oop7;

public class Bus {

    private int busNumber;
    private int money; //요금

    public Bus() {}

    public Bus(int busNumber, int money) {
        this.busNumber = busNumber;
        this.money = money;
    }

    //버스타기
    public boolean take(int pay) {
        if (pay >= money) {
            return true;
        } else {
            return false;
        }
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int getMoney() {
        return money;
    }
}
