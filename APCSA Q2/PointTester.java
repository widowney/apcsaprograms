public class PointTester
{
   public static void main(String[] args)
   {
      Point ptA = new Point(1,5);
      Point ptB = new Point(4,5);
      Point ptC = new Point();
      System.out.println(ptA);
      System.out.println(ptB);
      System.out.println(ptC);
      System.out.printf("%.2f", ptA.distanceTo(ptC));    
   }
}