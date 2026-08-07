package com.oop10;

import java.util.Random;

public class LottoNumberMaker {
    //static 변수활용
    //난수 생성기 하나 만들어서 계속 재사용해보자
    private static Random random = new Random();

    //static 메서그 1부터 45 사의 번호를 하나 만들어서 반화하낟
    public static int makeNumber() {
        return random.nextInt(45)+1;
    }
}
