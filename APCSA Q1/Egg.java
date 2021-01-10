import java.util.Scanner;
public class Egg
{
   public static void main(String []args)
   {
      int main;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an integer: ");
      int num = input.nextInt();
      if (num == 0)
      {
         System.out.print("The number 0 is neither odd nor even or positive/negative");
      }
         else if(Math.abs(num % 2) == 0)
         {
         System.out.println("The number " + num + " is even.");
         }
            else
            {
               System.out.println("The number " + num + " is odd.");
            }
      if(num > 0)
      {
         System.out.println("The number " + num + " is positive.");
      }
            else if(num < 0)
            {
               System.out.println("The number " + num + " is negative.");
            }        
   }
}