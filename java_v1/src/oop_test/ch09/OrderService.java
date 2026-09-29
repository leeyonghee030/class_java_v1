package oop_test.ch09;



import java.util.List;

public class OrderService {
    //인터페이스로 참여
    private oop_test.ch09.DiscountPolicy discountPolicy;
    private OrderDao orderDao;

    public OrderService(DiscountPolicy discountPolicy,OrderDao orderDao) {
        this.discountPolicy =  discountPolicy;
        this.orderDao = orderDao;
    }

    public void takeOrder(String menuName, int price) {
        oop_test.ch09.Order newOrder = new oop_test.ch09.Order(menuName, price);
        orderDao.insert(newOrder);
    }

    public void printAllOrders() {
        List<oop_test.ch09.Order> orders = orderDao.findAll();
        System.out.println("--- 전체 주문 내역 ---");
        for (oop_test.ch09.Order order : orders) {
            int discountAmount = discountPolicy.discount(order.getPrice());
            int finalPrice = order.getPrice() - discountAmount;
            System.out.println(order.getMenuName() +  " | 결제 금액 : " + finalPrice + "원");

        }
    }

}
