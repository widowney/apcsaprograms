import java.util.Scanner;
import java.io.File;
public class EvensOdds
{
   public static void main(String [] args) throws Exception
   {
         
      int evensCount = 0;
      int oddsCount = 0;
      Scanner file = new Scanner(new File("numbers.dat"));
            
      while(file.hasNext())
      {	
         int fileNum = file.nextInt();
         if(fileNum % 2 == 0)
         {
           System.out.println(fileNum + " is even");
           evensCount++;
         }
         else if(fileNum % 2 != 0)
         {
            System.out.println(fileNum + " is odd");
            oddsCount++;
         }
         else
         {
            System.out.println("Invalid");
         }
         
      }
      System.out.println("There are " + oddsCount + " odd numbers and " + evensCount + " even numbers!");
  
   }
}