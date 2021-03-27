public class Circle extends Shape implements  Selectable
{
   // properties
   private int radius;
   private boolean selected;
   
   //constructors
   public Circle( int radius)
   {
      this.radius = radius;
      selected = false;
   }
   
   //@Override
   double getArea()
   {
      return Math.PI * radius * radius;
   }
   
   public String toString()
   {
      String str;
      str = "It is not selected";
      if ( selected)
      {
         str = "It is selected";
      }
      return ( "the circle's radius is " + radius + " area is " + getArea() + " x is " + getX() + " y is " + getY() + " and " + str);
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
      Circle circle = new Circle( radius);
      if ( (( getX() - x) * ( getX() - x)) + (( getY() - y) * ( getY() - y)) <= ( radius * radius))
      {
         return circle;
      }
      else
      {
         return null;
      }
   }
//   public String toString()
//   {
//      String str;
//      str = "It is not selected";
//      if ( selected)
//      {
//         str = "It is selected";
//      }
//      return ( "the circle's radius is " + radius + " area is " + getArea() + " x is " + getX() + " y is " + getY() + " and " + str);
//   }
   
   
}