package com.oop13;

public class Notification {

    public static void send(String message) {
        System.out.println(message);
    }

    public static void send(String message,int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    public static void send(String receiver, String message) {
        System.out.println("[" + receiver +"]님에게 메세지: ["   + message + "]");
    }

    public static void main(String[] args) {

        send("아아아아아아아아아아");
        send("아아아아아아아아아아",3);
        send("홍길동","아아아아아아아아아아");
    }
}
