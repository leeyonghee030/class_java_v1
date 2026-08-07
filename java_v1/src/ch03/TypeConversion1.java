package ch03;

/**
 *  형변환이란?
 *  데이터의 타입을 다른 타입으로 변경 하는 것
 *  - 자동 형변환, 강제 형변환
 */
public class TypeConversion1 {
    public static void main(String[] args) {
        int intDataBox = 100;
        double doubleDataBox;
        // 1. 자동형변환 예시
        // 8바이트 상자 =  4바이트 상자
        doubleDataBox = intDataBox; // 자동 형변환을 진행함
        System.out.println("doubleDataBox:"+ doubleDataBox);

        //2. 강제형변환 예시
        final double PI = 3.14159;
        //컴파일러야 괜찮으니까 그냥 강제로 집어 넣어 --> (자료형)
        int intBox = (int)PI;
        System.out.println("intBox:" + intBox);


        //연습
        double interestRate;
        int discount;
        interestRate = 15.5;
        //문제1 아래 오류나는 문볍을 해결하고 출려하기
        discount = (int)interestRate;
        System.out.println(discount);
    }
}
