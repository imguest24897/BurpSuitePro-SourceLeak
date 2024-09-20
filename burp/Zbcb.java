package burp;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.Scrollable;
import javax.swing.SwingUtilities;

public class Zbcb extends Zbqc implements Scrollable {
  private final Zbup ZB;
  
  public Zbcb(Zbup paramZbup) {
    this.ZB = paramZbup;
  }
  
  public Dimension getPreferredScrollableViewportSize() {
    return getPreferredSize();
  }
  
  public int getScrollableUnitIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
    return this.ZB.getVerticalScrollBar().getUnitIncrement();
  }
  
  public int getScrollableBlockIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
    return this.ZB.getVerticalScrollBar().getBlockIncrement();
  }
  
  public boolean getScrollableTracksViewportWidth() {
    Container container = SwingUtilities.getUnwrappedParent(this);
    return (container instanceof javax.swing.JViewport) ? ((container.getWidth() > (getPreferredSize()).width)) : true;
  }
  
  public boolean getScrollableTracksViewportHeight() {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */