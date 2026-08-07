package ch02;

public class DateType3 {
    public static void main(String[] args) {
        //기본 자료형(실수형)
        //1.0,0.123...
        //float, double - 두가지 존재 4, 8바이트 크기이다

        //4바이트 상자에 8바이트 크기를 넣으려니 오류발생함
        float floatBox1 = 0.5F;
        // 접미사 f 선언해주어야 한다 실수형에 기본 연산에 단위는 double 타입이다.
        //접미사를 사용해서 자바(컴파일러)에게 0.5는 double이 아니라 float타입이다 명시(접미사) 역할이다

        double doubleBox1 = 0.231;
        double doubleBox2 = 0.5;
        //실수형 자료에서 기본 연산에 단위는 double타입이다
//        왜 더 큰 8byte를 기본 연산으로 사용할까?
        //값의 정확성 떄문에 사용한다.

    }
}
