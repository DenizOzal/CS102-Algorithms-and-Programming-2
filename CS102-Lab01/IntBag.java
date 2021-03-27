public class IntBag
{
  //properties
  private int[] bag;
  private int valid;
  
  //constructor
  public IntBag()
  {
    this.bag = new int[100];
    valid = 0;
  }
  
  public IntBag( int maxElements)
  {
    this.bag = new int[maxElements];
    valid = 0;
  }
  
  //methods
  public void add( int value)
  {
    bag[valid] = value;
    valid++;
  }
  
  public void add( int location,int value)
  {
    int[] store = new int[bag.length];
    for ( int i = 0; i < location; i++)
    {
      store[i] = bag[i];
    }
    for ( int i = location; i < valid; i++)
    {
      store[i+1] = bag[i];
    }
    store[location] = value;
    bag = store;
    valid++;
  }
  
  
  public void remove( int location)
  {
    int[] store = new int[bag.length];
    for ( int i = 0; i < location; i++)
    {
      store[i]= bag[i];
    }
    for ( int i = location; i < valid - 1 ; i++)
    {
      store[i] = bag[i+1];
    }
    bag = store;
    valid--;
  }
  
  public boolean contains( int value)
  {
    for ( int i = 0; i < valid; i++)
    {
      if ( bag[i] == value)
      {
        return true;
      }
    }
    return false;
  }
  
  public String toString()
  {
    String str;
    str = "";
    for ( int i = 0; i < valid; i++)
    {
      str = str + " " + bag[i];
    }
    return str;
  }
  
  public int size()
  {
    return valid;
  }
  
  public int get( int location)
  {
    return bag[location];
  }
  public String findAll( int value)
  {
    String str;
    str = "";
    for ( int i = 0; i < valid; i++)
    {
      if ( bag[i] == value)
      {
        str = str + i + ",";
      }
    }
    return str;
  }
}
      
    
    







