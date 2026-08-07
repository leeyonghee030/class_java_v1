package com.oop4;

public class CoffeeMachineTest {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(100,100);

        //실행에 흐름 직접만들어보시
        String result = coffeeMachine.makeCoffee();
        System.out.println(result);

        coffeeMachine.refillWater(200);
        coffeeMachine.refillCoffee(100);
        //coffeeMachine 객체 안에 물,원두의 상태값이 변경되었다
        String result2 = coffeeMachine.makeCoffee();
        System.out.println(result2);
        coffeeMachine.showInfo();
        System.out.println(coffeeMachine.makeCoffee());
        coffeeMachine.getCount();
    }


}
