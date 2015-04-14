public class Deck {

    private Card[] deck;   // Array of cards in deck
    private int cardsUsed; // How many cards used
    
    public Deck() { // Straight deck of cards
       deck = new Card[52];
       int cardCt = 0;
       for (int suit = 0; suit <= 3; suit++) {
          for (int value = 1; value <= 13; value++) {
             deck[cardCt] = new Card(value,suit);
             cardCt++;
          }
       }
       cardsUsed = 0;
    }
    
    public void shuffle() { // Shuffles cards
        for (int i = 51; i > 0; i--) {
            int shuf = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[shuf];
            deck[shuf] = temp;
        }
        cardsUsed = 0;
    }
        
          public Card dealCard() { // Deals one card out
        if (cardsUsed == 52)
           shuffle();
        cardsUsed++;
        return deck[cardsUsed - 1];
          }
        public int cardsLeft() {// Decreases cards in deck 
        return 52 - cardsUsed;
    }
}