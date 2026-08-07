package exercise;

import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        //연순
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
            if (sum >= 100) {
                System.out.println("마지막 숫자: " + i + "총합 :" + sum);
                break;
            }
        }

        //요구사항
        //1. 설걔 분석 아메리카노의 단가는 2500원 입니다 수량에 따른 총금액을 계산하고
        // 3잔이상 구매시 특별 스탬프를 출력하는 로직을 구성하세요
        //2canner를 사용하여 수량을 입력받고, if문과 이중 for문을 활용하여 다음을 출력하십시오
        // 예시)
        //총 결제 금액: 7500원
        //3잔 이상 구매 서비스 스탬프 발급:
        //* * *
        //* * *
        //* * *

        //3.사용자가 수량에 0 또는 음수를 입력할 경우, "1잔 이상 주문해야 합니다
        // ."라는 경고 메시지를 출력하고 다시 입력받을 수 있도록 처리하십시오.
        Scanner sc = new Scanner(System.in);

        int americano = 2500;
        int count = 0;

        while (true) {
            System.out.print("원하시는 아메리카노 수량을 적어주세요 : ");
            count = sc.nextInt();
            sc.nextLine();
            if (count <= 0 || count > 100) {
                System.out.println("정확한 수량을 적어주세요");
            } else {
                System.out.println("총 결제 금액 :" + americano * count);
                if (count >= 3) {
                    System.out.println("3잔 이상 구매 서비스 스탬프 발급:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                }
                break;
            }
        }


    }
}
