package startcraft.ver_1;

public class GameTest {


    public static void main(String[] args) {

        Marine marine = new Marine("마린");
        Zealot zealot = new Zealot("질럿");
        Zergling zergling = new Zergling("저글링");

        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackMarine(marine);
        zealot.attackZergling(zergling);

        zergling.attackZealot(zealot);
        marine.attackZealot(zealot);


    }


}
