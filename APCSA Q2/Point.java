	
public class Point    
{
   private int x;   //data fields
   private int y;
//default constructor
   public Point()
   {
      x = 0;
      y = 0;
   }
//constructor      
   public Point(int nX, int nY)    
   {       
      x = nX;       
      y = nY;      
   }
//mutator method 
   public void setX(int newX)
   {
      x = newX; 
   } 
//mutator method     
   public void advance()    
   {       
      x++;       
      y++;      
   }

//mutator method  
   public void setY(int newY) 
   { 
      y = newY; 
   
   } 
//mutator method     
   public void mult(int scalar)    
   {       
      x = x * scalar;    
      y = y * scalar;     
   }

//accessor method   public int getX() { return x; }  

//lets you SOP a coordinate object   

   public String toString()//     
   {       
      return ("(" + x + ", " + y +")");    
   } 
   
   public boolean equals(Object obj)
   {
      Point p = (Point)obj; 
      if(p.x == this.x && p.y == this.y)
         return true;
      else
         return false;          
   }      

//accessor method
   public int getY() 
   { 
      return y; 
   } 
   public double distanceTo(Object obj)
   {
      Point p = (Point)obj; 
      return Math.sqrt(Math.pow((this.x - p.x),2) + Math.pow((this.y - p.y),2));
   }

}