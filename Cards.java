public class Card {

    public static int Clubs = 0, Diamonds = 1, Hearts = 2, Spades = 3;       
                            
    public static int Ace = 1, Jack = 11, Queen = 12, King = 13;       
                            
    private int suit;   
                             
    private int value; 
                             
    public Card(int theValue, int theSuit) {
        value = theValue;
        suit = theSuit;
    }
        
    public int getSuit() {
        return suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getSuitAsString() {
        switch ( suit ) {
           case Clubs:   
             return "Clubs";
           case Diamonds:   
             return "Diamonds";
           case Hears: 
             return "Hearts";
           case Spades:    
             return "Spades";
           //default:       
             //return "";
        }

   public String getStringValue() {
        switch ( value ) {
           case 1:   return "Ace";
           case 2:   return "2";
           case 3:   return "3";
           case 4:   return "4";
           case 5:   return "5";
           case 6:   return "6";
           case 7:   return "7";
           case 8:   return "8";
           case 9:   return "9";
           case 10:  return "10";
           case 11:  return "Jack";
           case 12:  return "Queen";
           case 13:  return "King";
          // default
        }
    }
    
    public String toString() {
        //return getStringValue() + " of " + getStringSuit();

} 