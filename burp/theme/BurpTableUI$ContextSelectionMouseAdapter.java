package burp.theme;

import burp.Zbws;
import burp.Zrgg;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

class BurpTableUI$ContextSelectionMouseAdapter extends MouseAdapter {
  private boolean pressedPopupTrigger;
  
  final BurpTableUI this$0;
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.pressedPopupTrigger = paramMouseEvent.isPopupTrigger();
    updateContextSelectionRowIndex(paramMouseEvent);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    boolean bool = paramMouseEvent.isPopupTrigger();
    updateContextSelectionRowIndex(paramMouseEvent);
    JTable jTable = BurpTableUI.access$200(BurpTableUI.this);
    if (jTable instanceof Zbws) {
      Zbws zbws = (Zbws)jTable;
      if (!this.pressedPopupTrigger && !bool)
        setContextSelectionRowIndex(zbws, -1); 
    } 
  }
  
  private void updateContextSelectionRowIndex(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger()) {
      JTable jTable = BurpTableUI.access$300(BurpTableUI.this);
      if (jTable instanceof Zbws) {
        Zbws zbws = (Zbws)jTable;
        int i = BurpTableUI.access$400(BurpTableUI.this).rowAtPoint(paramMouseEvent.getPoint());
        int j = BurpTableUI.access$500(BurpTableUI.this).convertRowIndexToModel(i);
        if (BurpTableUI.access$600(BurpTableUI.this).getSelectionModel().isSelectedIndex(i))
          j = -1; 
        setContextSelectionRowIndex(zbws, j);
      } 
    } 
  }
  
  private void setContextSelectionRowIndex(Zbws paramZbws, int paramInt) {
    Zrgg zrgg = paramZbws.ZW();
    int i = zrgg.Zn();
    boolean bool = (i == -1) ? true : BurpTableUI.access$700(BurpTableUI.this).convertRowIndexToView(i);
    if (paramInt != i) {
      paramZbws.ZW().ZO(paramInt);
      boolean bool1 = (paramInt == -1) ? true : BurpTableUI.access$800(BurpTableUI.this).convertRowIndexToView(paramInt);
      BurpTableUI.this.repaint(new int[] { bool, bool1 });
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTableUI$ContextSelectionMouseAdapter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */