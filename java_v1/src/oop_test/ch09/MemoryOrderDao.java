package oop_test.ch09;


import java.util.ArrayList;
import java.util.List;

public class MemoryOrderDao implements OrderDao {
    private List<oop_test.ch09.Order> orderList = new ArrayList<>();

    @Override
    public void insert(oop_test.ch09.Order order) {
        orderList.add(order);
        System.out.println(order.getMenuName() + " 주문이 접수되었습니다.");
    }

    @Override
    public List<Order>findAll() {
        return orderList;
    }
}