package ch01;

/**
 * 복습: 변수란 값을 담을수있는 메모리상자
 * 1.변수에 선언
 * 2.변수에 값을 대입
 * 3.변수에 호출
 */
public class Variable2 {

    //메인 함수(실랭의 시작점)
    public static void main(String[] args) {

        // 변수를 만들 때 규칙이 있습니다 
        //1. 대소문를 명확히 구분하며 길이에 제한이 없다.
        int age = 10; // 변수에 선언과 동시에 초기화(값을넣다)
        //int age = 10; 같은 중괄호{} 영역안에서 동일한 변수를 선언할수 없다.
        int aGe = 10;

        //2. 자바에서 사용하는 예약어는 사용할 수 없다.
        // int, double, for, while, List... 미리 선점되어있는 단어는 변수로 사용 불가
        // int for; <-- 오류발생

        //3.특수문자는 _(언더바),$(달러) 표기 사용 가능하다.
        int _count;
//        int *count; *는 변수 선언시 사용불가

    } // end of main

} // end of class
