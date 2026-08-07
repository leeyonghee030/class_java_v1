package com.oop4;

public class MainTest1 {

    public static void main(String[] args) {
//        Student student =new Student(); //기본 생성자를 사용해서 객체 생성 됨
        //주의 만약 단 하나의 사용자 정의 생성자를 만들었다면 기본 생성자는
        // 자동으로 생성되지 않는다.

        Student student = new Student(1,"야스오",2);
        student.id =1;
        student.name="야스오";
        student.grade=2;
        //위 3줄에 명령어를 생성자를 통해서 한번에 할수있다
        //생성자 - 객체를 생성시키는 특별한 유형에 힘수이다



    }
}
