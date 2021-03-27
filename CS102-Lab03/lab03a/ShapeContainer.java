import java.util.ArrayList;
public class ShapeContainer 
{
   // properties
   ArrayList<Shape> container;
   
   //constructors
   public ShapeContainer()
   {
      container = new ArrayList<Shape>();
   }
   
   //methods
   
   public void add( Shape s)
   {
      container.add( s);
   }
   
   public void delete()
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
         
      }
      else
      {
         System.out.println( "There is no such a shape");
      }
        shape.setSelected( true);
       return shape;
   }
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