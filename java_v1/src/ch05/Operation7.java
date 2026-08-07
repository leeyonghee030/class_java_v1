package ch05;

import java.util.IdentityHashMap;

/**
 * 빠른 평가란?
 * 논리연산에서 첫번쟤 조건이 결과를 결정하는 경우
 * 두번쨰 조건을 평가하지않는것
 */

public class Operation7 {
    public static void main(String[] args) {

        int number = 5;
        int index  = 0;

        // 논리 곱(&&)을 사용한 빠른 평가
        //첫번쨰 조건이 false 이기 떄문에 논리곱에서 두번쨰 조건은 아예 평가 되지않음 <-빠른평가
        boolean result = ((number = number += 10) < 10) && ((index += 2) < 10 );
        System.out.println("number: " + number); //15
        System.out.println("index: " + index); //0
        System.out.println("논리곱 결과확인" + result);

        System.out.println("_____________________");

        // 논리 합(||)을 사용한 빠른 평가
        // number는 위에 연산을 했기 떄문에 현재 15이다.
        //index는 위에서 빠른 평가로 잔행 했가 떄문에 현재 0이다.
        boolean result2 = ((number += 10) < 10 ) || ((index +=2) < 10);
        System.out.println("result2: " + result2); //true
        System.out.println("number :" + number); // 25
        System.out.println("index " + index);  // 2

        boolean result3 = ((number += 10) >10 ) || ((index +=2) < 10);
        System.out.println("number :" + number); // 35
        System.out.println("index " + index);  // 2 빠른평가로 2 그대로다.

        //  문제1
        // 1. 빠른 평가 수식을 스스로 만들어 보고 결과를 확인하는 코드를 작성하세요
        int num3 = 0;
        boolean a = !true && (num3 += 10) > 1;
        System.out.println(a);
        System.out.println(num3);

        boolean b = (10*10>0 &&  num3 ==0 ) || (num3 += 10) > 1;
        System.out.println(b);
        System.out.println(num3);

    }
}
