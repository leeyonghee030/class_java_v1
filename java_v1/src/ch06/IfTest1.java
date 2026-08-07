package ch06;

public class IfTest1 {

    public static void main(String[] args) {
        //안약에 ...이라면 --> if, if else, if else if else
        //주어진 조건에 따라서 실행이 다르게 이루어 지도록 구현 할수있다 .
        boolean flag = true;  //flag

        //단독 if 구문
        if (flag) {
            //수행구문
            System.out.println("주어진 식이 true 이면 실행됨");
        } //end of if

        System.out.println("프로그램을 종료합니다.");

        //중요
        //단독 if 구문은 -> 수행구문이 실행 될수 있고 안될수도 있다.


    }

}
