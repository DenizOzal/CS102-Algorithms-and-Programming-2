
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface
{
  private static void getInterface()
  {
    System.out.println( "***************MENU****************\n"
                        + "(1) Enter the url of the poem to add to collection\n"
                        + "(2) List all poems in the collection\n"
                        + "(3) Quit\n"
                        + "***************MENU****************");
  }
  
  
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // variables
    
    boolean flag;
    MySimpleURLReader text;
    HTMLFilteredReader htm;
    HTMLFilteredReader html;
    int option;
    ArrayList<MySimpleURLReader> collection;
    String url;
    int input;
    
    flag = true;
    option = 0;
    collection = new ArrayList<MySimpleURLReader>();
    url = "";
    input = 0;
    
    System.out.println( "Welcome to the URLReader Program...Please choose one of these three options");
    
    do
    {
      getInterface();
      option = scan.nextInt();
      if ( option == 1)
      {
        System.out.println( "Please enter the URL that you want to add the collection");
        scan.nextLine();
        url = scan.nextLine();
        if ( url.substring( url.length() - 3).equals( "txt"))
        {
          text = new MySimpleURLReader( url);
          collection.add( text);
        }
        if ( url.substring( url.length() - 3).equals( "htm"))
        {
          htm = new HTMLFilteredReader( url);
//          MySimpleURLReader htmlExtend = ( MySimpleURLREader) html;
          collection.add( htm);
        }
        if ( url.substring( url.length() - 4).equals( "html"))
        {
          html = new HTMLFilteredReader( url);
          collection.add( html);
        }
        else
        {
          System.out.println( "Pleas enter a valid URL");
        }
        
      }
      
      else if ( option == 2)
      {
        do
        {
          System.out.println( "All poems that in the list");
          for ( int i = 0; i < collection.size(); i++)
          {
            System.out.println( i + "\t" + collection.get(i).getName());
          }
          System.out.println( "Please enter the index of file to read the poem or to back to the menu enter the laxt index number + 1");
          input = scan.nextInt();
          
          while ( input != -1 && input != collection.size())
          {
            System.out.println(collection.get( input).getPageContents());
            System.out.println( "To quit enter -1");
            input = scan.nextInt();
          }
        } while( input != collection.size());
      }
      else if ( option == 3)
      {
        flag = false;
      }
    } while ( flag);
    
    System.out.println( "Thank you!!!");
  }
}



















