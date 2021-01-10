public class LineSegment
{
   private Point endPt1;
   private Point endPt2;
   
   public LineSegment()
   {
      endPt1 = new Point (0,0);
      endPt2 = new Point(1,1);
   }
   public LineSegment( int x1, int y1, int x2, int y2)
   {
      endPt1 = new Point(x1, y1);
      endPt2 = new Point(x2, y2);
   }
   public LineSegment(Point p1, Point p2)
   {
      endPt1 = new Point(p1.getX(), p1.getY());
      endPt2 = p2;
   }
   public Point getEndPt1()
   {
      return endPt1;
   }
   public Point getEndPt2()
   {
      return endPt2;
   }
   public void setEndPt1(Point newPoint)
   {
      endPt1 = newPoint;
   }
   public void setEndPt2(Point newPoint)
   {
      endPt2 = newPoint;
      
   }
}