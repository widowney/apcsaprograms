public class Car
{  
   private int speed;
   private String color;

   public Car()
   {
      speed = 0;
      color = "";
   }
   public Car(String inColor, double inSpeed)
   {
      speed = (int)inSpeed;
      color = inColor;
   }
   public double getSpeed()
   {
      return speed;
   }
   public String getColor()
   {
      return color;
   }
   public void setSpeed(double inSpeed)
   {
      speed = (int)inSpeed;
   }
   public void setColor(String inColor)
   {
      color = inColor;
   }
   public void go()
   {
      if(speed == 0)
      {
         speed = 60;
      }
      System.out.println("The car is going " + speed + " mph");
   }
   public void go(double inSpeed)
   {
      speed = (int)inSpeed;
      System.out.println("The car is going " + speed + " mph");
   }
   public void stop()
   {
      speed = 0;
      System.out.println("The car is not moving. The speed is " + speed);
   }
   public String toString()
   {
      return "The " + color + " car is going " + speed + " mph";
   }
   public boolean equals(Object obj)
   { 
      Car p = (Car)obj;
      return p.speed == this.speed;
   }
}