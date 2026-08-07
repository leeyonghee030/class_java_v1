package ch03;

/**
 * 형변환이란?
 * 데이터의 타입을 다른 타입으로 변경 하는 것
 * - 자동 형변환, 강제 형변환
 */
public class TypeConversion2 {
    public static void main(String[] args) {
        //자동형변환 코드 작성해보기
        byte num = 100;
        short num2 = num;
        int num3 = num2;

        float num4 = 10.2f;
        double num5 = num4;
        //강제형변환 코드 작성해보기
        double num6 = 1.2323;
        float num7 = (float) num6;

        long num8 = 1332;
        int num9 = (int) num8;
        //결과 출력해보기
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);


    }
}
