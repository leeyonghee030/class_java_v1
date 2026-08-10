package useful.ch15;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordBook {

    public static void main(String[] args) {

        Map<String, String> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        words.put("apple", "사과");
        words.put("banana", "바나나");
        words.put("cherry", "체리");

        while (true) {
            System.out.println("\n" + "-- 영한 단어장 --");
            System.out.println("1.단어추가 2.단어검색 3.전체출력 0.종료");
            System.out.print("선택 : ");
            String choice = sc.nextLine();

            //아래 기능을 구현해주세요

            if (choice.equals("1")) {
                System.out.println("추가할 영단어을 적어주세요");
                System.out.print("영단어 : ");
                String e = sc.nextLine();
                System.out.println("추가할 단어 뜻을 적어주세요");
                System.out.print("단어 뜻 : ");
                String k = sc.nextLine();

                words.put(e, k);
                System.out.println(words.get(e) + " 저장 되었습니다");
            } else if (choice.equals("2")) {
                System.out.println("검색할 단어를 적어주세요");
                System.out.print("단어 :");
                String e = sc.nextLine();
                boolean check = words.containsKey(e);
                if (check == true) {
                    System.out.println(words.get(e) + " 입니다");
                } else {
                    System.out.println("검색 결과가 없습니다");
                }
            } else if (choice.equals("3")) {
                if (words.size() > 0) {
                    System.out.println("전체 출력 되었습니다");
                    for (String n : words.keySet()) {
                        System.out.println(words.get(n));
                    }
                } else {
                    System.out.println("저장된 정보가없습니다");
                }
            } else if (choice.equals("0")) {
                System.out.println("프로그램 종료");
                return;
            } else {
                System.out.println("1 ~ 4 중에 숫자를 입력해주세요 ");
            }

        }


//        sc.close();
    }
}
