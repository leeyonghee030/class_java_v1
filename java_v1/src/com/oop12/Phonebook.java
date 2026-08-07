package com.oop12;

public class Phonebook {
    private String name;
    private String phoneNumber;

    public Phonebook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public  void  showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
    }
}
