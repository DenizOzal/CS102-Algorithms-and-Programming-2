import javax.swing.*;
import java.awt.*;
/*
 * MyFrame Class
 * @author Deniz Semih Özal
 * @version 04/01/2020
 */
public class MyFrame extends JFrame
{
   // properties

   // constructors
   public MyFrame()
   {
      JButton b;
      JPanel  p;
      
      // f.setSize( 400, 300);
      // setBounds( 350, 250, 400, 300);
//      setLayout( new FlowLayout() );
      
      p = new MyPanel();
//      add( new MyPanel() );
//      add( new MyPanel() );
//      
//      p.add( new Label( "Welcome to ZOOM") );
//      
//      b = new Button( "OK");
//      p.add( b);
//      p.add( new Button( "Good luck with Maths! ") );
//      
//      p.add( new TextField( 25) );
      
      add( p);
      
      pack();
      setVisible( true );      
   }

   // methods
     
}