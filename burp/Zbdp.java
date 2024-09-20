package burp;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import javax.swing.Scrollable;

public class Zbdp extends Zbqc implements Scrollable {
  private final Zbup ZK;
  
  public Zbdp(LayoutManager paramLayoutManager, Zbup paramZbup) {
    super(paramLayoutManager);
    this.ZK = paramZbup;
  }
  
  public Dimension getPreferredScrollableViewportSize() {
    return getPreferredSize();
  }
  
  public int getScrollableUnitIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
    return this.ZK.getVerticalScrollBar().getUnitIncrement();
  }
  
  public int getScrollableBlockIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
    return this.ZK.getVerticalScrollBar().getBlockIncrement();
  }
  
  public boolean getScrollableTracksViewportWidth() {
    return true;
  }
  
  public boolean getScrollableTracksViewportHeight() {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */