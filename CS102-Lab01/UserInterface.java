import java.util.Scanner;
public class UserInterface
{
  private static void userInterface()
  {
    
    System.out.println( "1. Create a new empty collection with a specified maximum capacity (any previous values are lost!");
    System.out.println( "2. Read a set of positive values into the collection. (Use a negative value to indicate all the values have been entered.");
    System.out.println( "3. Print the collection of values.");
    System.out.println( "4. Add a value to the collection of values at a specified location");
    System.out.println( "5. Remove the value at a specified location from the collection of values");
    System.out.println( "6. Read a single test value.");
    System.out.println( "7. Compute the set of locations of the test value within the collection.");
    System.out.println( "8. Print the set of locations.");
    System.out.println( "9. Quit the program.");
  }
  public static void main( String[] args)
  {
    
    // variables
    int value;
    int select;
    IntBag intBag;
    int location;
    boolean flag;
    
    value = 0;
    select = 0;
    location = 0;
    flag = true;
    
    Scanner scan = new Scanner( System.in);
    System.out.println( "Welcome to the BagsOfIntegers...Please enter a value!");
    userInterface();
    select = scan.nextInt();
    if ( select == 1)
    {
      System.out.println( "Please enter your capacity");
      value = scan.nextInt();
      intBag = new IntBag( value);
      
      while ( flag)
      {
        userInterface();
        select = scan.nextInt();
        
        if ( select == 2)
        {
          int count;
          count = -1;
          System.out.println( "Please enter set of positive values");
          while ( count < 0 )
          {
            value = scan.nextInt();
            if ( value > -1)
            {
              intBag.add(value);
            }
            else
            {
              count++;
            }
            
          }
        }
        
        else if ( select == 3)
        {
          System.out.println( "Here is your integers!");
          System.out.println( intBag.toString());
          
        }
        
        else if ( select == 4)
        {
          System.out.println( "Please enter the value and location");
          value = scan.nextInt();
          System.out.println( "Please enter the location");
          location = scan.nextInt();
          intBag.add( location, value);
          
        }
        
        else if ( select == 5)
        {
          
          System.out.println( "Please enter the location you want to remove");
          location = scan.nextInt();
          intBag.remove( location);
        }
        
        
        else if ( select == 6)
        {
          System.out.println( "Please enter the value to test");
          value = scan.nextInt();
          if ( intBag.contains( value) == true)
          {
            System.out.println( "It is included");
            userInterface();
            select = scan.nextInt();
            if ( select == 7)
            {
              String str;
              str = "";
              str = intBag.findAll( value);
              System.out.println( "Please select 8 the numbers of desired values");
              userInterface();
              select = scan.nextInt();
              if ( select == 8)
              {
                System.out.println( str);
              }
            }
          }
          else
          {
             System.out.println( "It is not included");
          }
        }
        else if ( select == 9 )
        {
          flag = false;
        }
      }
    }
    System.out.println( "Please come back again!!!");
  }
}















