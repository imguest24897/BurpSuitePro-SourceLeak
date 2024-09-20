package burp.theme;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.SwingUtilities;

class BurpTableUI$RolloverMouseAdapter extends MouseAdapter {
  final BurpTableUI this$0;
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    updateRolloverRow(paramMouseEvent.getPoint());
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    updateRolloverRow(paramMouseEvent.getPoint());
  }
  
  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {
    BurpTableUI.access$900(BurpTableUI.this).getParent().dispatchEvent(paramMouseWheelEvent);
    Point point = MouseInfo.getPointerInfo().getLocation();
    SwingUtilities.convertPointFromScreen(point, BurpTableUI.access$1000(BurpTableUI.this));
    updateRolloverRow(point);
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    updateRolloverRow(paramMouseEvent.getPoint());
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    updateRolloverRow(-1);
  }
  
  private void updateRolloverRow(Point paramPoint) {
    if (paramPoint == null)
      return; 
    int i = BurpTableUI.access$1100(BurpTableUI.this).rowAtPoint(paramPoint);
    if (i != BurpTableUI.this.rolloverRowIndex)
      updateRolloverRow(i); 
  }
  
  private void updateRolloverRow(int paramInt) {
    int i = BurpTableUI.this.rolloverRowIndex;
    BurpTableUI.this.rolloverRowIndex = paramInt;
    BurpTableUI.this.repaint(new int[] { i, paramInt });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTableUI$RolloverMouseAdapter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */