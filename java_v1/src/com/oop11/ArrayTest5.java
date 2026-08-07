package com.oop11;

import java.util.Random;

public class ArrayTest5 {

    public static int[] makeNumber() {
        Random random = new Random();

        //for을 이용해서 코드를 간결화 할수있다
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(45) + 1;
        }
        return numbers;
    }

    public static void main(String[] args) {

        int[] lotto = makeNumber();

        for (int i = 0; i < 1; i++) {
            System.out.print("["+ " ");
            for (int j = 0; j < lotto.length; j++) {
                System.out.print(lotto[j] + " ");
            }
            System.out.print("]");
        }

    }
}
