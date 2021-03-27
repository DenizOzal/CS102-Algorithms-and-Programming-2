import javax.swing.*;
import java.awt.*;
/*
 * Main class generates frame
 * @author Deniz Semih Özal
 * @version 08.04.2020
 */
public class Main
{
   public static void main( String[] args)
   { 
      // Creating Frame
      JFrame frame = new JFrame();
      JPanel panel = new BalloonsGamePanel();
      frame.add( panel);
      frame.setLayout( new FlowLayout());
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setTitle( "BALLOON GAME");
      frame.setVisible( true);
   }
}
   