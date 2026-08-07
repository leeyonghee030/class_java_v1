package comoop15;

public class HouseMainTest {


    public static void main(String[] args) {

       House house = new House("부산시 진구");

       house.showInfo();

       house = null;
       //GC 대상은 House, Room 둘다 제거 대상이다
    }
}
