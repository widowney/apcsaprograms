import java.util.Scanner;
public class GuessTheNumber
{
   static Scanner input = new Scanner(System.in);
   static final int MAX = 5;
   static final int MIN = 1;
   static final int NUM_GUESSES = 4;
   public static void main(String []args)
   {
      int randNum;
      String playAgain = "Y";
      
      
      while(playAgain.equals("Y"))
      {
         int guessCount = 1;
         System.out.println("Enter your Guess (1-25): ");
         randNum = genRandomNumber(MIN, MAX);
         int num = 0;
         while(userGuesses(guessCount) == true)
         {
            num = input.nextInt();
            if(num == randNum)
            {
               System.out.println("You win!! The number was " + randNum);
               System.out.println("Would you like to play again? (Y or N)");
               playAgain = input.next();
               guessCount = 5;
            }

            else
            {  
               if(num > randNum)
               {
                  System.out.println("Too High");
               }
               else if(num < randNum)
               {
                  System.out.println("Too Low");
               }
               System.out.println("Guess Again: ");
               guessCount++;    
            }
                   
         }
         if(num != randNum)
         {
            System.out.println("Ur trash m8. The number was " + randNum);
            System.out.println("Would you like to play again? (Y or N)");
            playAgain = input.next();
         }
         guessCount++;
      }
      
      
   }
   public static int genRandomNumber(int from, int to)
   {
      int rand = (int)(Math.random()*(to - from + 1) + from);
      return rand;
   }
   public static boolean userGuesses(int num)
   {
      if(num <= NUM_GUESSES)
      {
         return true;
         
      }
      else
      {
         return false;
      }
   }
      
}