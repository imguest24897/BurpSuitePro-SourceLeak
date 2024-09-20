package burp.theme;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Arrays;
import java.util.Objects;

class RolloverListUI$RolloverListAdapter extends MouseAdapter {
  final RolloverListUI this$0;
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    updateRolloverRow();
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    updateRolloverRow();
  }
  
  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {
    RolloverListUI.access$000(RolloverListUI.this).getParent().dispatchEvent(paramMouseWheelEvent);
    updateRolloverRow();
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    int i = RolloverListUI.access$100(RolloverListUI.this, (paramMouseEvent.getPoint()).y);
    if (i != -1)
      RolloverListUI.access$200(RolloverListUI.this).setSelectedIndex(i); 
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    int i = RolloverListUI.access$300(RolloverListUI.this, (paramMouseEvent.getPoint()).y);
    updateRolloverRow(i);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    updateRolloverRow(-1);
  }
  
  private void updateRolloverRow() {
    Point point = RolloverListUI.access$400(RolloverListUI.this).getMousePosition();
    boolean bool = (point == null) ? true : RolloverListUI.access$500(RolloverListUI.this, point.y);
    if (bool != RolloverListUI.this.rolloverRow)
      updateRolloverRow(bool); 
  }
  
  private void updateRolloverRow(int paramInt) {
    int i = RolloverListUI.this.rolloverRow;
    RolloverListUI.this.rolloverRow = paramInt;
    repaint(new int[] { i, paramInt });
  }
  
  private void repaint(int... paramVarArgs) {
    Objects.requireNonNull(RolloverListUI.access$600(RolloverListUI.this));
    Arrays.stream(paramVarArgs).filter(RolloverListUI$RolloverListAdapter::lambda$repaint$0).mapToObj(this::lambda$repaint$1).filter(Objects::nonNull).forEach(RolloverListUI.access$600(RolloverListUI.this)::repaint);
  }
  
  private Rectangle lambda$repaint$1(int paramInt) {
    return RolloverListUI.access$700(RolloverListUI.this).getCellBounds(paramInt, paramInt);
  }
  
  private static boolean lambda$repaint$0(int paramInt) {
    return (paramInt >= 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\RolloverListUI$RolloverListAdapter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */