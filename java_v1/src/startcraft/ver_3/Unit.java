package startcraft.ver_3;

public class Unit {

    protected String name;
    protected int power;
    protected  int hp;

    public Unit(String name) {
        this.name = name;
        this.power = power;
        this.hp = hp;
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

    public void attack(Unit unit) {
        if (this.hp <= 0 && unit.getHp() <= 0) {
            System.out.println("공격할수없습니다");
        } else if (this.hp <= 0) {
            System.out.println(this.name + "사망해서 공격할수없습니다");
        } else if (unit.getHp() <= 0) {
            System.out.println(unit.getName() + "사망했습니다");
        } else {
            unit.setHp(unit.getHp() - this.power);
            System.out.println(name + "이 " + unit.getName() + "을 공격합니다");
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
