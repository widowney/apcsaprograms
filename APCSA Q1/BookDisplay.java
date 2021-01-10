public class BookDisplay
{
   public static void main (String[] args)
   {
      String book = "\"Neverwhere\"";
      String author = "Neil Gaiman";
      int numPages = 400;
      double cost = 13.60;
      System.out.println("\tBook:\t\t\t" + book);
      System.out.println("\tAuthor:\t\t\t" + author);
      System.out.printf("\tNumber of Pages:\t%d\n", numPages);
      System.out.printf("\tCost on Amazon:\t\t$%.2f", cost);
   }
}