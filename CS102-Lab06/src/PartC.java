/*
 * PartC -  Write a recursive method that returns true if the strings 
 * in the array are in lexicographic (effectively alphabetic) order, and false otherwise.
 * @author Deniz Semih ?zal
 * @version 29/04/2020
 */
import java.util.ArrayList;
public class PartC
{
   
   /*
    * isOrder method that returns true if the strings in the array are in 
    * lexicographic (effectively alphabetic) order, and false otherwise.
    * @param list, contains strings as a type of ArrayList<String>
    * @param n, is the list size
    * @return boolean
    * 
    */
   public static boolean isOrder( ArrayList<String> list, int n)
   {
      if ( n > 1)
      {
         if ( list.get( n - 1).compareTo( list.get( n - 2)) < 0) // compare consecutive values
            return false;
         else
            return isOrder( list, n - 1);
      }
      return true;
   }
   public static void main( String[] args)
   {
      ArrayList<String> list = new ArrayList<String>();
      list.add( "abc");
      list.add( "bef");
      list.add( "djk");
      list.add( "lmn");
      int n = list.size();
      System.out.println( isOrder(list, n));
   }
}
