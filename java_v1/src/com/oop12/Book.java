package com.oop12;

public class Book {
    private static  int count = 1;
    private int bookNum;
    private String title;
    private String author;
    private int totalPage;

    //참조변수는 초기화 안하면 null
    //멤버변수는 0 , 0.0 , false

    //이 생성자는 외부에서 호출 불가 private
    public Book(String title, String author) {
        this.bookNum = count;
        this.title = title;
        this.author = author;
        count++;
    }

    public Book(String title, String author, int totalPage) {
        this(title, author);
        this.totalPage = totalPage;
    }

    //getter 읽기 전용
    public int getBookNum() {
        return bookNum;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void showInfo() {
        System.out.println(">>> 책정보 <<<");
        System.out.println("책번호 : " + bookNum);
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        if (totalPage != 0) {
            System.out.println("총 페이지 수 : " + totalPage);
        }
        System.out.println("---------------------");
    }
}
