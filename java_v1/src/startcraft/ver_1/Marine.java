package startcraft.ver_1;

public class Marine {

    private String name;
    private int power;
    private  int hp;

    public Marine(String name) {
        this.name = name;
        this.power = 4;
        this.hp = 70;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public  int getHp() {
        return hp;
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

    //1. 질럿이 저글링을 공격합니다
    public void attackZergling(Zergling zergling) {
        if (this.hp <= 0 && zergling.getHp() <= 0) {
            System.out.println("공격할수없습니다");
        } else if (this.hp <= 0) {
            System.out.println(this.name + "사망해서 공격할수없습니다");
        } else if (zergling.getHp() <= 0) {
            System.out.println(zergling.getName() + "사망했습니다");
        } else {
            zergling.setHp(zergling.getHp() - this.power);
            System.out.println(name + "이 " + zergling.getName() + "을 공격합니다");
        }
    }


    //2. 질럿을 공격합니다

    public void attackZealot(Zealot zealot) {
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
