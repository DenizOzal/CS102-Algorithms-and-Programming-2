/*
 * Execise Class
 * @author: Deniz Semih ?zal
 * @version 29/04/2020
 * 
 */
import java.util.ArrayList;
public class Exercise
{
   // 1.a
   public static String printReverse( int[] X, int n)
   {
      if ( n > 0)
      {  
         System.out.print( X[ n - 1] + "");
         return printReverse( X, n - 1);
      }
      return "";
   } 
   // 1.b
   public static String printForward( int[] X, int n)
   {
      if ( n < X.length)
      {
         System.out.print( X[ n++] + "");
         return printForward( X, n);
      }
      return "";
   }
   // 2
   public static double power( double x, int y)
   {
      if ( y > 0)
         return x * power( x , y - 1);
      else if ( y < 0)
         return ( 1 / x) * power( x, y + 1);
      return 1;
   }
   // 3
   public static int findMax( int[] X, int n)
   {
      if ( n == 1)
         return X[0]; 
      return Math.max( X[ n - 1], findMax( X, n - 1));
   }
   // 4
   public static ArrayList<Integer> fromStoE( ArrayList<Integer> Y, int s, int e)
   {
      Y.add( s);
      if ( s == e)
         return Y;
      return fromStoE( Y, s + 1, e);
   }
   // 5.a
   public static int firstX( int[] X, int n, int target)
   {  
      if ( n >= X.length)
         return -1;
      else if ( X[n] == target && n < X.length)
         return n;
      return firstX( X, n + 1, target);
   }
   // 5.b
   public static int lastX( int[] X, int n, int target)
   {
      n = X.length - 1;
      if ( n >= X.length)
         return -1;
      else if ( X[n] == target && n < X.length)
         return n;
      return lastX( X, n - 1, target);
   }
   // 5.c
   public static String allInstances( int[] X, int n, int target)
   {
      if ( n == X.length)
         return "";
      else if ( X[n] == target)
         return n + " " + allInstances( X, n + 1, target);
      return allInstances( X, n + 1, target);
   }
   public static void main( String[] args)
   {
      int[] X = { 1, 2, 10, 4, 10};
      ArrayList<Integer> Y = new ArrayList<Integer>(3);
      printReverse( X, 5);
      System.out.println();
      printForward( X, 0);
      System.out.println();
      System.out.println( power( 2, -3));
      System.out.println( findMax( X, 5));
      System.out.println( fromStoE( Y, 0, 5));
      System.out.println( firstX( X, 0, 10));
      System.out.println( lastX( X, 0, 10));
      System.out.println( allInstances( X, 0, 10));
   }
}