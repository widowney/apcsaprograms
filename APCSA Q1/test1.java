import java.util.Scanner;
public class test1
{
   public static void main(String []args)
   {
      System.out.print("Enter num: ");
      Scanner input = new Scanner(System.in);
      double num = input.nextDouble();
      System.out.printf("The square root of %.2f: %.2f",num, Math.sqrt(num));
      System.out.printf("\n%.2f to the sixth power is: %,.2f",num,Math.pow(num,6));
   }
}