package com.oop5;

public class Bus {
    int busNumber;
    int count;  //0
    int money;
//    double d; 0.0
//    boolean s; false

    //멤버 변수를 생성자를 통해서 초기화하지 않는다면 자동으로 기본값을 가지게된다
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    //    사람을 태우다.
    void take(int pay) {
        count++;
        money += pay;
        System.out.println("버스를 탔습니다");
    }


    //    현자 버스의 상태를 보여주는 메소드
    void showInfo() {
        System.out.println("버스 번호 : " + busNumber);
        System.out.println("현재 승객 수 : " + count);
        System.out.println("현재 수익 금액 : " + money);
    }

//    돈을받다


}
