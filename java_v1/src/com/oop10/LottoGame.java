package com.oop10;

public class LottoGame {

    public static void main(String[] args) {
        int lottoNum1 = LottoNumberMaker.makeNumber();
        int lottoNum2 = LottoNumberMaker.makeNumber();
        int lottoNum3 = LottoNumberMaker.makeNumber();
        int lottoNum4 = LottoNumberMaker.makeNumber();
        int lottoNum5 = LottoNumberMaker.makeNumber();
        int lottoNum6 = LottoNumberMaker.makeNumber();

        System.out.println(lottoNum1 + ", " + lottoNum2 + ", " + lottoNum3 + ", "
        +  lottoNum4 + ", " + lottoNum5 + ", " + lottoNum6);

        // LottoNumberMaker 객체를 단 하나도 만득적이 없다.
        // 그렇지만 실행되는 이유는 static이기 떄문이다

    }
}
