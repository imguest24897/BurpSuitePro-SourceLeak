package burp.theme;

import burp.Zbws;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Optional;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class BurpTableUI$ResponsiveEmptyStatePanelsComponentListener extends ComponentAdapter {
  final BurpTableUI this$0;
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    super.componentResized(paramComponentEvent);
    if (BurpTableUI.access$1300(BurpTableUI.this) != null) {
      Optional<JScrollPane> optional = BurpTableUI.findEnclosingScrollPane(BurpTableUI.access$1400(BurpTableUI.this));
      optional.ifPresent(this::lambda$componentResized$2);
    } 
  }
  
  private void lambda$componentResized$2(JScrollPane paramJScrollPane) {
    Rectangle rectangle = BurpTableUI.this.getScrollableBounds(paramJScrollPane);
    BurpTableUI.this.noColumnEmptyStatePanel.setBounds(0, 0, rectangle.width, rectangle.height);
    JTable jTable = BurpTableUI.access$1500(BurpTableUI.this);
    if (jTable instanceof Zbws) {
      Zbws zbws = (Zbws)jTable;
      zbws.ZR().ifPresent(rectangle::lambda$componentResized$0);
      zbws.ZT().ifPresent(rectangle::lambda$componentResized$1);
    } 
  }
  
  private static void lambda$componentResized$1(Rectangle paramRectangle, Component paramComponent) {
    paramComponent.setBounds(0, 0, paramRectangle.width, paramRectangle.height);
  }
  
  private static void lambda$componentResized$0(Rectangle paramRectangle, Component paramComponent) {
    paramComponent.setBounds(0, 0, paramRectangle.width, paramRectangle.height);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTableUI$ResponsiveEmptyStatePanelsComponentListener.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */