package oop_test.ch09;

import oop_test.ch09.DiscountPolicy;

public class FIxDiscountPolicy implements DiscountPolicy {

    private int discountAmount = 1000;

    @Override
    public int discount(int price) {
        return discountAmount;
    }
}
