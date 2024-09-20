package burp;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.Scrollable;

public class Zbc4 extends Zbqc implements Scrollable {
  public Zbc4() {}
  
  public Zbc4(LayoutManager paramLayoutManager) {
    super(paramLayoutManager);
  }
  
  public Dimension getPreferredScrollableViewportSize() {
    return getPreferredSize();
  }
  
  public int getScrollableUnitIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
    return ((Integer)Ze31.Zy(this, paramInt1).<Integer>map(JScrollBar::getUnitIncrement).orElse(Integer.valueOf(1))).intValue();
  }
  
  public int getScrollableBlockIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
    return ((Integer)Ze31.Zy(this, paramInt1).<Integer>map(JScrollBar::getBlockIncrement).orElse(Integer.valueOf(10))).intValue();
  }
  
  public boolean getScrollableTracksViewportWidth() {
    return (((Integer)Ze31.Zm(this).<Integer>map(JScrollPane::getHorizontalScrollBarPolicy).orElse(Integer.valueOf(32))).intValue() == 31);
  }
  
  public boolean getScrollableTracksViewportHeight() {
    return (((Integer)Ze31.Zm(this).<Integer>map(JScrollPane::getVerticalScrollBarPolicy).orElse(Integer.valueOf(22))).intValue() == 21);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbc4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */