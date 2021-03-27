import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/*
 * MyDrawingPanelTest Class
 * @author Deniz Semih Özal
 * @version 04/01/2020
 */
public class MyDrawingPanelTest extends JFrame
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      MyDrawingPanel panel;
      JFrame frame;
      int x;
      int y;
      
      //program code
      System.out.println( "PLease enter x");
      x = scan.nextInt();
      System.out.println( "PLease enter y");
      y = scan.nextInt();
      panel = new MyDrawingPanel( x, y);
      panel.setBackgroundColor( Color.cyan);
      frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add( panel);
      frame.setSize( x,y);
      frame.pack();
      frame.setVisible( true);
      
   }
}
      
      
      