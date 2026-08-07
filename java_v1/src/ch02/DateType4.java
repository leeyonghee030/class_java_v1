package ch02;

public class DateType4 {
    public static void main(String[] args) {
/**
 * 기본 자료형(논리 자료형)
 * 사실을 관찰하고 결과값이 참, 거직 판별할 떄 사용한다
 * 크기는 1 byte 상자이다.
 * 사실 1비트만으로도 참 과 거짓의 데이터를 다를수 있다.
 * 하지만 비트라는 단위는 너무 작은 단위라서 컴퓨터가 연선을 비트크기로 하게되묜
 * 도로 연산이 느려진다 최소 컴퓨터 연산에 단위가 1byte로 연산된다
 */
        boolean isMarried = false;
        System.out.println(isMarried);
        isMarried = true;
        System.out.println(isMarried);

        boolean isOk;
        isOk = false;
        System.out.println(isOk);

        //바로 값을 화면에 출력하라
        System.out.println(true);
        System.out.println(false);
    }
}
