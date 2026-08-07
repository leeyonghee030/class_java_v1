package startcraft.ver_2;

public class GameTest {


    public static void main(String[] args) {

        Marine marine = new Marine("마린");
        Zealot zealot = new Zealot("질럿");
        Zergling zergling = new Zergling("저글링");

        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(marine);
        zealot.attack(zergling);

        zergling.attack(zealot);
        marine.attack(zealot);


    }


}
