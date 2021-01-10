/*
   Read file from a keyboard.
	Fix the compiler errors
*/
import java.util.Scanner;
import java.io.File;
public class FileInput	
{

   public static void main(String [] args) throws Exception
   {
   
      int sum = 0;
      int count = 0;
      Scanner file = new Scanner(new File("numbers.dat"));      
      while(file.hasNext())
      {	
         //System.out.print("\nPlease enter an integer: ");
         sum += file.nextInt();
         count++;
         //System.out.print("Enter more numbers? (Y or N): ");
         //more = file.next();
      }
      
      System.out.printf("\nThe average is %.2f", (double)sum/count);
   }
}
