package shapes;
import java.util.Iterator;
import java.util.ArrayList;
/*
 * ShapeContainer class contains the shapes
 * @author Deniz Semih Özal
 * @version 08.04.2020
 */
public class ShapeContainer implements Iterable
{
   // properties
   private ArrayList<Shape> container;
   
   //constructors
   public ShapeContainer()
   {
      container = new ArrayList<Shape>();
   }
   
   //@Override
   public Iterator<Shape> iterator() {
      return new myIterator();
   }
   // inner class MyIterator
   class myIterator<Shape> implements Iterator<Shape> {
      
      private int index;
      
      public myIterator() 
      {
         index = 0;
      }
      
      //@Override
      public Shape next() 
      {
         index++;
         return (Shape)container.get( index - 1);
      }
      
      //@Override
      public boolean hasNext() 
      {
         return ( index < container.size());
      }
      
      //@Override
      public void remove() 
      {
         container.remove( index - 1);
      }
   }
   /*
    * size method returns the number of shapes in the  container
    * @return contaner.size(), the number of shapes in the  container
    */
   public int size()
   {
      return container.size();
   }
   /*
    * selectAllat method returns the number of shapes containing the 
    * point x,y and sets the selected property of those shapes to true
    * @param x,y are coordinates 
    * @return count, the number of shapes containing the point x,y
    */
   public int selectAllAt( int x, int y)
   {
      int count;
      count = 0;
      for ( int i = 0; i < container.size(); i++)
      {
         if( (( Selectable)container.get( i)).contains( x, y) != null)
         {
            count++;
            (( Selectable)container.get( i)).setSelected( true);
         }
      }
      return count;
   }
   /*
    * contains method returns the first shape that includes the point x, y, or null if none do
    * @param x,y are coordinates
    */
   public Shape contains( int x, int y)
   {
      for ( int i = 0; i < container.size(); i++)
      {
         if ( (( Iterator)container.get( i)).hasNext() == true && (( Iterator)container.get( i)).next() == (( Selectable)container).contains( x,y))
            return container.get( i);    
      }
      return null;
   }
   
   //methods
   /*
    * add method that adds the shape into to the container
    * @param s is a type of shape
    */
   public void add( Shape s)
   {
      container.add( s);
   }
   /*
    * remove method that removes the selected shapes
    */
   public void removeSelected()
   {
      for ( int i = 0; i < container.size(); i++)
      {
         if ( ((Selectable)container.get(i)).getSelected() == true)
         {
            container.remove(i);
            i--;
         }
      }
   }
   
   //@Override
   double getArea()
   {
      double surfaceArea;
      surfaceArea= 0;
      for ( int i = 0; i < container.size(); i++)
      {
         surfaceArea += container.get(i).getArea();
      }
      return surfaceArea; 
   }
   /*
    * findFirstShape that finds the first shape that contains the given x and y
    * @param x,t the given coordinates
    * @return shape that the selected
    */
   public Selectable findFirstShape( int x, int y)
   {
      Selectable shape;
      shape = null;
      int temp;
      temp = container.size();
      
      for ( int i = 0; i < container.size(); i++)
      {
         if ( ((Selectable)(container.get(i))).contains(x,y) != null)
         {
            temp = i;
         }
      }
      if ( temp != container.size())
      {
         shape = (Selectable)container.get( temp);
         shape.setSelected( true);
      }
      else
      {
         System.out.println( "There is no such a shape");
      }
      return shape;
   }
   /*
    * toString method 
    * @return String with informations of sha shapes in the collection
    */
   public String toString()
   {
      String str;
      str = "";
      for ( int i = 0; i < container.size(); i++)
      {
         str += "The index is " + i + " and " + container.get(i).toString() + "\n"; 
      }
      return str;  
   }
}