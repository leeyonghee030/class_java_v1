package oop_test.ch08;

public class OrderService {
    //인터페이스로 참여
    private DiscountPolicy discountPolicy;

    public OrderService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public void takeOrder(String menuNamem, int price) {
        Order newOrder = new Order(menuNamem, price);
        int discountAmount = discountPolicy.discount(price);
        int finalPrice = newOrder.getPrice() - discountAmount;
        System.out.println(newOrder.getMenuName() + "| 정가 : "
                +newOrder.getPrice() + "원 | 할인 : " + discountAmount + "원 | 결제 금액 : " + finalPrice + "원");

    }

}
