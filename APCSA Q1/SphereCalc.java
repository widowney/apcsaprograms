import java.util.Scanner;
public class SphereCalc
{  /*William R. Downey
     5th Period APCSA Anderson
     SphereCalc Program
    */
   public static void main(String []args)
   {
      System.out.print("Enter the radius of a sphere\n");//original text prompt
      Scanner input = new Scanner(System.in);//sets up scanner to take input
      double radius = input.nextDouble();//takes the first double input and stores in double radius
      if(radius >= 0)
      {
         System.out.printf("The diameter of the sphere: %.2f", (2*radius));//2r
         System.out.printf("\nThe circumference of the sphere: %.2f", ((2*Math.PI)*radius));//2(PI)r^2
         System.out.printf("\nThe surface area of the sphere: %.2f", ((4*Math.PI)*Math.pow(radius,2)));//4(PI)r^2
         System.out.printf("\nThe volume of the sphere: %.2f", (4.0/3.0*Math.PI)*Math.pow(radius,3));//needs to be 4.0 or 3.0 otherwise it truncates to 1
      }
      else
      {
         System.out.print("Invalid input");
      }
   }
}