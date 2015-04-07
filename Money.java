public class Money extends Blackjack{
   int money;         
          int bet;            
          boolean playerWins;
          money = 100;  
       
          while (true) {
              System.out.println("You have " + money + " dollars.");
              do {
                 System.out.println("How much do you want to bet?  (Enter 0 to leave.)");
                 //System.out.println("? ");
                 bet = TextIO.getlnInt();
                 if (bet < 0 || bet > money)
                     System.out.println("You must bet between 0 and " + money + ".");
              } while (bet < 0 || bet > money);
              if (bet == 0)
                 break;
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
          System.out.println("You have" + money + ".");
       
       }  
   