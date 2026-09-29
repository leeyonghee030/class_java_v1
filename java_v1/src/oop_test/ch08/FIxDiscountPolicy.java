package oop_test.ch08;

public class FIxDiscountPolicy implements DiscountPolicy{

    private int discountAmount = 1000;

    @Override
    public int discount(int price) {
        return discountAmount;
    }
}
