
import java.util.ArrayList;

public class XHTMLFilteredReader extends HTMLFilteredReader
{
  // constructor
  
  public XHTMLFilteredReader( String url)
  {
    super( url);
  }
  // methods
  
//  public String getUnfilteredPageContents()
//  {
//    return super.getUnfilteredPageContents();
//  }
  public ArrayList<String> getLinks()
  {
    ArrayList<String> list = new ArrayList<String>();
    String temp;
    temp = "";
    temp = super.getUnfilteredPageContents();
    int i = 0;
    int j = 0;
    
    while ( i != -1)
    {
      i = temp.indexOf( "href", j);
      if ( i != -1)
      {
        j = temp.indexOf( "\"", i + 6);
        list.add( temp.substring( i + 6, j));
       
      }
    }
    return list;
  }
}