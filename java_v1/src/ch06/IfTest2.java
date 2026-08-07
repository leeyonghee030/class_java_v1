package ch06;

public class IfTest2 {

    public static void main(String[] args) {
        // 만약...이라면 if else 구문
//        if(조건식) {
//            ...true면 실행
//        }else {
//            ...flase면 실행
//        }
        int age = 20;

        //조건식이 true, false 에 따라 실행 구문이 달라짐
        if (age >= 19) {
            System.out.println("성인입니다");
        } else {
            System.out.println("아직 미성년자 입니다");
        }

        System.out.println("프로그램을 종료합니다");

        //if else는 두가지 경우중 반드시 하나는 수행된다.
    }

}
