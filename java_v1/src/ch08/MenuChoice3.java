package ch08;

import java.util.Scanner;

public class MenuChoice3 {
    public static void main(String[] args) {
        //잘못된 입력을 3번 이상 입력시 강제 종료
        //단 3회 이전에 제대로된 메뉴를 눌렸다면 0으로 초기화
        Scanner sc= new Scanner(System.in);
        final int CREATE = 1;
        final int  READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int EXIT = 0;
        //1,2,3 보다 바로 읽힐수있게 상수로 하는게 좋음

        int count = 0;

        while (true) {
            if (count == 3) {
                break;
            }

            System.out.println("\n 메뉴 선택"); // \n 한칸 밑으로 내리기
            System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                count = 0;
            }

            if (choice == CREATE) {
                System.out.println("등록을 선택했습니다.");
            } else if (choice == READ) {
                System.out.println("조회를 선택했습니다.");
            } else if (choice == UPDATE) {
                System.out.println("수정을 선택했습니다.");
            } else if (choice == DELETE) {
                System.out.println("삭제를 선택했습니다.");
            } else if (choice == EXIT) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                count++;
                System.out.println("잘못된 입력입니다. 다시 선택하세요");
            }
        }


        sc.close();
    }
}
