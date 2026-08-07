package com.oop7;

public class Subway {
    private int lineNum;
    private int money;


    public Subway() {}
    public Subway(int lineNum, int money) {
        this.lineNum = lineNum;
        this.money = money;
    }

    public boolean take(int pay) {
        if (pay >= money) {
            return true;
        } else {
            return false;
        }
    }

    public int getLineNum() {
        return lineNum;
    }

    public int getMoney() {
        return money;
    }

}
