/*
 * PartD -  Write a recursive method that enumerates and prints all n-digit even numbers in which
 * each digit of the number, from its most-significant to least-significant digits, is greater than the previous one
 * @author Deniz Semih Özal
 * @version 29/04/2020
 */
import java.util.Scanner;
public class PartD
{
   /*
    * filterValues method checks the order of the number 
    * (from most significant to least significant number)
    * @param number, every number is checked
    * @return boolean
    */
   public static boolean filterValues( int number)
   {
      if ( ( number % 10) > (( number / 10)) % 10 &&  number > 10)
         return filterValues( number / 10);
      if ( number < 10)
         return true;
      return false;
   }
   
   /*
    * fromMtoL method trying every value between the interval
    * according to filterValues information
    * @param n, int desired digit from the user
    */
   public static void fromMtoL( int n)
   {
      int start;
      int end;
      start = ( int)Math.pow( 10, n - 1);
      end = ( int)Math.pow( 10, n);
      for ( int number = start - 1 ; number < end; number++) 
      {
         if ( number % 2 == 0 && filterValues( number)) // checking the condition 
            System.out.print( number + " ");
      }
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      int n;
      n = 0;
      while ( true)
      {
         System.out.println( "Please enter the n-digit");
         n = scan.nextInt();
         fromMtoL( n);
      }
   }
}