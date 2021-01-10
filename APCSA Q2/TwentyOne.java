/**
* Play Dice 21 game against the computer.
* Player and computer try to get highest score without going over 21
*
* Will Downey
* 11/9/2018
*/
import java.util.Scanner;
public class TwentyOne
{
   static Scanner in = new Scanner(System.in);
   
   public static void main (String [] args)
   {
      int numWins = 0;
      int gamesPlayed = 0;
      int playAgain = 1;
   

      while (playAgain == 1)
      {
           
         numWins += playGame();
      
         System.out.print("\nPlay again? Enter 1 for yes: ");
         playAgain = in.nextInt();
         gamesPlayed++;
      }
      
      
      displayStats(numWins, gamesPlayed);
   }
      

   /**
   * This method controls game play by calling userPlay and
   * computerPlay and displaying the winner.
   * @return 1 if player wins, 0 if computer wins
   */
   public static int playGame()
   {  
      int uScore = userPlay();
      int cScore = computerPlay(uScore);
      if(uScore > cScore && uScore <= 21)
      {
         System.out.println("You win!");
         return 1;
      } 
      else if(uScore < cScore && cScore <= 21)
      {
         System.out.println("Computer wins");
         return 0;
      }
      else if(uScore > 21)
      {
         System.out.println("You busted, computer wins");
         return 0;
      }
      else if(cScore > 21)
      {
         System.out.println("Computer busted, you win!");
         return 1;
      }
      else
      {
         return 1;
      }
   }
   
   /**
   * This method controls the player's turn by calling takeTurn
   * until the player wants to stop rolling or busts. 
   * @return the player's score
   */
   public static int userPlay()
   {
      int uScore = 0;
      int tempScore;
      int play = 1;
      
      Scanner playAg = new Scanner(System.in);
      while(play == 1 && uScore <= 21)
      {  
         tempScore = takeTurn(uScore);
         uScore += tempScore;           
         System.out.println("You rolled a " + tempScore + "; your total score is: " + uScore);
         if(uScore <= 21)
         {   
            System.out.print("Enter 1 to roll 2 to quit: ");
            play = playAg.nextInt();
         }
         else
         {
            System.out.println("Your score is " + uScore);
         }
      }
      return uScore;
   }

   /**
   * This method controls the computer's turn by calling takeTurn
   * until the computer exceeds the player's score or busts. 
   * @param userScore This is the player's score
   * @return the computer's score
   */
   public static int computerPlay(int userScore)
   {
      int cScore = 0;
      int tempScore = 0;
      int play = 1;
      
      while(userScore > cScore && userScore <= 21)
      {  
         tempScore = takeTurn(cScore);
         cScore += tempScore;           
         System.out.println("Computer rolled a " + tempScore + "; score is: " + cScore);
      }
      if(userScore > 21)
      {
         System.out.println("Computer stops");
      }
      return cScore;
   }
   
   /**
   * This method controls the dice rolling by calling rollOneDie.
   * Two dice are rolled when the score is less than 14; one die 
   * otherwise.  
   * @param score This is the current score
   * @return integer value of one or two dice rolls
   */
   public static int takeTurn(int score)
   {
      int totalAdd = 0;
      if(score < 14)
      {
         totalAdd += rollOneDie();
         totalAdd += rollOneDie();
      }
      else if(score >= 14)
      {
         totalAdd += rollOneDie();
      }
      return totalAdd;
   }
   
   /**
   * This method simulates the roll of one die  
   * @return integer value of the roll of one die
   */
   public static int rollOneDie()
   {
      return (int)(Math.random() * 6) + 1;
   }
   
   /**
   * This method displays games won and games lost  
   * @param win This is the number of games won
   * @param total This is the total number of games played
   */
   public static void displayStats(int won, int total)
   {
      System.out.println("Games won: " + won);
      System.out.println("Games lost: " + (total - won));
   }
}
