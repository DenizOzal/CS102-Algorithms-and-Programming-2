import javax.swing.*;
/*
 * Main class that creates main frame
 * Deniz Semih Özal
 * 04.01.2020
 */


public class Main
{
   public static void main( String[] args)
   {
      // variables
      JFrame frame;
      ButtonPanel panel = new ButtonPanel();
      
      // program code
      frame = new JFrame(); // create frame instance
      frame.setTitle( "POTLUCK"); // set the title as Potluck
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default colse operation
      frame.add( panel); // add panel to the frame
      frame.pack(); // preffered window size
      frame.setVisible( true); // set visible 
   }
}
