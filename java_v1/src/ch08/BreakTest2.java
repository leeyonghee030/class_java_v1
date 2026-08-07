package ch08;

public class BreakTest2 {

    public static void main(String[] args) {
        //문제 1. 1 부터 100까지  화면 출력
        //    2. 3의 배수만 화면 출력
        //    3. 50 이상이면 반복문 종료 시키세요
        //    4. for 구문으로 코드 작성

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0) {
                System.out.println("i :" + i);
            }
            if (i >= 50) {
                break;
            }
        }

        System.out.println("________");

        int num = 1;

        while (num <= 100) {
            if (num % 3 == 0) {
                System.out.println("num :" + num);
            }
            if (num >= 50) {
                break;
            }
            num++;
        }

    }
}
