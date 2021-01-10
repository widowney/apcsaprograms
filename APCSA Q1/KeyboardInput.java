/*
   Read input from a keyboard.
	Fix the compiler errors
*/
import java.util.Scanner;
public class KeyboardInput	
{

   public static void main(String [] args) throws Exception
   {
   
      int sum = 0;
      int count = 0;
      Scanner input = new Scanner(System.in);
      String more = "Y";
      
      while(more.equals("Y"))
      {	
         System.out.print("\nPlease enter an integer: ");
         sum += input.nextInt();
         count++;
         System.out.print("Enter more numbers? (Y or N): ");
         more = input.next();
      }
      
      System.out.printf("\nThe average is %.2f", (double)sum/count);
   }
}
