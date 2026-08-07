package com.oop10;

public class MainTest1 {

    public static void main(String[] args) {

        Employee employee = new Employee("홍길동", "개발팀");
        Employee employee1 = new Employee("이순신", "디자인팀");

        employee.showInfo();
        employee1.showInfo();

    }
}
