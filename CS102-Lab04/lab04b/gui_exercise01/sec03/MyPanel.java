import javax.swing.*;
import java.awt.*;

/*
 * MyPanel Class
 * @author Deniz Semih Özal
 * @version 04/01/2020
 */
public class MyPanel extends JPanel
{
   // properties

   // constructors
   public MyPanel()
   {
      JButton b;
      // setPreferredSize( new Dimension( 100, 100) );
      setSize( 400, 400);
//      setLayout( new GridLayout(3,3));
//      setLayout( new FlowLayout() );
//       setLayout( new BorderLayout());
      
      add( new JLabel( "Welcome to ZOOM") );
      
      b = new JButton( "OK");
      add( b);
      add( new JButton( "Good luck with Maths! "));
      
      add( new JTextField( 25) );      
   }

   // methods
     
}