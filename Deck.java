public class Deck {

    private Card[] deck;   
    private int cardsUsed; 
    
    public Deck() {
       deck = new Card[52];
       //
       for ( int suit = 0; suit <= 3; suit++ ) {
          for ( int value = 1; value <= 13; value++ ) {
             deck[cardCt] = new Card(value,suit);
             //cardCt++;
          }
       }
       cardsUsed = 0;
    }
    
    public void shuffle() {
        for ( int i = 51; i > 0; i-- ) {
            int shuf = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[shuf] = temp;
        }
        cardsUsed = 0;
    }