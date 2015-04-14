import java.util.Vector;
public class Playerhand{
   private Vector hand;   // Vector inspired from "professionally" written code, not my idea. 
   
   public Playerhand(){ 
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