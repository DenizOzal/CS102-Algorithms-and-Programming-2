package shapes;
/*
  *Rectangle class extends Shape implements Selectable
 * @author Deniz Semih Özal
 * @version 11.03.2020
 */
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
    return ( "the rectangle's width is " + width + " height is " + height + " area is " +
            getArea() + " x is " + getX() + " y is " + getY() + " and " + str);
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
    Rectangle rectangle = new Rectangle( width, height);
    if ( ( x >= getX() && x <= (getX() + width)) && ( y >= getY() && y <= (getY() + height)))
    {
      return rectangle;
    }
    else
    {
      return null;
    }
    
  }
  
  
  
  
}