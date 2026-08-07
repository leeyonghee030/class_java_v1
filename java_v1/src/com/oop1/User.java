package com.oop1;

import java.nio.file.LinkOption;
import java.time.LocalDateTime;

public class User {
    private long userId;    //고유 번호
    private String userName; //이름
    private int age;      // 나이
    private String email; //이메일
    private String phoneNumber;       // 전화번호
    private String gender;            // 성별 (M / F)
    private boolean isMember;         // 회원 유무 (true / false)
    private LocalDateTime joinDate;   // 가입일자
    private String loginId;  // 아이디
    private String password; // 비번
    private String address; //주소
}