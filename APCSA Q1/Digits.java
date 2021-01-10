import java.util.Scanner;
public class Digits
{  /*William R. Downey
     4th Period APCSA Anderson
     Digits
   */
   public static void main(String []args)
   {
     System.out.print("Enter a positive integer with 4 digits: "); 
     Scanner input = new Scanner(System.in);
     int x = input.nextInt();//collects user input and stores in integer x
     int eqn1 = (x%1000);//eqns needed in next step (used to simplify code)
     int eqn2 = (eqn1%100);
     int eqn3 = (eqn2%10);
     int eqn4 = (eqn3%1);
     int xThousand = x - eqn1;//calculations for each digits place
     int xHundred = eqn1 - eqn2;
     int xTen = eqn2 - eqn3;
     int xOne = eqn3 - eqn4;
     System.out.print(x + " = " + xThousand + " + " + xHundred + " + " + xTen + " + " + xOne);//formats output
   }
  
}