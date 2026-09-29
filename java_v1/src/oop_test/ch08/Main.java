package oop_test.ch08;

public class Main {
    public static void main(String[] args) {

//        DiscountPolicy discountPolicy = new FIxDiscountPolicy();
        DiscountPolicy discountPolicy = new RateDiscountPolicy();

        OrderService orderService = new OrderService(discountPolicy);

        orderService.takeOrder("아이스아메리카노",4500);
        orderService.takeOrder("카페라떼",5000);
        orderService.takeOrder("바닐라라떼",5500);

    }
}
