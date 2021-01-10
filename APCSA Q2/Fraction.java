public class Fraction
{
   /* Will Downey APCSA PD. 4 */
   private int denominator;
   private int numerator;
   public Fraction()//default constructor
   {
      numerator = 1;
      denominator = 1;
   }
   public Fraction(int n, int d)
   {
      numerator = n;
      denominator = d;
   }
   public Fraction add(Fraction aFraction)
   {
      numerator = (this.numerator * aFraction.denominator) + (aFraction.numerator * this.denominator);
      denominator = (this.denominator * aFraction.denominator);
      reduce();
      Fraction outFraction = new Fraction(numerator, denominator);
      return outFraction;
   }
   public Fraction subtract(Fraction aFraction)
   {
      numerator = (this.numerator * aFraction.denominator) - (aFraction.numerator * this.denominator);
      denominator = (this.denominator * aFraction.denominator);
      reduce();
      Fraction outFraction = new Fraction(numerator, denominator);
      return outFraction;
   }
   public Fraction multiply(Fraction aFraction)
   {
      numerator = (this.numerator * aFraction.numerator);
      denominator = (this.denominator * aFraction.denominator);
      reduce();
      Fraction outFraction = new Fraction(numerator, denominator);
      return outFraction;
   }
   public Fraction divide(Fraction aFraction)
   {
      numerator = (this.numerator * aFraction.denominator);
      denominator = (this.denominator * aFraction.numerator);
      reduce();
      Fraction outFraction = new Fraction(numerator, denominator);
      return outFraction;
   }
   public boolean equals(Fraction aFraction)
   {
      return aFraction.decimalValue() == this.decimalValue() ? true : false;
   }
   public double decimalValue()
   {
      return (double)this.numerator / (double)this.denominator;
   }
   public int getDenominator()
   {
      return denominator;
   }
   public int getNumerator()
   {
      return numerator;
   }
   public void reduce()
   {
      double gcm = gcm(this.numerator, this.denominator);//initializes a variable for the greatest common multiple
      if(numerator >= 0 && denominator > 0)
      {
         
         this.numerator = this.numerator / (int)gcm;//Uses Eucleidian algebra to simplify fractions by dividing by gcm
         this.denominator = this.denominator / (int)gcm;
      }
      else if(numerator < 0  && denominator < 0)
      {
         this.numerator = Math.abs(this.numerator / (int)gcm);
         this.denominator = Math.abs(this.numerator / (int)gcm);
      }
      else if(numerator < 0 || denominator < 0)
      {
         this.numerator = (this.numerator / (int)gcm);
         this.denominator = (this.denominator /(int)gcm);
         this.numerator -= this.numerator * 2;
         this.denominator = Math.abs(this.denominator);
      }
   }
   public void setDenominator(int inDenominator)
   {
      denominator = inDenominator;
   }
   public void setNumerator(int inNumerator)
   {
      numerator = inNumerator;
   }
   public String toString()
   {
      reduce();       
      if (denominator == 1)
         return numerator + "";
      else if (denominator == -1)
         return numerator * -1 + "";
      return numerator + "/" + denominator;
   }
   public static double gcm(int a, int b)
   {
      return b == 0 ? a : gcm(b, a % b);//find the greastest common multiple of 2 numbers
   }
   public int compareTo(Fraction aFraction)
   {
      return this.decimalValue() == aFraction.decimalValue() ? 0 : this.decimalValue() > aFraction.decimalValue() ? 1 : -1;
   }
}