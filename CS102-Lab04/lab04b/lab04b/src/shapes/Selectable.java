package shapes;
/*
 * Selectable Interface
 * @author Deniz Semih ?zal
 * @version 11.03.2020
 */
public interface Selectable
{
   boolean getSelected();
   void setSelected( boolean selected);
   Shape contains( int x, int y);
}
