import java.util.Scanner;
public class PretendQuiz
{
   public static void main(String []args)
   {
      String ans;
      int numCorrect = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Please answer T or F for every statement, Good Luck!");
      System.out.println("\n1) McDonald's made bublegum flavored broccoli:");
      ans = input.next();
      if (ans.equals("T"))
      {
         System.out.println("Great Job!");
         numCorrect++;
      }
      else if (ans.equals("F"))
      {
         System.out.println("Uh oh that isn't quite right");
      }
      else
      {
         System.out.println("Sorry I don't recognize that answer");
      }
      System.out.println("\n2) The first oranges were orange:");
      ans = input.next();
      if (ans.equals("F"))
      {
         System.out.println("Fantastic!");
         numCorrect++;
      }
      else if (ans.equals("T"))
      {
         System.out.println("Uh oh that isn't quite right");
      }
      else
      {
         System.out.println("Sorry I don't recognize that answer");
      }
      System.out.println("\n3) Peanuts aren't actually nuts:");
      ans = input.next();
      if (ans.equals("T"))
      {
         System.out.println("Wow, you're a genius !");
         numCorrect++;
      }
      else if (ans.equals("F"))
      {
         System.out.println("Uh oh that isn't quite right");
      }
      else
      {
         System.out.println("Sorry I don't recognize that answer");
      }
      System.out.println("\nThe longest word in the alphabet is 189,818 letters long");
      ans = input.next();
      if (ans.equals("F"))
      {
         System.out.println("A real english scholar!");
         numCorrect++;
      }
      else if (ans.equals("T"))
      {
         System.out.println("Uh oh that isn't quite right");
      }
      else
      {
         System.out.println("Sorry I don't recognize that answer");
      }
      System.out.println("You got " + numCorrect + "/4 questions correct!");
      System.out.println("%" + ((double)numCorrect/4)*100);
      if (numCorrect == 4)
      {
         System.out.println("Perfecto!");
      }
   }
}