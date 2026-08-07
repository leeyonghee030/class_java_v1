package ch06;

import java.util.Scanner;
//import 수입하다,가지고오다

public class IfTest3_1 {

    public static void main(String[] args) {
        //if else if else 구문 - 주어진 조건이 여러개 일떄 많이 사용한다

        //키보드에서 값을 입력 받을수있는 도구 사용해보자
        Scanner sc = new Scanner(System.in);

        System.out.println("사용자의 키보드 숫자 입력값을 기다리고 있어요");
        int age = sc.nextInt();

        //if, else if 는 조건이 참일떄 실행
        //else는 그외 실행

        //순서가 중요하다 이번 예시에서는 작은 숫자가 먼저 되어있어
        //1가지 범위로만 검증할수있어 편리하다
        if (age <= 7) {
            System.out.println("어린이");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인입니다");
        }
        System.out.println("프로그램 종료");

        sc.close();
    }

}
