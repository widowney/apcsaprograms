import java.util.Scanner;
public class TriangleType
{
/* Will Downey Pd. 4 Triangle type lab*/ 

   public static void main(String[] args)
   {  
      System.out.print("Enter the sides of a triangle:");// asks for input
      Scanner sc = new Scanner(System.in);
      double a = sc.nextDouble();// defining variable 
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      double large = 0;
      double mid = 0;
      double small = 0;
      if(a==b||b==c||a==c)// looking if any of the variable are = to each other & then defining them properly
      {
         if(a==b && b!=c)
         {
            if(a > c)
            {
               a = large;
               b = mid;
               c = small;
            }
            else
            {
               c = large;
               b = mid;
               a = small;
            }
         }
         else if(b==c && a!=b)
         {
            if(b > a)
            {
               b = large;
               c = mid;
               a = small;
            }
            else
            {
               a = large;
               b = mid;
               c = small;
            }
         }
         else if(a==c && b!=a)
         {
            if(a > b)
            {
               a = large;
               c = mid;
               b = small;
            }
            else
            {
               b = large;
               c = mid;
               a = small;
            }  
         }
         
      }
      else if(a > b && a > c)// code if a is largest
      {
         large = a;
         if(b > c)
         {
            mid = b;
            small = c;
         }
         else if(c > b) 
         {
            mid = c;
            small = b;
         } 
         else if(c == b)
         {
            mid = c;
            small = b;
         }
               
      }
      else if(b > a && b > c)// code if b is largest
      {
         large = b;
         if(a > c)
         {
            mid = a;
            small = c;
         }
         else if(c > a) 
         {
            mid = c;
            small = a;
         }
         else if(c == a)
         {
            mid = c;
            small = a;
         }
      }  
      else if(c > b && c > a )// code if c is largest
      {
         large = c;
         if(a > b)
         {
            mid = a;
            System.out.println(mid);
            small = b;
            System.out.println(small);
         }
         else if(b > a)
         {
            mid = b;
            small = a;
         }
         else if(b == a)
         {
            mid = b;
            small = a;
         }
      }
      if(small + mid > large)
      {         
         if(Math.pow(mid, 2) + Math.pow(small, 2) == Math.pow(large, 2) && a != 0 && b != 0 && c != 0)
         {
            System.out.println("These values make a Right triangle");
            // if statement uses pythagorean theorems to decide triangle type
            // first  3 if statements needs to make sure no values are 0 b/c a triangle can't have a side of 0
         }
         else if((Math.pow(mid, 2)) + (Math.pow(small, 2)) > Math.pow(large, 2) && a != 0 && b != 0 && c != 0)
         {
            System.out.println("These values make an Acute triangle");
         }
         else if(Math.pow(mid, 2) + Math.pow(small, 2) < Math.pow(large, 2) && a != 0 && b != 0 && c != 0)
         {
          System.out.println("These values make an Obtuse triangle");
         }
         else
         {
            System.out.println("What, are you crazy, these values don't even make a triangle");
         }
      }
      else
      {
         System.out.println("What, are you crazy, these values don't even make a triangle");
      }
   }
}