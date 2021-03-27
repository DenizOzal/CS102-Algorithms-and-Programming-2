/*
 * PartB -  Write a recursive method that takes a decimal value as an  
 * int parameter and prints out the binary equivalent of it on the console
 * @author Deniz Semih Özal
 * @version 29/04/2020
 */
import java.util.Scanner;
public class PartB
{
   /*
    * getBinaryMethod that takes a decimal value as an  
    * int parameter and prints out the binary equivalent
    * @param decimal, int from the user
    * @return getBinaryForm( decimal / 2) + ( decimal % 2)
    * 
    */
   public static String getBinaryForm( int decimal)
   {
      if ( decimal < 1)
         return "";
      return ( getBinaryForm( decimal / 2) + ( decimal % 2));
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      int decimal;
      while ( true)
      {
         decimal = scan.nextInt();
         System.out.println( getBinaryForm( decimal));
      }
   }  
}