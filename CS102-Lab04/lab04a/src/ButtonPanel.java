/*
 * ButtonPanel class that creates button panel
 * Deniz Semih Özal
 * 04.01.2020
 */


import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.util.ArrayList;


public class ButtonPanel extends JPanel 
{
   // properties
   int count;
   StatusBar status;
   JButton click;
   JButton restart;
   ArrayList<JButton> button;
   Random random;
   int randomNumber;
   ActionListener listener;
   JPanel buttonPanel;
   boolean flag;
   
   
   // constructors
   public ButtonPanel()
   {
      count = 0;
      status = new StatusBar();
      button = new ArrayList<JButton>();
      random = new Random();
      randomNumber = random.nextInt(25);
      flag = true;
      add( status, BorderLayout.NORTH);
      
      // This loop for create buttons
      for ( int i = 0; i < 25; i++)
      {
         click = new JButton("^______^");
         button.add( click);
         button.get(i).setBackground( Color.red);
         

      }
        
      setLayout( new FlowLayout());
      buttonPanel = new JPanel();
      
      // Creating grid layout
      buttonPanel.setLayout( new GridLayout( 5,5));
      buttonPanel.setPreferredSize (new Dimension(800, 800));
      
      
      // This loop for create listener for buttons
      for ( int j = 0; j < 25; j++)
      {
         button.get( j).addActionListener( new ClickListener( j));
      }
      
     
      
      
      // This loop for adding buttons into the button panel
      for ( int k = 0; k < 25; k++)
      {
         buttonPanel.add( button.get( k));
      }
      
      flag = false;
      
      // Adding buttonPanel into the panel
      add( buttonPanel, BorderLayout.NORTH);
      setBackground( Color.black);
      setPreferredSize (new Dimension(900, 900));
      
   }
   
   /*
    * ClickListener is a inner class that implements ActionListener
    */ 
   public class ClickListener implements ActionListener
   {
      // properties
      int value;
      
      // constructors
      public ClickListener( int value)
      {
         this.value = value;
      }
      // methods
      /*
       * This method for action event. When the user finds the random number, the text field changes and
       * the count initialise to the zero. And then text filed changes again
       * 
       * @param event
       */
      public void actionPerformed( ActionEvent event)
      {
         
         count++;
         if ( value == randomNumber)
         {
            status.setText( "You got it in " + count + " attempts!!!.. Please Restart the game");
            button.get( value).setBackground( Color.green);
            count = 0;
            randomNumber = random.nextInt();  
         }
         else
         {
            status.setText( "The number of guesses: " + count);
            button.get( value).setVisible( false);
         }
      }
   }
   
//   public boolean isGameOver()
//   {
//      return flag;
//   }
//   
//   
   
}

