public class WhileSum
{
   public static void main(String []args)
   {
      int sum = 0;
      int count = 1;
      while(count <= 50)
      {
         sum  += count;
         count++;
      }
      System.out.printf("\nThe sum is %d", sum);
   }
}