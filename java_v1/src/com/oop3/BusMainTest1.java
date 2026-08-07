package com.oop3;

public class BusMainTest1 {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Student s1 = new Student();

        s1.studentName = "가렌";

        //학새이 버스를 타다
        bus.busNum = 1;
        bus.busColor = "빨강";

        bus.driving();
        bus.findColor();
        bus.driving(s1);

    }
}
