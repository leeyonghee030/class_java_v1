package ch;

import java.util.Scanner;

public class MenuItem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int AMERICANO_PRICE = 2500;
        int quantity;

        while (true) {
            System.out.println("주문하실 커피 수량을 입력해주세요");
            quantity = sc.nextInt();
            sc.nextLine();

            if (quantity <= 0) {
                System.out.println("1잔 이상 주문해야 합니다.");
            }else {
                System.out.println("총 결제 금액 : " + (AMERICANO_PRICE * quantity) +"원");
                if (quantity >= 3) {
                    System.out.println("3잔 이상 구매 서비스 스탬프 발급 :");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                return;
            }
        }

    }
}

