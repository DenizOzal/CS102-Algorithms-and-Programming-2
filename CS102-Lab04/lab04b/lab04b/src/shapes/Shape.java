package shapes;
/*
 * Shape class implements Locatable
 * @author Deniz Semih Özal
 * @version 11.03.2020
 */
public abstract class Shape implements Locatable
{
   //properties
   private int x;
   private int y;
   
   //constructors
   
   // abstract method 
   abstract double getArea();
   
   /*
   * getX method returns x
   * @return x
   */
   public int getX()
   {
      return x;
   }
   /*
   * getY method returns y
   * @return y
   */
   public int getY()
   {
      return y;
   }
   /*
   * setLocation method arranges the coordinates
   * @param x,t the given coordinates
   */
   public void setLocation( int x, int y)
   {
      this.x = x;
      this.y = y;
   }
}