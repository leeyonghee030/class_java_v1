package comoop15;

public class PokemonCard {

    private String name;

    public PokemonCard(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println(name + " 카드 입니다");
    }

}
