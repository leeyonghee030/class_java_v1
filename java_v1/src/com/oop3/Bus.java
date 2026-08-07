package com.oop3;

//버스클래스
//속석과 행위를 설계
//BusMainTest1 (객체를 두개이상 생성하고 결과 출력해보기
public class Bus {
    //속성
    //버스 번호
    //탑승수 (현재)
    //최대 탑승수
    //정거장 (현재)
    //결제 방법 (카드 / 현금)
    //현재 수익금

    //행위
    // 카드를 찍게하다
    // 승객을 태운다
    // 승객을 내려준다
    // 전진 , 후진 , 좌회전 ,우회전

    Student student = new Student();


    int busNum;
    String busColor;

    void driving() {
        System.out.println(busNum + "번 버스가 주행합니다");
    }
    void driving(Student s) {
        System.out.println(s.studentName + "이 " + busNum + " 번 버스를 탑니다");
    }

    void findColor() {
        System.out.println(busColor + "색 버스입니다");
    }

}
