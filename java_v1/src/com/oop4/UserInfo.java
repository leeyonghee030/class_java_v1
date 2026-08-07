package com.oop4;

public class UserInfo {

    String userId;
    String userPassword;
    String userName;
    String userAddress;
    String phoneNumber;

    // 객체가 생성될 떄 가장 먼저 실행되는 부분은 생성자이다
    public UserInfo(String id) {
        userId = id;
    }

    public UserInfo(String id, String password) {
        userId = id;
        userPassword = password;

    }

    public UserInfo(String id, String password, String address) {
        userId = id;
        userPassword = password;
        userAddress = address;
    }

    public UserInfo(String id, String password, String address, String phone) {
        userId = id;
        userPassword = password;
        userAddress = address;
        phoneNumber = phone;
    }



}

