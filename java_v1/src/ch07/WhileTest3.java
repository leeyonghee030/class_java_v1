package ch07;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {


        //1. 1 ~ 10 --> 55

        //2. 끝 값을 스캐너를 통해서 받아서 연산  작성해보자
        Scanner sc = new Scanner(System.in);
        System.out.print("마지막 값을 입력 하시오 :");

        int start = 1;
        int endInput = sc.nextInt();
        int sum = 0;

        while (start <= endInput) {
            sum += start;
            start++;
        }
        System.out.println("sum의 총합: " + sum);


    }
}


