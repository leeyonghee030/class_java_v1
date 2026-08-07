package ch05;

/**
 * 증감,감소 연산자 ++,--
 * 부호연산자와 다르게 변수에 직접 접근에 오직 1증가, 감소를 시키는 연산자이다
 */
public class Operation4 {
    public static void main(String[] args) {
        int value = 1;
        //증감연산자
        value++;
        System.out.println(value);
        // value = value + 1;
        // valne += 1;

        //감소연산자
        int value2 = 1;
        value2--;
        System.out.println("value2:" + value2);

        //2.1 -증감 연산자가 항앞에 올경우 (전위 연산자) ++10;
        //2.2 -증감 연산자가 항뒤에 올경우 (후위 연산자) 10++;

        //증감 전위 연산자 사용
        int data1 = 10;
        int temp1 = ++data1;
        System.out.println("temp1:" + temp1);

        //증감 후위 연산자 사용
        int data2 = 10;
        int temp2 = data2++;
        System.out.println("temp2:" + temp2);
        //증감 후의 연산자를 사용할 떄 변수에 접근해서 값이 1증가 되는것은 맞음.
        //단 ; (세미코로론이 끝난이후)
        System.out.println(data2); // 11

        // 항이 하나 있을떄 확인
        int data3 = 10;
        int data4 = 10;
        ++data3;
        data4++;
        System.out.println("data3:" + data3);
        System.out.println("data4:" + data4);

        //반복문을 제외하고 전위 연산자를 사용하는게 안헷갈리기위해 권장사항

        //문제1. 전위 감소 연산자, 후위 감소 연산자를 사용하고 결과를 출력하시오
        System.out.println("_____________________");

        int num1 = 10;
        --num1;
        System.out.println(num1);

        int num2 = num1;
        System.out.println("num2:" + num2);
        int num3 = --num1;
        System.out.println("num3:" + num3);
        int num4 = num1--;
        System.out.println("num4:" + num4);
        int num5 = num1;
        System.out.println("num5:" + num5);


    }
}
