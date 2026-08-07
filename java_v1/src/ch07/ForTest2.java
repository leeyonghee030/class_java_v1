package ch07;

import java.util.function.DoubleUnaryOperator;

public class ForTest2 {
    public static void main(String[] args) {
        //반복문 - 반복적안 패턴이 보인다면 반복문을 생각해보자

        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.println(i +" * "+ j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
