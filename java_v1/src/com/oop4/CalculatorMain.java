package com.oop4;

public class CalculatorMain {

    // 두 숫자를 더하는 함수
    static int sum(int num, int num2) {
        return num + num2;
    }

    // 두 숫자를 뺴는 함수
    static int sub(int num, int num2) {
        return num - num2;
    }

    // 두 숫자를 곱하는 함수
    static int mul(int num, int num2) {
        return num * num2;
    }

    //두 숫자를 나누는 함수
    static int div(int num, int num2) {
        return num / num2;
    }

    //짝수 판별함수
    static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "은 짝수입니다");
        } else {
            System.out.println(num + "은 짝수가 아닙니다");
        }
    }

    //홀수 판별함수
    static void isOdd(int num) {
        if (num % 2 != 0) {
            System.out.println(num + "은 홀수입니다");
        } else {
            System.out.println(num + "은 홀수가 아닙니다");
        }
    }

    //매인 함수
    public static void main(String[] args) {
        // 위 함수 테스트
        System.out.println(sum(10, 10));
        System.out.println(sub(100, 100));
        ;
        System.out.println(mul(5, 9));
        System.out.println(div(100, 10));
        String test = "aw2r23s1sd";
        isEven(22);
        isOdd(33);
        System.out.println(a(test));


    }



    static String a(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            if (sc >= 'a' && sc <= 'z') {
                result.append((char) (sc - 32));
            } else {
                result.append(sc);
            }
        }
        return result.toString();
    }



}

