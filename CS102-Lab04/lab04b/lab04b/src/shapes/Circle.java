package shapes;
/*
 * Circle class extends Shape implements  Selectable
 * @author Deniz Semih ?zal
 * @version 11.03.2020
 */
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
  
  public int getRadius()
  {
     return radius;
  }
  
  public void setRadius( int radius)
  {
     this.radius = radius;
  }
  
  //@Override
  double getArea()
  {
    return Math.PI * radius * radius;
  }
  
   
  /*
   * toString method 
   * @return String with informations of that shape
   */
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
  
  /*
   * getSelected method makes selected
   * @return selected
   */
  public boolean getSelected()
  {
    return selected;
  }
  
  /*
   * setSelected method arranges selected or not according to boolean parameter
   * @param selected is a boolean type 
   */
  public void setSelected( boolean selected)
  {
    this.selected = selected;
  }
  
   /*
   * contains method determenines whether the given coordinates in the shape collection or not
   * @param x, y the coordinates
   * @return circle with Circle type
   */
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
  
  
}