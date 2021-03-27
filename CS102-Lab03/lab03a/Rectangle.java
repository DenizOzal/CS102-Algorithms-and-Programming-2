public class Rectangle extends Shape implements Selectable
{
   // properties
   private int width;
   private int height;
   private boolean selected;
   
   //constructors
   public Rectangle( int width, int height)
   {
      this.width = width;
      this.height = height;
      selected = false;
   }
   
   //@Override
   double getArea()
   {
      return width * height;
   }
   
   public String toString()
   {
      String str;
      str = "It is not selected";
      if ( selected)
      {
         str = "It is selected";
      }
      return ( "the rectangle's width is " + width + " height is " + height + " area is " +
              getArea() + " x is " + getX() + " y is " + getY() + " and " + str);
   }

   
   public boolean getSelected()
   {
      return selected;
   }
   
   public void setSelected( boolean selected)
   {
      this.selected = selected;
   }
   
   public Shape contains( int x, int y)
   {
      Rectangle rectangle = new Rectangle( width, height);
      if ( ( x > getX() && x <= getX() + width) && ( y >= getY() && y <= getY() + height))
      {
         return rectangle;
      }
      else
      {
         return null;
      }
      
   }
   
   
   
   
}