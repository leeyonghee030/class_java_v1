package ch02;

/**
 * 문자 데이터 타입
 * char 자료형 크기는 2byte 입니다
 *
 */

public class DateType2 {
    public static void main(String[] args) {
//        기본자료형 - 문자타입(사실은 정수형)
        //문자를 저장할떄 사용한다
        //단 하나의 문자만을 저장할수있다
        char charBox = '가';
//        char charBox2 = '가나'; <-[][][][][][][][] [][][][][][][][]
        System.out.println(charBox);

        System.out.println("A");
        System.out.println("B");
        System.out.println("C");

        System.out.println("____________");
        char alphabetA = 'A';
        System.out.println((int)alphabetA);
        char alphabetA2 = 'B';
//        char alphabetA3 = "B"; "" 는 문자가 아닌 문자열을 표현할때 사용한다.
//        고민! 문자도 사실 정수형이라고 했으나 왜 화면에서 문자 형태로 출력 되는걸까?
//        이유는 문자표가 이미 컴퓨터 내부에 저장되어있다


    }
}
