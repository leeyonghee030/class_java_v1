package com.oop2;

public class FunctionTest2 {
    //세개의수를 입력 받아 뺼셈 하는 함수를 설계하고
    // 그 값을 반환하는 함수흐 만들어보자

    static int sub(int a, int b, int c) {
        int result = a - b- c ;
        return  result;
    }

    //리턴 키워드가 없는 함수를 만들어 보자
     //void <- 텅빈, 값이없는..
    static void sayHelloo(String greeting) {
        System.out.println("[[[" + greeting + "]]]🤷‍♂️~~~");
    }

    //매개 변수가없는 함수를 설계해 보자.
    static int calcSum() {
        //지역 변수는 가능한 초기화값을 먼저 할당하자
        int sum = 0;
        int i;

        for(i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return  sum;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        //함수 호출시 들어가는 값을 인수라고 부릅니다.
        sub(num1, num2, 10); //이렇게하면 계산은 되지만 그값을 사용하지않아 아무거도안됨
       int result1 = sub(num1, num2, 10);

       sayHelloo("이거는 함수,메소드입니다");
       sayHelloo("안녕"); // 함수의 목적 여러번 쓰기위한

       int result2 =  calcSum();

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);



    }

}
