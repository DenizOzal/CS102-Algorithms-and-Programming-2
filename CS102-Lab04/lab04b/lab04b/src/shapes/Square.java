package shapes;
/*
 * Sqaure class extends Rectangle
 * @author Deniz Semih ?zal
 * @version 11.03.2020
 */
public class Square extends Rectangle
{
   // properties
   private int side;
   
   // constructors
   public Square(int side)
   {
    super( side, side);
   }
   
   //@Override
   double getArea()
   {
      return super.getArea();
   }
}