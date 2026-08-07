package comoop15;

public class CardDeckMainTest {

    public static void main(String[] args) {

        PokemonCard pokemonCard1 = new PokemonCard("피까츄");
        PokemonCard pokemonCard2 = new PokemonCard("이부이");

        CardDeck cardDeck = new CardDeck();

        cardDeck.addCard(pokemonCard1);
        cardDeck.addCard(pokemonCard2);

        pokemonCard1.showInfo();

        cardDeck.showInfo();


    }
}
