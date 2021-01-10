import java.util.Scanner;
import java.io.File;
public class RandomNumber
{
   public static void main(String []args) throws Exception
   {
      for(int i = 0; i < 3; i++)
      {
         
         int randNum = getRandomNumber(0, 99);           
         boolean match = false;
         Scanner inFile = new Scanner(new File("numbers.dat"));
         match = isInFile(randNum);
         if(match)
         {
            System.out.println("The random number " + randNum + " IS in the file.");        
         }
         else
         {
            System.out.println("The random number " + randNum + " IS NOT in the file.");
         }
      }
   }
   public static int getRandomNumber(int from, int to) throws Exception
   {
      return (int)(Math.random() * (to - from + 1) + from);
   }
   public static boolean isInFile(int randInt) throws Exception
   {                 
      Scanner inFile = new Scanner(new File("numbers.dat"));
      while(inFile.hasNext())
      {
         int num = inFile.nextInt();
         if(num == randInt)
         {
            return true;
         }
      }
      return false;     
   }
}