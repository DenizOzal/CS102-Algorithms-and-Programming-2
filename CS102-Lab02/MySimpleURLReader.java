import cs1.SimpleURLReader;

public class MySimpleURLReader extends SimpleURLReader
{
  // properties
  
  private String url;
  
  // constructors
  
  public MySimpleURLReader ( String url)
  {
    super( url);
    this.url = url;
  }
  
  // methods
  
  public String getURL()
  {
    return url;
  }
  
  public String getName()
  {
    String name;
    name = " ";
    for ( int i = 0; i < url.length(); i++)
    {
      if ( url.charAt(i) == ( '/'))
      {
        name = null;
        name = url.substring( i+1);
      }
    }
    return name;
  }
  
  
  // @Override 
  public String getPageContents()
  {
    return super.getPageContents().substring(4);
  }
 
}
