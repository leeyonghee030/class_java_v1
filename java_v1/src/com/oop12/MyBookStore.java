package com.oop12;


import java.util.Scanner;

//모든 프로그램밍의 기본은 CRUD이다
//Create, Read, Update, Delete
//배열을 활용한 간단한 데이터 관리 시스템
public class MyBookStore {
//현재 저장된 데이터 개수를 추적하는 공유 변수 static

    static int lastIndexNumber = 5;



    public static void main(String[] args) {
        //준비물
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[100];
        boolean flag = true;
        int indexNumber = -1;


//        샘플데이터 쓰기
        books[0] = new Book("홍길동전", "허균");
        books[1] = new Book("플러터UI", "김근호");
        books[2] = new Book("강아지똥", "최근호");
        books[3] = new Book("노르웨이의숲", "허근호");
        books[4] = new Book("언어를디자인하라", "강근호");

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String DELETE_BY_TITLE = "5";
        final String END = "0";

        //실행흐름 만들기
        while (flag) {
            System.out.println();
            System.out.println(">>> 도서 관리 시스템 <<<");
            System.out.println(">> 메뉴 선택 <<");
            System.out.println("1.저장 2.전체조회 3.제목조회 4.전체삭제 5.제목삭제 0,종료");
            System.out.print("번호 선택 : ");
            String selectedNum = sc.nextLine();

            if (selectedNum.equals(SAVE)) {
                if (indexNumber >= 0){
                indexNumber = save(sc,books,indexNumber);
                continue;
                }
                save(sc, books);
            } else if (selectedNum.equals(SEARCH_ALL)) {
                readAll(books);
                if (indexNumber >= 0){
                    System.out.println((lastIndexNumber+2) +"/100");
                }else {
                    System.out.println((lastIndexNumber+1) +"/100");
                }
            } else if (selectedNum.equals(SEARCH_BY_TITLE)) {
                getByTitle(sc, books);
            } else if (selectedNum.equals(DELETE_ALL)) {
                deleteAll(books);
            } else if (selectedNum.equals(DELETE_BY_TITLE)) {
               indexNumber = deleteByTitle(sc, books);

            } else if (selectedNum.equals(END)) {
                System.out.println("프로그램 종료");
                flag = false;
            } else {
                System.out.println("0 ~ 5 까지에 숫자를 입력해주세요");
            }


        }


    }


    //전체 조회 기능 (r)b
    public static void readAll(Book[] books) {
        System.out.println("----전체조회 호출됨----");
        boolean isEmpty = true;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i].showInfo();
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("조회할 책 정보가 없습니다.");
        } else {
            System.out.println("전체 조회 완료되었습니다");
        }

    }

    //저장 기능(c)생성
    public static void save(Scanner sc, Book[] books) {
        System.out.println("저장하기 호출됨");

        if (lastIndexNumber >= books.length) {
            System.out.println("저장 공간이 가득 찼습니다");
            return;
        }
        System.out.println("책의 제목을 적어주세요");
        String title = sc.nextLine();
        System.out.println("책의 저자을 적어주세요");
        String author = sc.nextLine();
        books[lastIndexNumber] = new Book(title, author);
        lastIndexNumber++;
        System.out.println(title + " 제목의 책 저장 완료했습니다");

    }


    //선택적 삭제로 빈 인데스 나면 그거부터 먼저 생성

    public static int save(Scanner sc, Book[] books, int indexNum) {
        System.out.println("저장하기 호출됨");

        System.out.println("책의 제목을 적어주세요");
        String title = sc.nextLine();
        System.out.println("책의 저자을 적어주세요");
        String author = sc.nextLine();
        books[indexNum] = new Book(title, author);
        System.out.println(indexNum + "번으로 저장되었습니다.");
        indexNum = -1;
        System.out.println(indexNum + "안전키로 변경");
        System.out.println(title + " 제목의 책 저장 완료했습니다");
        return indexNum;

    }

    // 수정 기능 (u)
    public static void update() {

    }

    //전체 삭제 기능 (D)
    public static void deleteAll(Book[] books) {
        System.out.println("----전체삭제하기----");
        boolean isEmpty = true;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i] = null;
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("삭제할 책 정보가 없습니다.");
        } else {
            lastIndexNumber = 0;
            System.out.println(lastIndexNumber+1 +"번 부터 책을 다시 저장하겠습니다");
            System.out.println("전체 삭제 완료되었습니다");
        }
    }


    //심화

    //선택 조회기능
    public static void getByTitle(Scanner sc, Book[] books) {
        System.out.println("조회할 제목을 적어주세요");
        String selectTitle = sc.nextLine();
        boolean isEmpty = true;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(selectTitle.trim())) {
                    books[i].showInfo();
                    isEmpty = false;
                }
            }
        }
        if (isEmpty) {
            System.out.println(selectTitle + "과 제목이 동일한 책이 없습니다.");
        }
    }


    //선택 삭제 기능
    public static int deleteByTitle(Scanner sc, Book[] books) {
        System.out.println("삭제할 책의 제목을 적어주세요");
        String title = sc.nextLine();
        boolean isEmpty = true;
        int indexNum = -1;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(title.trim())) {
                    indexNum = i;
                    System.out.println( i + "번삭제 " );
                    books[i] = null;
                    System.out.println("책제목 : " + title + "을 삭제 했습니다.");
                    isEmpty = false;
                }
            }
        }
        if (isEmpty) {
            System.out.println(title + "과 제목이 동일한 책이 없습니다.");
        }
        System.out.println(indexNum + "번호 저장");
        return indexNum;
    }


}
