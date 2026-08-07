package comoop15;

public class CardDeck {

    private PokemonCard[] pokemonCards;
    private int cardCount;

    public CardDeck() {
        this.pokemonCards = new PokemonCard[50];
        this.cardCount = 0;
    }

    public void addCard(PokemonCard card) {
        if (cardCount >= pokemonCards.length) {
            System.out.println("카드가 가득 찼습니다");
        } else {
                pokemonCards[cardCount] = card;
                cardCount++;
                System.out.println("카드가 저장되었습니다");
        }
    }

    public void showInfo() {
        for (int i = 0; i < cardCount; i++) {
            pokemonCards[i].showInfo();
        }
    }

}
