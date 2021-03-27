import javax.swing.*;
import java.awt.*;
/*
 * StatusBar class that status bar
 * Deniz Semih Özal
 * 04.01.2020
 */


public class StatusBar extends JPanel
{
   // properties
   int count;
   JLabel label;
   
   // constructors
   public StatusBar()
   {
      count = 0;
      label = new JLabel();
      label.setText( "The number of guesses: " + count);
      add( label);
      setBackground( Color.white);
      setPreferredSize (new Dimension(400, 50));
   }
   
   //@Override
   /*
    * setText method that set the text
    * @param text as a string
    */
   public void setText( String text)
   {
      label.setText( text);
   } 
}









