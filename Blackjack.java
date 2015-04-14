import java.util.Scanner;
public class Blackjack{
  public static void main(String[] args){
    System.out.println("Welcome to blackjack for beginners!");
    System.out.println("In this game you will have on practice hand before any money is risked. Good luck!");
    System.out.println("");
    System.out.println("");
      int money;         
          int bet;            
          boolean playerWins;
          money = 100;  
          Scanner kb = new Scanner(System.in);

       
          while (true) { // Creates infinite loop until a break statement
            // Betting code
              System.out.println("You have " + money + " dollar(s).");
                 System.out.println("How much do you want to bet?  (Enter 0 to leave.)");
                 bet = kb.nextInt();
                 if (bet < 0 || bet > money){
                     System.out.println("You must bet between 0 and " + money + ".");
              }
            if(bet > 0 && bet < money){
              if (bet == 0)
                 break;
              else 
                playBlackjack();
            }
              playerWins = playBlackjack();
              if (playerWins)
                 money = money + bet;
              else
                 money = money - bet;
              System.out.println();
              if (money == 0) {
                 System.out.println("Looks like you're all out, better luck next time!");
                 break;
              }
          }
          
          System.out.println();
          System.out.println("You have " + money + ".");
       
       } 
   
    static boolean playBlackjack() { //Actually playing the game
          Deck deck; 
          Blackjackhand playerHand;
          Blackjackhand dealerHand;
          Scanner bk = new Scanner(System.in);
      
            
          
          deck = new Deck(); // New deck/hand for each player
          playerHand = new Blackjackhand();
          dealerHand = new Blackjackhand();
        
          
          deck.shuffle(); // SHuffles and deals
          dealerHand.addCard(deck.dealCard());
          dealerHand.addCard(deck.dealCard());
          playerHand.addCard(deck.dealCard());
          playerHand.addCard(deck.dealCard());
        
          if (dealerHand.getBlackjackValue() == 21) { // Check for dealer blackjack
               System.out.println("Dealer has the " + dealerHand.getCard(0) + " and the " + dealerHand.getCard(1) + ".");
               System.out.println("You hav the " + playerHand.getCard(0) + " and the " + playerHand.getCard(1) + ".");
               System.out.println();
               System.out.println("Dealer has Blackjack. Dealer wins! Better luck next time...");
               return false;
          }
          
          if (playerHand.getBlackjackValue() == 21) { // Check for Player blackjack
               System.out.println("Dealer has the " + dealerHand.getCard(0) + " and the " + dealerHand.getCard(1) + ".");
               System.out.println("You have the " + playerHand.getCard(0) + " and the " + playerHand.getCard(1) + ".");
               System.out.println();
               System.out.println("You have Blackjack. You win! Congratulations!");
               return true;
          }
          
          
          while (true || false) {// Another infinite loop, player chooses to hit or stand
    
    
               System.out.println();
               System.out.println();
               System.out.println("Your cards are:");
               for ( int i = 0; i < playerHand.getCardCount(); i++ )
                  System.out.println("    " + playerHand.getCard(i));
               System.out.println("Your total is " + playerHand.getBlackjackValue());
               System.out.println();
               System.out.println("Dealer is showing the " + dealerHand.getCard(0));
               System.out.println();
               System.out.println("Hit (1) or Stand (2)? ");
               int action;  
                  action = bk.nextInt();
                  if (action != 1 && action != 2)
                     System.out.println("Please respond with 1 or 2");
                  while (action != 1 && action != 2);
    
               if ( action == 2 ) { // Keeps current cards
                   break;
               }
               else {  // Gets a new card/result
                   Card newCard = deck.dealCard();
                   playerHand.addCard(newCard);
                   System.out.println();
                   System.out.println("User hits.");
                   System.out.println("Your card is the " + newCard);
                   System.out.println("Your total is now " + playerHand.getBlackjackValue());
                   if (playerHand.getBlackjackValue() > 21) {
                       System.out.println("Bust");
                       System.out.println("");
                       System.out.println("Dealer's other card was the " + dealerHand.getCard(1));
                       return false;
                   }
               }
          }
          System.out.println();
          System.out.println("User stands.");
          System.out.println("Dealer's cards are");
          System.out.println("    " + dealerHand.getCard(0));
          System.out.println("    " + dealerHand.getCard(1));
          while (dealerHand.getBlackjackValue() <= 17) { // Dealer hits until value above 17
             Card newCard = deck.dealCard();
             System.out.println("Dealer hits and gets the " + newCard);
             dealerHand.addCard(newCard);
             if (dealerHand.getBlackjackValue() > 21) {
                System.out.println();
                System.out.println("Dealer bust. You win!");
                return true;
             }
          }
          System.out.println("Dealer's total is " + dealerHand.getBlackjackValue());
          
          System.out.println();
          if (dealerHand.getBlackjackValue() == playerHand.getBlackjackValue()) {
             System.out.println("Dealer wins on a tie. You lose.");
             return false; 
          }
          else if (dealerHand.getBlackjackValue() > playerHand.getBlackjackValue()) {
             System.out.println("Dealer wins, " + dealerHand.getBlackjackValue() + " points to " + playerHand.getBlackjackValue() + ".");
             return false; 
          }
          else {
             System.out.println("You win, " + playerHand.getBlackjackValue() + " points to " + dealerHand.getBlackjackValue() + ".");
             return true;
          }
       }
    } 