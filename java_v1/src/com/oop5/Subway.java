package com.oop5;

public class Subway {
    int lineNumber;
    int count;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    //승객 태운다
    void take(int pay) {
        money += pay;
        count++;
        System.out.println(lineNumber + "호선 지하철 탑니다");
    }
    //정보보기
    void showInfo() {
        System.out.println(lineNumber + "호선 입니다");
        System.out.println("현재 승객 수 : " + count);
        System.out.println("현재 수익 금액 : " + money);
    }

}
