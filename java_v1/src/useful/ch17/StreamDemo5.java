package useful.ch17;

import java.util.Arrays;
import java.util.List;

public class StreamDemo5 {
        //map 변환
    public static void main(String[] args) {
        //원래 금액 10% 할인된 금액을 만들어야 할떄
        List<Double> prices = Arrays.asList(100.0,200.0,300.0);

        List<Double> discountPrices = prices.stream()
                .map(p -> p * 0.9)
                .toList();

        discountPrices.forEach(e-> System.out.println("할인된 가격 : " + e));


    }
}
