package com.oop10;

public class CardCompany {

    String name;
    static String companyName = "카카오카드";
    static int empSeriaNumber = 1000;

    public CardCompany(String name) {
        this.name = name;
        empSeriaNumber++;
    }

    public void showInfo() {
        System.out.println("이름 " + name);
        System.out.println("카드사 " + companyName);
        System.out.println("카드번호 " + empSeriaNumber);
    }


}
