public class ForSum
{
   public static void main(String []args)
   {
      int sum = 0;
      for(int count = 0; count <= 50; count += 2)// count += 2 makes it only take the evens, if count started at 1 it would only do odds
      {
         sum += count;
         
      }
      System.out.printf("The sum is %d", sum);
   }
}