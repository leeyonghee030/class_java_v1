package com.oop8;

public class Book {

    private  String title;
    private  String author;
    private  int price;

    public Book() {}
    public Book(String title) {
        this.title = title;
        System.out.println("생성자1");
    }


    public Book(String title, String author) {
//        this.title = title;
        this(title);
        this.author = author;
        System.out.println("생성자2");
    }

    public Book(String title, String author, int price) {
        this(title, author);
        this.price = price;
        System.out.println("생성자3");
    }

    public Book getBook() {
        return this; //자기 자신의 주소값을 반환
    }




}
