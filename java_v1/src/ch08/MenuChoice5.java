package ch08;

import java.util.Scanner;

public class MenuChoice5 {
    public static void main(String[] args) {
        //변수 name을 사용해서 crud 구현해보자


        Scanner sc = new Scanner(System.in);
        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int EXIT = 0;

        String test = "0";
        String name = "";



        //1,2,3 보다 바로 읽힐수있게 상수로 하는게 좋음


        while (true) {
            System.out.println("\n 메뉴 선택"); // \n 한칸 밑으로 내리기
            System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == CREATE) {
                System.out.print("등록하실 이름: ");
                test = sc.nextLine();

                if (test.equals(name) || test.isEmpty()) {
                    System.out.println("등록 실패하였습니다.");
                } else {
                    name = test;
                    System.out.println("name: " + name + " 등록되었습니다.");
                }

            } else if (choice == READ) {
//                name안에 담겨진 값을 출력하는 기능 구형
                if (name.equals("")){
                    System.out.println("아직 등록 되지않았습니다");
                }
                System.out.println("name: " + name);
            } else if (choice == UPDATE) {
//                name을 수정하는 기능 구현
                if (name.equals("")){
                    System.out.println("아직 등록 되지않았습니다");
                }
                System.out.print("수정될 이름 :");
                test = sc.nextLine();

                if (test.equals(name) || test.equals("")) {
                    System.out.println("수정 실패하였습니다.");
                } else {
                    name = test;
                    System.out.println("name: " + name + " 수정 되었습니다.");
                }

            } else if (choice == DELETE) {
//                name 을 삭제 하는 기능 구현
                name = "";
                System.out.println("삭제를 되었습니다.");
            } else if (choice == EXIT) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택하세요");
            }
        }


        sc.close();
    }
}
