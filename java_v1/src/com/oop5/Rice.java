package com.oop5;

import java.net.SocketTimeoutException;

public class Rice {

    String menu;
    int amount; //양

    public Rice(String menu, int amount) {
        this.menu = menu;
        this.amount = amount;
    }

    //  먹은 만큼 줄어든다 성공하면 true, 싶해 false 리턴

    boolean reduce(int eatAmount) {
        if (amount >= eatAmount) {
            amount -= eatAmount;
            return true;
        }
        return false;
    }

    //showInfo
    void showInfo() {
        System.out.println("menu : " + menu);
        System.out.println("amount : " + amount);
    }
}
