import javax.swing.*;
import java.util.Iterator;
import shapes.*;
import java.awt.Graphics;
import javax.swing.Timer; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.*;
/*
 * BalloonsGamePanel class extends JPanel
 * @author Deniz Semih Özal
 * @version 08.04.2020
 */
public class BalloonsGamePanel extends JPanel
{
   //variables
   private final int X;
   private final int Y;
   private final int DELAY;
   private final int MIN_BALLOON_NUMBER;
   private final int MAX_BALLOON_NUMBER;
   private final int END_GAME;
   private ShapeContainer balloons;
   private Timer timer;
   private int points;
   private JLabel label;
   private int elapsedTime;
   private int option;
   private boolean isGameOver;
   
   // constructors
   // Create a panel
   public BalloonsGamePanel()
   {
      X = 700;
      Y = 700;
      DELAY = 250;
      MIN_BALLOON_NUMBER = 15;
      MAX_BALLOON_NUMBER = 25;
      elapsedTime = 0;
      option = 0;
      points = 0;
      END_GAME = 200;
      isGameOver = false;
      label = new JLabel( "Points: " + points);
      balloons = new ShapeContainer();
      addMouseListener( new BurstMouseListener());
      
      // Creating random balloons up to Balloon Number
      for ( int i = 0; i < MAX_BALLOON_NUMBER; i++)
      {
         balloons.add( new Balloon( (int)( Math.random() * X),(int)( Math.random() * Y)));
      }
      
      timer = new Timer( DELAY, new GrowActionListener());
      timer.start();
      add( label);
      setBackground( Color.yellow);
      setPreferredSize( new Dimension( X, Y));
      setVisible( true); 
   }
   // GrowActionListener class make actions in every delay
   class GrowActionListener implements ActionListener
   {
      //@Override
      public void actionPerformed( ActionEvent e)
      {
         elapsedTime++;
         Iterator iterator = balloons.iterator();
         
         // Every balloon grows
         while ( iterator.hasNext())
         {
            (( Balloon)iterator.next()).grow();
         }
         // If the number of balloons less than min balloon number, it generates balloons that random placed
         if ( balloons.size() < MIN_BALLOON_NUMBER)
         {
            balloons.add( new Balloon( (int)( Math.random() * X),(int)( Math.random() * Y)));
         }
         // Remove selected balloons and then repaint
         balloons.removeSelected();
         repaint();
         
         // When the game length is completed, the game stops
         if ( elapsedTime > END_GAME)
         {
            isGameOver = true;
            timer.stop();
            JOptionPane.showConfirmDialog( null, "GAME OVER", "Play Again?", JOptionPane.YES_NO_OPTION);
            
            // Restart the game
            if ( option == 0)
            {
               balloons.removeSelected();
               isGameOver = false;
               elapsedTime = 0;
               option = 0;
               points = 0;
               remove( label);
               label = new JLabel();
               label.setText( "Points: " + points);
               add( label);
               balloons = new ShapeContainer();
               addMouseListener( new BurstMouseListener());
               // Creating random balloons up to Balloon Number
               for ( int i = 0; i < MAX_BALLOON_NUMBER; i++)
               {
                  balloons.add( new Balloon( (int)( Math.random() * X),(int)( Math.random() * Y)));
               }
               timer = new Timer( DELAY, new GrowActionListener());
               timer.start();
               setBackground( Color.yellow);
               setPreferredSize( new Dimension( X, Y));
               setVisible( true); 
            }
            // Exit the Game
         }
         else if ( option == 1)
         {
            System.exit( 0);
         }
         
      }
   }
   // BurstMouseListener class makes to burst the balloons
   class BurstMouseListener implements MouseListener
   {
      //@Override
      public void mousePressed( MouseEvent e)
      {
         int burst;
         burst = 0;
         Iterator iterator = balloons.iterator();
         if ( isGameOver == false)
         {
            // When the circle contains the coordinates of click, the number of bursts increase
            while ( iterator.hasNext())
            {
               if ( ((Balloon)iterator.next()).contains( e.getX(), e.getY()) != null)
               {
                  burst++;
               }
            }
            // When the user can burst at least 2 balloon at the same time, the point increase
            if ( burst > 1)
            {   
               points++;
               label.setText( "Points: " + points);
            }
            // Burst the selected balloons
            balloons.selectAllAt( e.getX(), e.getY());
            balloons.removeSelected();
         }
      }
      //@Override
      /*
       * Do-Nothing Methods
       */
      public void mouseReleased( MouseEvent e){}
      public void mouseClicked( MouseEvent e){}
      public void mouseEntered( MouseEvent e){}
      public void mouseExited( MouseEvent e){}
      
   }

   
    //@Override
  /*
   * This method draws balloons
   * @param g as a type of Graphics
   */
   public void paintComponent( Graphics g)
   {
      super.paintComponent( g);
      Iterator iterator = balloons.iterator();
      while ( iterator.hasNext())
      {
         (( Drawable)iterator.next()).draw( g);
      }
   }
}



