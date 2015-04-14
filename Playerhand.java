import java.util.Vector;
public class Playerhand{
   private Vector hand;   // Vector inspired from "professionally" written code, not my idea. 
   
   public Playerhand(){  //Empty hand
      hand = new Vector();
   }
   
   public void clear() { // Gets rid of all the cards in the hand
      hand.removeAllElements();
   }
   
   public void addCard(Card c) { // Adds cards to the hand
      if (c != null)
         hand.addElement(c);
   }
   
   public void removeCard(Card c) { // Removes cards from the hand
      hand.removeElement(c);
   }
      public void removeCard(int position) { // Card is removed from valid position
      if (position >= 0 && position < hand.size())
         hand.removeElementAt(position);
   }
   
      public Card getCard(int position) { // Gets the card from a specified position 
      if (position >= 0 && position < hand.size())
         return (Card)hand.elementAt(position);
      else
         return null;
   }
   
   public int getCardCount() { // Returns number of cards in the hand
      return hand.size();
   } 
}