package com.oop7;

public class Rice {

    private String menu;
    private int amount;

    public Rice(){}

    public Rice(String menu, int amount) {
        this.menu = menu;
        this.amount = amount;
    }

    //밥 먹기
    public boolean eat(int eatAmount) {
        if (amount >= eatAmount) {
            amount -= eatAmount;
            return true;
        } else {
            return false;
        }
    }

    public String getMenu() {
        return this.menu;
    }

}
