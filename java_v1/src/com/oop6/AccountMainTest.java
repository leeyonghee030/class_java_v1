package com.oop6;

public class AccountMainTest {
    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(10_000);
        account.withdraw(1000);

        account.showInfo();
        //접근 제어지시자가 필요한 이유
        // 가상 시나리오
        // 나는 객체의 행동인 입금하는 기능을 만들어 두었는데
        //신입 개발자가 실수로 입금하는 기능이 아닌 직접 변수에 잡근해서
        // 값을 수정한다면 의도 하지않은 결과를 발생 시킬수있다

        //변수에 직접 접근해서 값을 수정할경우 실수할 가능성이 맣다
        //그래서 우리는 변수에 private 사용해서 외부에서는 필드가 안보게 설정하는게 좋다
    }


}
