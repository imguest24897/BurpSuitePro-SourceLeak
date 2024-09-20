package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

class Zxgb extends MouseAdapter {
  final Zmo5 ZL;
  
  private Zxgb(Zmo5 paramZmo5) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    super.mouseClicked(paramMouseEvent);
    if (SwingUtilities.isRightMouseButton(paramMouseEvent))
      ZO(paramMouseEvent); 
  }
  
  private void ZO(MouseEvent paramMouseEvent) {
    JTable jTable = this.ZL.getTable();
    if (jTable instanceof Zbws) {
      Zbws zbws = (Zbws)jTable;
      int i = this.ZL.columnAtPoint(paramMouseEvent.getPoint());
      int j = Zmo5.Zb(this.ZL).convertColumnIndexToModel(i);
      ArrayList<JMenuItem> arrayList = new ArrayList<>(this.ZL.Zu.ZI(zbws, j));
      if (this.ZL.ZF != null)
        arrayList.addAll(this.ZL.ZF.ZI(zbws, j)); 
      if (!arrayList.isEmpty()) {
        Zkj9 zkj9 = new Zkj9();
        Objects.requireNonNull(zkj9);
        arrayList.forEach(zkj9::add);
        zkj9.show(this.ZL, paramMouseEvent.getX(), paramMouseEvent.getY());
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */