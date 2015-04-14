public class Blackjackhand extends Playerhand {
 
     public int getBlackjackValue() {     
         int val;      
         boolean ace; // In preparation to check for Ace  
         int cards;    

         val = 0;
         ace = false;
         cards = getCardCount();

         for (int i = 0;  i < cards;  i++) {  // Checks for blackjack             
             Card card;   
             int cardVal;  
             card = getCard(i);
             cardVal = card.getValue();  
             if (cardVal > 10) {
                 cardVal = 10;   
             }
             if (cardVal == 1) {
                 ace = true;   
             }
             val = val + cardVal;
          }
          if (ace == true && val + 10 <= 21) // Chooses whether or not Ace should be 1 or 11 (depending on which is better for you) 
              val = val + 10; 
          return val;

     }  
 
} 
