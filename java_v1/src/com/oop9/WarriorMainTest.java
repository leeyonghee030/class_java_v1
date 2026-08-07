package com.oop9;

public class WarriorMainTest {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("홍길동");
        Warrior warrior2 = new Warrior("일지매");

        warrior.levelUp();
        //Warrior 의 멤버 변수에 접근 제어 지시자는 private이라 여기셍서 접근 불가능
        //그러면 외부에서 필요하다면 값을 확인할수있는방법은? 특히 값만
        //getter,setter 메서드를 사용해서 설계할수있다

        String resultName1 = warrior.getName();
        System.out.println(resultName1);

    }
}
