package burp.theme;

import com.formdev.flatlaf.ui.FlatListUI;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.plaf.ComponentUI;

public class RolloverListUI extends FlatListUI {
  public static final int HORIZONTAL_PADDING = 6;
  
  private int rolloverRow = -1;
  
  private RolloverListUI$RolloverListAdapter rolloverListAdapter;
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (ComponentUI)new RolloverListUI();
  }
  
  protected void installListeners() {
    super.installListeners();
    this.rolloverListAdapter = new RolloverListUI$RolloverListAdapter(this);
    this.list.addMouseListener(this.rolloverListAdapter);
    this.list.addMouseMotionListener(this.rolloverListAdapter);
    this.list.addMouseWheelListener(this.rolloverListAdapter);
  }
  
  protected void uninstallListeners() {
    this.list.removeMouseWheelListener(this.rolloverListAdapter);
    this.list.removeMouseMotionListener(this.rolloverListAdapter);
    this.list.removeMouseListener(this.rolloverListAdapter);
    this.rolloverListAdapter = null;
    super.uninstallListeners();
  }
  
  public boolean isRolloverRow(int paramInt) {
    return (this.rolloverRow == paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\RolloverListUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */