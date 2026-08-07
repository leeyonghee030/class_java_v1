package com.oop1;

import java.time.LocalDateTime;

public class Order {
    private Long orderId;             // 주문번호
    private String customerName;      // 주문자
    private LocalDateTime orderDate;  // 주문일자
    private String productName;       // 상품명
    private int quantity;             // 상품갯수
    private int price;                // 상품금액 (단가)
    private int totalPrice;           // 총금액
}
