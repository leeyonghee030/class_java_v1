package ch08;

import java.util.Scanner;

public class MenuChoice4 {
    public static void main(String[] args) {
        //스캐너 활용 문자열로 값받기
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자을 적어주세요");
        System.out.print("숫자 : ");
        int menuNumber = sc.nextInt();
        // nextInt는 정수값만 가지고 가고 개행문자는 남겨둔다
        sc.nextLine(); //  개행문자 소비

        System.out.println("이름을 적어주세요");
        System.out.print("이름 : ");
        String name = sc.nextLine(); //문자열 받기
        System.out.println("int: " + menuNumber);
        System.out.println("name: " + name);




    }
}
