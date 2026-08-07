package ch07;

public class WhileTest2 {
    public static void main(String[] args) {
        // 특정 조건이 생길떄 반복문을 종료 시킬수있다.

        boolean flag = true;
        int start = 1;
        final int END = 50;

        while (flag) {
            System.out.println("start :" + start);
            if (start == END) {
                System.out.println("프로그램을 종료합니다.");
                flag = false;  //만약 start 값이 50이라면 flag 변수에 접근해서 갑을 false로 변경
            }
            start++;
        }


    }
}


