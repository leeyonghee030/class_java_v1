package com.oop4;

public class CoffeeMachine {

    //커피머신의 상태(필드) : 물의 양(ml), 커피 원두 양(g)

     int water;
     int coffee;
     int count;

    //생성자 직접 설계해서 테스트 코드 작성해보기
    public CoffeeMachine() {
    }

     public CoffeeMachine(int w, int c) {
        water += w;
        coffee += c;
    }

    //메서드 1. 물채우기
     void refillWater(int amount) {
        if (amount > 0) {
            water += amount;
            System.out.println(amount + "ml 물을 채웠습니다");
        } else {
            System.out.println("0보다 큰 양의 물을 채워주세요");
        }
    }

    //메서드 2. 원두 채우기
     void refillCoffee(int amount) {
        if (amount > 0) {
            coffee += amount;
            System.out.println(amount + "g의 커피 원두를 채웠습니다");
        } else {
            System.out.println("0보다 큰 양의 원두를 채워주세요");
        }
    }

    //메서드 3. 커피 만들기
     String makeCoffee() {
        //방어적코드
        // 커피 한잔에 물 100ml 원두 10g
        if (water >= 100 && coffee >= 10) {
            count++;
            water -= 100;
            coffee -= 10;
            return "맛있는 커피 한 잔 완성";
        } else {
            return "재료가 부족해요! 물이나 원두를 채워주세요";
        }
    }

    //메소드4. 해당하는 객체의 현재 상태값을 보여준느 기늩추가
    // 단 여기서 콘송창에 출력하는 기능
     void showInfo() {
        System.out.println("물은 " + water + "ml 있습니다");
        System.out.println("원두는 " + coffee + "g 있습니다");
    }

    //현재 해당하는 커피 머신이 몇잔의 커피를 만들었는지 출력하는기능
     void getCount() {
         System.out.println("지금까지 " + count + "번 만들었습니다");
    }



}
