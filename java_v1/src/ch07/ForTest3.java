package ch07;

public class ForTest3 {
    public static void main(String[] args) {
        //1부터 100까지 중 총합을 구하시오
        //홀수만 덧셈해서 구하는 총합을 담아주세요
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += 1;
            }
        }
        System.out.println("sum " + sum);

        //반복문에 증감식을 2씩 증가 시켜보자
        for (int i = 0; i < 10; i += 2) {
            System.out.println("2씩 증가 +" + i);
        }
        System.out.println("__________");

        //문제 화면에서 10 9 8 7 6 ....1 을 출력하는 코드를 작성하시오
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //이중 for 사용
        // 0 1 2
        // 0 1 2
        // 0 1 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //*
        //***
        //***** 별만들기 4줄
        for (int i = 1; i < 8; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println();

        //******
        //***
        //* 별만들기 4줄
        for (int i = 7; i > 0; i--) {
            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

//         *
//        ***
//       *****
        for (int i = 1; i < 8; i++) {
            if (i % 2 != 0) {
                for (int k = (7 - i) / 2; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println();

        for (int i = 7; i > 0; i--) {
            if (i % 2 != 0){
                for (int k = (7 - i) / 2; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }

    }
}
