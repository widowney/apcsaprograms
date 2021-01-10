import java.util.Scanner;
public class Test
{
   public static void main(String []args)
   {
      System.out.print("Input a decimal number: ");
      Scanner input = new Scanner(System.in);
      double x = input.nextDouble();
      System.out.printf("Your number is: %.2f", x);
     }
}