import shapes.*;
import java.awt.*;
/*
 * Balloon class extends Circle implements Drawable
 * @author Deniz Semih Özal
 * @version 08.04.2020
 */
public class Balloon extends Circle implements Drawable
{
   // properties
   int count;
   
   //constructors
   public Balloon( int x, int y)
   {
      super(0);
      setLocation( x, y);
      count = 0;
   }
   
   //@Override
   public void draw( Graphics g)
   {
      g.drawOval( getX() - getRadius(), getY() - getRadius(), getRadius() * 2, getRadius() * 2);
   }
   
   /* 
    * grow method hat increases the radius of the balloon (Circle) by a fixed number of units, 
    * up to a maximum size, 100, at which point the circle should be selected and the radius set to zero
    */
   public void grow()
   {
      if ( getRadius() < 100 )
      {
         count++;
         setRadius( count);
      }
      else
      { 
         setSelected( true);
         setRadius( 0);
      }
   }
   
   
   
}
