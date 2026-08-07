package com.oop4;

public class Bus {

    int busNumber;
    int money;

    // public Bus() {} 기본 생성자

    //사용자 정의 생성자
    public Bus(int number) {
        busNumber = number;
    }

    public Bus(int number, int money) {
        busNumber =number;
        money = money;
    }

    //셍성자는 여러개 만들 수 있다 (생성자 오버로딩)


}

