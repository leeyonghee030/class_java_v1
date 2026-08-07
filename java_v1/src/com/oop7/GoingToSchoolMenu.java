package com.oop7;

import java.util.Scanner;

public class GoingToSchoolMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EAT = 1;
        final int BUS = 2;
        final int SUBWAY = 3;
        final int MY_INFO = 4;
        final int END = 0;

        int num;

        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        //객체 생성  (등장인물 준비)
        Student student = new Student(name, 5000, 500);
        Rice rice = new Rice("김치볶음밤", 3000);
        Bus bus133 = new Bus(133, 1_000);
        Subway line1 = new Subway(1, 1400);

        while (true) {
            System.out.println();
            System.out.println("메뉴선택");
            System.out.println("1. 밥먹기 2.버스타기 3.지하철타기 4.내상태 0.종료");
            System.out.print("번호선택 : ");
            num = sc.nextInt();
            sc.nextLine();

            if (num == EAT) {
                student.eatMenu(student.getFoodAmount() , rice);
            } else if (num == BUS) {
                student.takeBus(student.getMoney(), bus133);
            } else if (num == SUBWAY) {
                student.takeSubway(student.getMoney(), line1);
            } else if (num == MY_INFO) {
                student.showInfo();
            } else if (num == END) {
                System.out.println("프로그램이 종료됩니다");
                break;
            } else {
                System.out.println("다시 0-4까지 숫자를 입력해주세요");
            }


        }
        sc.close();

    }
}
