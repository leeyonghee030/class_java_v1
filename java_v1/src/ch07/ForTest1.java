package ch07;

public class ForTest1 {
    public static void main(String[] args) {
        //반복문 - 반복적안 패턴이 보인다면 반복문을 생각해보자

        // 0부터 9까지 화면에 출력하시오
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4); // ....(9)
        System.out.println("--------");

        //초기화식; 조건식(true,false); 증감식(감소식) <--마지막에는 ; 콜론 사용안함
        //초기화식 확인후 , 조건식을 확인하고 true면 수행구문 실행난후 i를 증감한다
        for (int i =0; i < 10; i++) {
            //수행 구문: 조건식이 true 라면 이부분이 실행 된다.
            //1번쨰 i = 0
            //2번쨰 i = 1 ....
            //..번쨰 조건식이 i가 10이될떄 false가되어 i가 0-9까지 수행구문이 실행된다.
            System.out.println(i);
        } //end of for  수행구문 끝후 i 증감되어 i = 1이된다.

    }
}
