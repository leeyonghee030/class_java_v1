package com.oop4;

/**
 * 생성자
 * 객체를 생성할 떄 다음과 같은 모양으로 객체를 만들어라고 지시하는 것 (강제성)
 * 생성자는 객체 생성할 떄 반드시 존재 해야한다
 */
public class Student {
    int id;
    String name;
    int grade;

    //.java --컴파일-- > ,class
    //1. 사용자 정의 생성자를 만들지 않으면
    // 컴파일러가 .class파일을 생성할 떄 자동으로 만들어 준다

    // public Student() {} 기본생성자


    //2.사용자 정의 생성자
    //생성자는 리턴값이 없음 + 클래스 파일명과 같아야함 (대소문자까지)
    public Student(int n, String s, int g) {
        //생성자는 객체를 메모리에 올릴떄(인스턴스화) 가장 먼저 실행되는 코드
        id = n;
        name = s;
        grade = g;
    }

    public void showInfo() {
        System.out.println("_____상태창_____");
        System.out.println("학번 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
    }




}
