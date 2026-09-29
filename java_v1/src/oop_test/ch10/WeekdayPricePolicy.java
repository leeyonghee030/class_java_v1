package oop_test.ch10;

public class WeekdayPricePolicy implements PricePolicy{
    private int discountAmount = 1000;


    @Override
    public int calculate(int price) {
        return discountAmount;
    }
}
