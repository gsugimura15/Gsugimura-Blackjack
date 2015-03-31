public class Card {

    public static int Clubs = 0;
    public static int Diamonds = 1;
    public static int Hearts = 2;
    public static int Spades = 3;       
                            
    public static int Ace = 1;
    public static int Jack = 11; 
    public static int Queen = 12; 
    public static int King = 13;       
                            
    private int suit;   
                             
    private int value; 
                             
    public Card(int theValue, int theSuit) {
        value = aValue;
        suit = aSuit;
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
           default:       
             return "Invalid";
        }

   public String getStringValue() {
        switch ( value ) {
          case 1:   
             return "Ace";
           case 2:   
             return "2";
           case 3:   
             return "3";
           case 4:   
             return "4";
           case 5:   
             return "5";
           case 6:   
             return "6";
           case 7:   
             return "7";
           case 8:   
             return "8";
           case 9:   
             return "9";
           case 10:  
             return "10";
           case 11:  
             return "Jack";
           case 12:  
             return "Queen";
           case 13:  
             return "King";
           default:
             return "Invalid";
        }
    }
    
    public String toString() {
        return getStringValue() + " of " + getStringSuit();

} 