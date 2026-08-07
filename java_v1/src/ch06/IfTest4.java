package ch06;

import javax.swing.*;
import java.util.Scanner;

public class IfTest4 {

    public static void main(String[] args) {
        //키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하세요");
        int score = sc.nextInt();
        System.out.println("성적: " + score);

        System.out.println("-----------------");

        // 조건문을 사용해서 압력 받은 값에 따라 학접을 출력하는 프로그래밍을 만들어보자
        // 문제 90점 이상, A
        // 80점이상 B
        // 70점이상 c
        // 60점이상 d
        // 50점이히 f

        //이번 예시에서는 큰수를 먼저 조건식해야 조건식이 간단해진다
        //사용자가 값을 잘못 입력하는 경우 방어적 코드르 잘 작성 해주어야 한다.
//        if (score < 0 || score > 100) { //방어적 코드 실행
//            System.out.println("잘못된 입력입니다.");
//
//            return; //return - 실행에 제어권을 반납한다.
//        }

        char result = 'F';

        if (score < 0 || score > 100) { //방어적 코드 실행
            System.out.println("잘못된 입력입니다.");
        } else if (score >= 90) {
            result = 'A';
        } else if (score >= 80) {
            result = 'B';
        } else if (score >= 70) {
            result = 'C';
        } else if (score >= 60) {
            result = 'D';
        } else if (score <= 50) {
            result = 'F';
        }

        //"당신의 학점은 A 입니다" + 10 + "입니다"
        System.out.println("당신의 학점은 " + result + "입니다" );


        sc.close();
    }
}
