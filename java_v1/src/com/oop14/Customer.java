package com.oop14;

public class Customer {

    private int customerID;
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private double bonusRatio;


    public Customer() {}

    public  int calcPrice(int price,String Grade) {
        if (Grade.equals("Gold")) {

        } else if (Grade.equals("VIP")) {

        } else {

        }        return 1;
    }

    public String showCustomerInfo() {
        return "";
    }
}
