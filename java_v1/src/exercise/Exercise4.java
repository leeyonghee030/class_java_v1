package exercise;

public class Exercise4 {

    public static void main(String[] args) {

        // 1. intData와 doubleData을 덧셈 연산 하여 result1 변수에 담고
        // 결과값 30.5를 출력 하세요.

        int intData = 10;
        double doubleData = 20.5;
        // result1 변수명으로 사용하세요
        double result1 = intData + doubleData;
        System.out.println(result1);


        // 2. result1 변수를 정수형으로 강제 형 변환 해서 출력하세요
        System.out.println((int)result1);

        // 3. intData 변수에서 -1을 뺀 후 출력하세요
        // 단, 단항 연산자 사용
        System.out.println(--intData);

        // 4. doubleData 변수에 값을 -20.5로 출력 하세요
        // 단, doubleData 값을 변경하지 마세요
        System.out.println(-doubleData);

        // 5. 변수 intData 와 doubleData, 관계 연산자를 사용해서
        // result2 변수에 값을 true 담기도록 식을 만들고 만들고 출력하세요
        boolean result2 = doubleData > intData;
        System.out.println("result2: " + result2);
        int num1 = 10;
        int num2 = 30;

        // 6. 변수 result3 을 선언하고 num1과 num2 변수가 합이
        // 숫자 50보다 큰지 비교연산자(or 삼항연산자)를 사용해서 결과를 담고 출력하세요.
        boolean result3 = num1 + num2 > 50 ? true :false;
        System.out.println("result3: " + result3);

        // 7. num1과 num2 값 중 큰 수를 삼항 연산자를 사용해서
        // max 변수에 값을 담고 출력해주세요
        int max = num1 > num2 ? num1 : num2;
        System.out.println("max: " + max);


        //응용
        // 상수
        final int AMERICANO_PRICE = 4500;   // 아메리카노 한 잔 가격
        final int DISCOUNT_RATE = 10;       // 회원 할인율 (%)
        final int FREE_STAMP = 10;          // 무료 음료 기준 스탬프 개수

        // 주문 정보
        int quantity = 3;                   // 주문 수량
        boolean isMember = true;            // 회원 여부
        int stampCount = 8;                 // 보유 스탬프

        // 1. 총 주문 금액을 total에 담고 출력하세요. (13500)
        int total = AMERICANO_PRICE * quantity;
        System.out.println("total: " + total);

        // 2. 회원 할인을 적용한 최종 금액을 finalPrice에 담고 출력하세요. (12150)
        //    힌트: total * (DISCOUNT_RATE / 100) 이라고 쓰면 0이 나옵니다. 왜일까요?


        // 3. 스탬프가 무료 음료 기준을 넘었는지 판별해서 출력하세요. (false)


        // 4. 무료 음료 조건을 canGetFree에 담고 출력하세요. (false)
        //    조건: 스탬프가 10개 이상이거나, 회원이면서 5잔 이상 주문


        // 5. 주문한 수량만큼 스탬프를 적립한 후 stampCount를 출력하세요. (11)
        //    단, 복합 대입 연산자를 사용하세요.


        // 6. 적립 후 스탬프가 기준 이상이면 "무료 음료 가능",
        //    아니면 "결제 필요"를 출력하세요.
        //    단, 삼항 연산자를 사용하세요.


        // 7. [도전] 무료 음료를 1잔 받고 난 뒤 남는 스탬프를 출력하세요. (1)
        //    단, 후위 감소 연산자는 쓰지 말고 복합 대입으로 처리하세요.



    } // end of main
}
