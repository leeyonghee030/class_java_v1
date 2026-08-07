package com.oop3;

public class Student {
    //속성(필드), 클래스 영역에 선언된 변수를 멤버 변수 좀 더 구체적으로 부를수있다
    int studentId;
    String studentName;
    String address;

    //행위
    void study() {
        System.out.println(studentName + "(이)가 공부를 합니다.");
    }

    void breakTime() {
        System.out.println(studentName + "(이)가 휴식을 합니다.");
    }

    void showInfo() {
        System.out.println("_______상태창______");
        System.out.println("학생 ID : " + studentId);
        System.out.println("학생 이름 : " + studentName);
        System.out.println("학생 주소 : " + address);
    }

    void test() {
        System.out.println(studentName + "(이)가 시험을 칩니다");
    }

    void cleaning() {
        System.out.println(studentName + "(이)가 청소를 합니다");
    }

}
