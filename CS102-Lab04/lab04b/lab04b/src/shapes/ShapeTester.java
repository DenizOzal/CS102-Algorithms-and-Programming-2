package shapes;
import java.util.Scanner;
/*
 * ShapeTester class creates menu for the user
 * @author Deniz Semih ?zal
 * @version 11.03.2020
 */
public class ShapeTester
{
   private static void menu()
   {
      System.out.println( "************************************\n"
                            +"(1) Create an empty set of shapes\n"
                            +"(2) Add Circle\n"
                            +"(3) Add Rectangle\n"
                            +"(4) The total surface Area\n"
                            +"(5) Informations about the shapes\n"
                            +"(6) Find the Shape that contains given x,y\n"
                            +"(7) Remove all Selected Shapes from set\n"
                            +"(8) Quit\n"
                            +"************************************");
   }
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      ShapeContainer shape;
      int option;
      boolean flag;
      int radius;
      int width;
      int heigth;
      int x;
      int y;
      Circle circle;
      Rectangle rectangle;
      
      // initialized variables
      option = 0;
      flag = true;
      radius = 0;
      width = 0;
      heigth = 0;
      x = 0;
      y = 0;
      
      System.out.println( "Welcome to the ShapeTester!");
      menu();
      option = scan.nextInt();
      if ( option == 1) // (1) Create an empty set of shapes
      {
         shape = new ShapeContainer();
         do
         {
            menu();
            option = scan.nextInt();
            if ( option == 2) // (2) Add Circle
            {
               System.out.println( "Please enter the radius");
               radius = scan.nextInt();
               System.out.println( "Please enter the x coordinate");
               x = scan.nextInt();
               System.out.println( "Please enter the y coordinate");
               y = scan.nextInt();
               circle = new Circle( radius);
               circle.setLocation( x,y);
               shape.add( circle);
            }
            else if ( option == 3) // (3) Add Rectangle
            {
               System.out.println( "Please enter the width");
               width = scan.nextInt();
               System.out.println( "Please enter the height");
               heigth = scan.nextInt();
               System.out.println( "Please enter the x position");
               x = scan.nextInt();
               System.out.println( "Please enter the y position");
               y = scan.nextInt();
               rectangle = new Rectangle( width, heigth);
               rectangle.setLocation( x,y);
               shape.add( rectangle);
            }
            else if ( option == 4) // (4) The total surface Area
            {
               System.out.println( "The total area: " + shape.getArea());
            }
            else if ( option == 5) // (5) Informations about the shapes
            {
               System.out.println( shape);
            }
            else if ( option == 6) // (6) Find the Shape that contains given x,y
            {
               
               System.out.println( "Please enter the x coordinate");
               x = scan.nextInt();
               System.out.println( "Please enter the y coordinate");
               y = scan.nextInt();
               if ( shape.findFirstShape( x,y) != null)
               {
                  System.out.println( (shape.findFirstShape( x,y)));
               }
               else
               {
                  System.out.println( "Try anoher location please");
               }
            }
            
            else if ( option == 7) // (7) Remove all Selected Shapes from set
            {
               shape.removeSelected();
               System.out.println( "The selected items are removed");
            }
            else if ( option == 8) // Quit
            {
               flag = false;
            }
         } while( flag);
      }
   }
}















