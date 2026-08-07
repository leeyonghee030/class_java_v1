package com.oop12;

public class BookTest {
    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Book("홍길동전", "허균", 300);
        books[1] = new Book("플러터UI", "김근호", 300);
        books[2] = new Book("강아지똥", "최근호", 500);
        books[3] = new Book("노르웨이의숲", "허근호", 500);
        books[4] = new Book("언어를디자인하라", "강근호", 500);
        books[5] = new Book("노랭이", "리근호", 800);
        books[6] = new Book("사피엔스", "이근호", 700);
        books[9] = new Book("호빵", "위근호", 600);

       for(int i = 0; i < books.length; i++) {
           if (books[i] != null) {
               System.out.println(books[i].getTitle());
           }
       }

        for(int i = 0; i < books.length; i++) {
            if (books[i] == null) {
               continue;
            }else {
                System.out.println(books[i].getTitle());
            }
        }
        //NullPointerException 객체를 생성하지않았거나 , 가리치는 주소가 없을떄
        //객체 배열을 만들면 방만 생기고 알맹이는 전부 null이다.
        //null인 방에 있는 객체의 메서드/필드를 호출하려고 할 때 NullPointerException이 터진다.
        //따라서 if (객체배열[i] != null)로 검사하고 사용하는 것이 표준적인 안전한 코드이다!

        for (Book b : books) {
           if (b != null) {
               System.out.println(b.getTitle());
           }

       }

    }

}
