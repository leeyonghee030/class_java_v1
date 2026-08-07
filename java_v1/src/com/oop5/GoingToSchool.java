package com.oop5;
//객체를 사용하고 실행해보는 테스트 코드
public class GoingToSchool {

    public static void main(String[] args) {
        Bus bus133 = new Bus(133);
        Bus bus57 = new Bus(57);

        Subway subway1 = new Subway(1);
        Subway subway2 = new Subway(2);

        Student studentKim = new Student("홍길동", 10000);
        Student studentLee = new Student("이순신", 5000);

        Rice rice=new Rice("보리밥",1000);

        studentKim.takeBus(bus133);
        studentLee.takeBus(bus133);
        studentKim.showInfo();
        studentLee.showInfo();
        bus133.showInfo();

        studentLee.takeSubway(subway1);
        studentLee.showInfo();

        studentLee.eatRice(rice, 200);





    }
}
