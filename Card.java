public class Card {

    public static int Clubs = 0;  // Suits
    public static int Diamonds = 1;
    public static int Hearts = 2;
    public static int Spades = 3;       
                            
    public static int Ace = 1; // Royals
    public static int Jack = 11; 
    public static int Queen = 12; 
    public static int King = 13;       
                            
    private int suit;   
                             
    private int value; 
                             
    public Card(int aValue, int aSuit) { // Card has suit and value
        value = aValue;
        suit = aSuit;
    }
        
    public int getSuit() { // Returns suit
        return suit;
    }
    
    public int getValue() { // Returns value
        return value;
    }
    
    public String getStringSuit() { //Inspired by "professional" code, not my idea...organized suits
        switch ( suit ) {
           case 1: return "Clubs";
           case 2: return "Diamonds";
           case 3: return "Hearts";
           default: return "Spades";
        }
    }
 
   public String getStringValue() {    //Organized values
        switch ( value ) {
          case 1: return "Ace";
          case 2: return "2";
          case 3: return "3";
          case 4: return "4";
          case 5: return "5";
          case 6: return "6";
          case 7: return "7";
          case 8: return "8";
          case 9: return "9";
          case 10:return "10";
          case 11:return "Jack";
          case 12:return "Queen";
          default: return "King";
        }
    }
    
    public String toString() { // Returns a string of the card 
        return getStringValue() + " of " + getStringSuit();

}
}
    