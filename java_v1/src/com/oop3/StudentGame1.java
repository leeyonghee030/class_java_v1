package com.oop3;

public class StudentGame1 {

    public static void main(String[] args) {
        //객체 생상
        Student s1 = new Student();

        // 참조 변수르 사용해서 객체에 접근하고 값 할당
        s1.studentId = 1;
        s1.studentName = "티모";
        s1.address = "푸른언덕";

        // 생선된 객체의 동작을 호출
        s1.study();
        s1.breakTime();
        s1.showInfo();
        s1.test();
        s1.cleaning();

        //중요 매소드란?
        //객체의 기능을 구현하기위해 해당 클래스 내부에 구현되는 함수
        //메소드는 함수와 다르게 멤버 변수를 활용해서 기능을 구현한다.
        System.out.println("____________");

        Student s2 = new  Student();
        s2.studentName = "가렌";
        s2.studentId = 2;
        s2.address = "붉은언덕";

        s2.test();
        s2.cleaning();
        s2.showInfo();

    }
}
