public class Main
{
  public static void main( String[] args)
  {
    
//    intBag.add(0,16);
//    intBag.add(1,5);
//    System.out.println(intBag.get(0));
//    System.out.println( intBag.size());
//    intBag.add(2,6);
//    intBag.add(3,7);
//    intBag.add(22);

//    System.out.println(intBag.get(0));
//      System.out.println(intBag.contain(5));
//    System.out.println( intBag.size());
//  
//    
//    System.out.println( intBag.toString());
//     intBag.contain(5);
    IntBag intBag = new IntBag();
    int count = 1;
    int primeNumber = 4;
    intBag.add(2);
    intBag.add(3);
   
   
    for ( int i = 1; i < 99; i++)
    {
      for( int a = 0; a <= count; a++)
      {
        while( primeNumber % intBag.get(a) == 0)
        {
          primeNumber++;
          a = 0;
        }
      }
      count++;
      intBag.add(primeNumber);
    }
    
//      boolen check;
//      check = true;
//      for ( int i = 1; i < intBag.size(); i++)
//      {
//        int j = 2;
//        while ( j != 1)
//        {
//          if ( j % intBag[i] == 0 &
////          
//      
//    int i;
//    int num = 0;
//    int location = 0;
//    //Empty String
//    
//    
//    for (i = 1; i < 500; i++)         
//    {        
//      int counter=0;    
//      for( num = i; num >= 1; num--)
//      {
//        if( i % num == 0)
//        {
//          counter = counter + 1;
//        }
//      }
//      if (counter == 2)
//      {
//        intBag.add(location,i);
//        location++;
//      } 
//    }
////          intBag.add(1,5);
//          intBag.add(1,9);
//          intBag.add(1,9);
//          intBag.add(1,9);
//          intBag.add(1,9);
//          intBag.add(1,9);
          
//       intBag.remove();
//         intBag.remove(5);
//            intBag.remove(0);
//           intBag.remove(0);
//           intBag.remove(0);
//              intBag.add(0,999);
//              intBag.add(0,999);
              
            intBag.remove(0);
          //intBag.add(0,1);
    //System.out.println(intBag.contains(5));
     System.out.println(intBag.toString());
    //System.out.println( "Size: " + intBag.size());
  }
}
