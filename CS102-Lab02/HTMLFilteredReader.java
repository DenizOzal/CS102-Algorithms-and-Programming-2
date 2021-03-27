

public class HTMLFilteredReader extends MySimpleURLReader
{
  // properties
  
  
  // constructors
  
  public HTMLFilteredReader( String url)
  {
    super( url);
  }
  
  // methods
  
  public String getUnfilteredPageContents()
  {
    return super.getPageContents().substring(4);
  }
  
  // @Override
  public String getPageContents()
  {
    String filtered;
    filtered = "";
    String temp;
    temp = "";
    String filtered2;
    filtered2 = "";
    boolean flag;
    flag = true;
    temp = super.getPageContents();
    
    for ( int i = 0; i < temp.length(); i++)
    {
      if ( temp.charAt(i) == '<')
      {
        flag = false;
      }
      if ( flag)
      {
        filtered = filtered + temp.charAt(i);
      }
      if ( temp.charAt(i) == '>')
      {
        flag = true;
      }
    }
    
    for ( int k = 0; k < filtered.length(); k++)
    {
      if ( filtered.charAt(k) == '&')
      {
        flag = false;
      }
      if ( flag)
      {
        filtered2 = filtered2 + filtered.charAt(k);
      }
      if ( filtered.charAt(k) == ';');
      {
        flag = true;
      }
    }
    return filtered2.substring(4);
    
  }
}
