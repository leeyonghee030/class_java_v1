package com.oop10;

public class StaticRuleTest {

    private String version = "1.0.0"; //인스턴스 변수,멤버변수
    private static String appName = "로또 번호 생성기"; //static변수


    //인스턴스 메서드
    public String getVersino() {
        System.out.println(appName);
        System.out.println(version);
        System.out.println(makeMessage());
        return version;
    }

//    static메서드
    public static String makeMessage() {
        System.out.println(appName);
//        아직 객체가 생성되지 않은 상태일수 있기떄문에 막습니다
//        System.out.println(version); //인스턴스 변수
//        System.out.println(getVersino()); //인스턴스 메서드
//        System.out.println(this);   //블가능
        return appName + " 입니다";
    }

}
