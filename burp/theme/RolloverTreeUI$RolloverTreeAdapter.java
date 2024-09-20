package burp.theme;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.tree.TreePath;

class RolloverTreeUI$RolloverTreeAdapter extends MouseAdapter {
  final RolloverTreeUI this$0;
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    updateRolloverRow();
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    updateRolloverRow();
  }
  
  public void mouseWheelMoved(MouseWheelEvent paramMouseWheelEvent) {
    RolloverTreeUI.access$000(RolloverTreeUI.this).getParent().dispatchEvent(paramMouseWheelEvent);
    updateRolloverRow();
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    TreePath treePath = RolloverTreeUI.this.getTreePathForPoint(paramMouseEvent.getPoint());
    if (treePath != null && !RolloverTreeUI.this.isLocationInExpandControl(treePath, paramMouseEvent.getX(), paramMouseEvent.getY())) {
      Rectangle rectangle = RolloverTreeUI.this.getPathBounds(RolloverTreeUI.access$100(RolloverTreeUI.this), treePath);
      if (paramMouseEvent.getX() < rectangle.x || paramMouseEvent.getX() >= rectangle.x + rectangle.width)
        RolloverTreeUI.access$200(RolloverTreeUI.this, treePath, paramMouseEvent); 
    } 
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    int i = RolloverTreeUI.this.getRowForPoint(paramMouseEvent.getPoint());
    updateRolloverRow(i);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    updateRolloverRow(-1);
  }
  
  private void updateRolloverRow() {
    int i = RolloverTreeUI.this.getRowForPoint(RolloverTreeUI.access$300(RolloverTreeUI.this).getMousePosition());
    if (i != RolloverTreeUI.this.rolloverRow)
      updateRolloverRow(i); 
  }
  
  private void updateRolloverRow(int paramInt) {
    int i = RolloverTreeUI.this.rolloverRow;
    RolloverTreeUI.this.rolloverRow = paramInt;
    repaint(new int[] { i, paramInt });
  }
  
  private void repaint(int... paramVarArgs) {
    Objects.requireNonNull(RolloverTreeUI.access$500(RolloverTreeUI.this));
    Objects.requireNonNull(RolloverTreeUI.access$400(RolloverTreeUI.this));
    Arrays.stream(paramVarArgs).filter(RolloverTreeUI$RolloverTreeAdapter::lambda$repaint$0).mapToObj(RolloverTreeUI.access$500(RolloverTreeUI.this)::getRowBounds).filter(Objects::nonNull).forEach(RolloverTreeUI.access$400(RolloverTreeUI.this)::repaint);
  }
  
  private static boolean lambda$repaint$0(int paramInt) {
    return (paramInt >= 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\RolloverTreeUI$RolloverTreeAdapter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */