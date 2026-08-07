package com.oop1;

public class StudentMainTast1 {

    public static void main(String[] args) {
        //내가 설계한 클래스를 메모리에 직접올려보자
        // JVM (자바 가상 머신) 메모라에 올리수있다
        Student s1 = new Student(); //클래스를 메모리에 올려라(인스턴스화 했다)
        Student s2 = new Student();//

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        // 변수에 주소값이 나온다

        int grade = 10;
        double height =  1.1;

        System.out.println("grade : " + grade);
        System.out.println("height : " + height);

        //자바에 변수는 가장 크게 2기지가 존재한다.
        //기본변수 : 실제 값이 담겨진다.
        //참조변수 : 변수에 실제값이 아니라 주소값이 담긴다.

    }
}
