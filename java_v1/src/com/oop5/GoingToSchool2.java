package com.oop5;
//객체를 사용하고 실행해보는 테스트 코드
public class GoingToSchool2 {

    public static void main(String[] args) {
        Student student = new Student("케로로", 100000);

        Rice rice = new Rice("흑미",1000);

        student.eatRice(rice,100);


    }
}
