import javax.swing.*;
import java.awt.*;
/*
 * MyDrawingPanel Class
 * @author Deniz Semih Özal
 * @version 04/01/2020
 */
public class MyDrawingPanel extends JPanel
{
   // properties
   private  int width;
   private  int height;
  
   // constructors
   
   // Defaut contructor
   public MyDrawingPanel()
   {
      width = 300;
      height = 250;
      setBackground( Color.yellow);
      setPreferredSize( new Dimension(300, 250));
   }
   
   // Parametrized contructor
   public MyDrawingPanel( int width, int height)
   {
      this.width = width;
      this.height = height;
      setBackground( Color.yellow);
      setPreferredSize( new Dimension( width, height));
   }
   
   /*
    * setBackGroundColor methot that sets the bacground color
    * @param color as a type of a Color
    */
   public void setBackgroundColor( Color color)
   {
      setBackground( color);
   }
}
   