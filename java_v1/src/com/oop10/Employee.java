package com.oop10;

public class Employee {

    private int employeeNumber;
    private String name;
    private String department;


    //문제 상황 -직원 객체를 생성할떄 마다 자동으로
    // copany 의 시리얼 번호를 활용해서 1001.... 늘어나는
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
        this.employeeNumber = Company.empSeriaNumber++;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("부서 : " + department);
        System.out.println("사원번호 : " + employeeNumber);
    }

}
