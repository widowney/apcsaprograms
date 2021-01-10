
import java.util.Scanner;
public class Hypotenuse
{
   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      double leg1;double leg2;double hypotenuse;
      System.out.println("Enter the length of one leg of the triangle");
      leg1 = sc.nextDouble();
      System.out.println("Enter the length of another leg of the triangle");
      leg2 = sc.nextDouble();
      hypotenuse = Math.pow(leg1,2) + Math.pow(leg2,2);
      hypotenuse = Math.sqrt(hypotenuse);
      System.out.printf("The longest leg is:  %.2f",Math.max(leg1,leg2));
      System.out.printf("\nThe length of the Hypotenuse is:  %.2f",hypotenuse);
   }
}