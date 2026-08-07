package com.oop12;

import java.util.Locale;
import java.util.Scanner;

public class PhoneBookMain {
    static int lastIndexNum = 0;


    public static void main(String[] args) {
        final String SAVE = "1";
        final String READ_ALL = "2";
        final String READ_BY_NAME = "3";
        final String UPDATE = "4";
        final String DELETE_ALL = "5";
        final String DELETE_NAME = "6";
        final String END = "0";

        Scanner sc = new Scanner(System.in);
        Phonebook[] phonebooks = new Phonebook[100];

        int indexNum = -1;

        while (true) {
            System.out.println("---전화번호부---");
            System.out.println("메뉴에 번호를 적어주세여");
            System.out.println("1.저장 2.전체조회 3.이름조회 4.수정 5.전체삭제 6.이름삭제 0.종료 ");
            System.out.print("번호 :");
            String choice = sc.nextLine();

            if (choice.equals(SAVE)) {
                if (indexNum >= 0) {
                    indexNum = save(sc, phonebooks, lastIndexNum, indexNum);
                    continue;
                }
                save(sc, phonebooks, lastIndexNum);
                lastIndexNum++;
            } else if (choice.equals(READ_ALL)) {
                readAll(phonebooks, lastIndexNum);
            } else if (choice.equals(READ_BY_NAME)) {
                readByName(sc, phonebooks);
            } else if (choice.equals(UPDATE)) {
                update(sc, phonebooks, lastIndexNum);
            } else if (choice.equals(DELETE_ALL)) {
                deleteAll(phonebooks,lastIndexNum);
                lastIndexNum = 0;
            } else if (choice.equals(DELETE_NAME)) {
                indexNum = deleteByName(sc, phonebooks ,lastIndexNum);
            } else if (choice.equals(END)) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("0 ~ 6까지에 숫자만 적어주세요");
            }
        }
    }

    //선택삭제로 빈 인덱스로 저장
    public static int save(Scanner sc, Phonebook[] phonebooks, int lastIndexNum, int indexNum) {
        System.out.println(indexNum + "번으로 넘어옴 성공");

        save(sc,phonebooks,indexNum);

        return -1;

    }

    // 그냥 저장
    public static void save(Scanner sc, Phonebook[] phonebooks, int lastIndexNum) {
        if (lastIndexNum >= 100) {
            System.out.println("전화번호부가 가득차서 저장 불가능합니다");
            return;
        }

        System.out.println("저장 하실 이름을 적어주세요");
        System.out.print("이름 : ");
        String name = sc.nextLine().trim();

        System.out.println("저장 하실 전화번호를 적어주세요");
        System.out.println("전화번로 예시:010-0000-0000");
        System.out.print("전화번호 : ");
        String number = sc.nextLine().trim();
//        String number1 = number.replace("[^0-9]", "");
//        String number2 = number1.replace("-", "");

        phonebooks[lastIndexNum] = new Phonebook(name, number);
        System.out.println(name + "님의 전화번호를 저장했습니다.");
    }

    //전체조회
    public static void readAll(Phonebook[] phonebooks, int lastIndexNum) {
        System.out.println("전화번호 전체 조회");
        boolean isEmpty = true;

        for (int i = 0; i < lastIndexNum + 1; i++) {
            if (phonebooks[i] != null) {
                phonebooks[i].showInfo();
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("저장된 전화번호가 없습니다");
        }
    }

    //이름조회
    public static void readByName(Scanner sc, Phonebook[] phonebooks) {
        System.out.println("이름으로 조회해드리겠습니다");
        System.out.print("이름 : ");
        String name = sc.nextLine().trim();

        boolean isEmpty = true;

        for (int i = 0; i < phonebooks.length; i++) {
            if (phonebooks[i] != null) {
                if (phonebooks[i].getName().equals(name)) {
                    phonebooks[i].showInfo();
                    isEmpty = false;
                }
            }
        }

        if (isEmpty) {
            System.out.println(name + "으로 조회되는 정보가 없습니다");
        }

    }

    //수정
    public static void update(Scanner sc, Phonebook[] phonebooks, int lastIndexNum) {
        if (lastIndexNum <= 0) {
            System.out.println("아직 저장된 정보가없습니다.");
            return;
        }

        System.out.println("수정하실 이름을 적어주세요");
        System.out.println("이름 : ");
        String name = sc.nextLine().trim();
        boolean isEmpty = true;


        for (int i = 0; i < phonebooks.length; i++) {
            if (phonebooks[i] != null) {
                if (phonebooks[i].getName().equals(name)) {
                    System.out.println("1.이름 수정 2.전화번호 수정 3.전체수정 0.종료");
                    System.out.print("번호 : ");
                    String choice = sc.nextLine().trim();

                    if (choice.equals("1") || choice.equals("3")) {
                        System.out.println("수정하실 이름을 적어주세요");
                        System.out.print("이름 : ");
                        String updateName = sc.nextLine().trim();

                        phonebooks[i].setName(updateName);
                        isEmpty = false;
                        System.out.println(updateName + "님으로 수정되었씁니다");
                    }
                    if (choice.equals("2") || choice.equals("3")) {
                        System.out.println("수정하실 전화번호 을 적어주세요");
                        System.out.println("예시 :010-0000-0000");
                        System.out.print("전화번호 : ");
                        String updateNum = sc.nextLine().trim();

                        phonebooks[i].setPhoneNumber(updateNum);
                        System.out.println(updateNum + "번으로 수정되었씁니다");

                        isEmpty = false;
                    } else if (choice.equals("0")) {
                        System.out.println("수정이 취소됩니다");
                        break;
                    } else {
                        System.out.println("0 ~ 3 까지에 숫자를 입력해주세요");
                    }
                }

            }
        }
        if (isEmpty) {
            System.out.println("수정하실 이름이 일치하지 않습니다");
        }
    }

    //삭제
    public static void deleteAll(Phonebook[] phonebooks, int lastIndexNum) {
        if (lastIndexNum <= 0) {
            System.out.println("아직 삭제할 정보가 없습니다");
            return;
        }
        boolean isEmpty = true;

        for (int i = 0; i < phonebooks.length; i++) {
            if (phonebooks[i] != null) {
                phonebooks[i] = null;
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("삭제를 실패했습니다");
        } else {
            System.out.println("전체 삭제가 완료되었습니다");
        }
    }


    //선택삭제
    public static int deleteByName(Scanner sc,Phonebook[] phonebooks,int lastIndexNum) {

        if (lastIndexNum <= 0) {
            System.out.println("아직 삭제할 정보가 없습니다");
            return -1;
        }
        int indexNum = -1;
        boolean isEmpty = true;

        System.out.println("전화번호 삭제할 이름을 적어주세요");
        System.out.print("이름 : ");
        String name = sc.nextLine().trim();

        for (int i = 0; i < phonebooks.length; i++) {
            if (phonebooks[i] != null) {
                if (phonebooks[i].getName().equals(name)) {
                    phonebooks[i] = null;
                    isEmpty = false;
                    indexNum = i;
                }
            }
        }
        if (isEmpty) {
            System.out.println(name + "과 일치하는 정보가 없습니다");
        }
        return indexNum;
    }



    //

}
