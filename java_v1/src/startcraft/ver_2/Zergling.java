package startcraft.ver_2;

public class Zergling {

    private String name;
    private int power;
    private  int hp;

    public Zergling(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 50;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public  int getHp() {
        return hp;
    }


    //1. 이 질럿을 공격합니다
    public void attack(Zealot zealot) {
        if (this.hp <= 0 && zealot.getHp() <= 0) {
            System.out.println("공격할수없습니다");
        } else if (this.hp <= 0) {
            System.out.println(this.name + "사망해서 공격할수없습니다");
        } else if (zealot.getHp() <= 0) {
            System.out.println(zealot.getName() + "사망했습니다");
        } else {
            zealot.setHp(zealot.getHp() - this.power);
            System.out.println(name + "이 " + zealot.getName() + "을 공격합니다");
        }
    }


    //2. 질럿이 마린을 공격합니다

    public void attack(Marine marine) {
        if (this.hp <= 0 && marine.getHp() <= 0) {
            System.out.println("공격할수없습니다");
        } else if (this.hp <= 0) {
            System.out.println(this.name + "사망해서 공격할수없습니다");
        } else if (marine.getHp() <= 0) {
            System.out.println(marine.getName() + "사망했습니다");
        } else {
            marine.setHp(marine.getHp() - this.power);
            System.out.println(name + "이 " + marine.getName() + "을 공격합니다");
        }
    }

    //3, 자기 자신(질럿)이 공격을 당합니다.
    public void beAttacked(int power) {
        if (this.hp <= 0) {
            this.hp = 0;
            System.out.println(this.name + "이 사망했습니다");
        } else {
            this.hp -= power;
            System.out.println(name + "이 공격을 당했습니다");
        }
    }

    //4. 내 현재 상태 출력 기능
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("공격력: " + power);
        System.out.println("체력: " + hp);
    }

}
