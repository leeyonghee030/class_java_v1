package exercise;

import java.util.Scanner;

public class Exercise7 {

    //함수 만들기1
    //인사말 출력하기
    static void greet(String userName) {
        System.out.println("안녕하세요,[" + userName + "]님!");
    }

    //함수 만들기2
    //제곱계산하기
    static int square(int a) {
        return a * a;
    }

    //함수 만들기3
    //수의 부호판별
    static String signOfNumber(int a) {
        String result = "";
        if (a == 0) {
            result = "ZERO";
        }
        if (a == 1) {
            result = "positive";
        }
        if (a == -1) {
            result = "negative";
        }
        return result;
    }

    //함수 만들기4
    //나이확인
    static boolean checkAdult(int age) {
        return age >= 18;
    }

    //함수 만들기5
    //최대값 찾기 함수
    static int findMax(int a, int b) {
        int result = a > b ? a : b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 3;

        greet("홍길동");

        System.out.println("7제곱은? :" + square(7));

        String result = "";
        while (true) {
            System.out.print("-1 ~ 1 까지 숫자중 하나 적어주세요 :");
            num = sc.nextInt();
            if (num > -2 || num < 2) {
                System.out.println(signOfNumber(num));
                break;
            } else {
                System.out.println("다시 입력해주세요");
            }
        }

        System.out.print("나이를 적어주세요 :");
        boolean checkAdult = false;
        num = sc.nextInt();
        checkAdult =checkAdult(num);
        if (checkAdult) {
            System.out.println("성인입니다");
        } else {
            System.out.println("어린이입니다");
        }


        System.out.println(findMax(10, 20));








    }
}
