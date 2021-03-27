/*
 * PartA - Write a recursive Java method that counts 
 * the number of occurrences of the character "e" in a string.
 * @author Deniz Semih Özal
 * @version 29/04/2020
 */
import java.util.Scanner;
public class PartA
{
   /*
    * eInString method counts the number of occurrences of the character "e" in a string.
    * @param input, String from the user
    * @param ch, checks the desired char e or not
    * @return the number of occurrences
    */
   public static int eInString( String input, char ch)
   {
      int count;
      count = 0;
      int index;
      index = input.length() - 1;
      if ( index < 0)
         return 0;
      if ( ch == input.charAt( index))
         count++;
      return count + eInString( input.substring( 0, input.length() - 1), ch);
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      String input;
      char ch;
      ch = 'e';
      while( true)
      {
         input = scan.nextLine();
         System.out.println( eInString( input, ch));
      }
   }  
}   