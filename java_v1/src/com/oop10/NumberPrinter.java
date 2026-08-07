package com.oop10;

public class NumberPrinter {
    int id;
    static int waitNumber;
    //인스턴스 객체들이 공유할수있는 메모리 영역이다 static

    public NumberPrinter(int id) {
        this.id = id;
        waitNumber = 1;
    }

    //번호표 출력 기능
    public  void printWaitNumber() {
        System.out.println(id + "기기의 대기순번 : " + waitNumber);
        waitNumber++;
    }
}
