public class Playerhand{
import java.util.Vector;
   private Vector hand;   // Inspired from "professionally" written code, not really my idea. 
   
   public Hand() {
      hand = new Vector();
   }
   
   public void clear() {
      hand.removeAllElements();
   }
   
   public void addCard(Card c) {
      if (c != null)
         hand.addElement(c);
   }
   
   public void removeCard(Card c) {
      hand.removeElement(c);
   }
   
   public void removeCard(int position) {
      if (position >= 0 && position < hand.size())
         hand.removeElementAt(position);
   }
   
   public int getCardCount() {
      return hand.size();
   }
   
   public Card getCard(int position) {
      if (position >= 0 && position < hand.size())
         return (Card)hand.elementAt(position);
      else
         return null;
   }
}