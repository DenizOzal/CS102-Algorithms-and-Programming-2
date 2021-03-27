public abstract class Shape implements Locatable
{
   //properties
   private int x;
   private int y;
   
   //constructors
   
   
   abstract double getArea();
   
   public int getX()
   {
      return x;
   }
   public int getY()
   {
      return y;
   }
   public void setLocation( int x, int y)
   {
      this.x = x;
      this.y = y;
   }
}