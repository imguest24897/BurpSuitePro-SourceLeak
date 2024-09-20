package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zt3e extends MouseAdapter {
  final Zrk1 Zz;
  
  final Zbgr ZJ;
  
  Zt3e(Zbgr paramZbgr, Zrk1 paramZrk1) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    Zbws zbws = (Zbws)paramMouseEvent.getSource();
    if (paramMouseEvent.getClickCount() == 2 && zbws.getSelectedRow() != -1) {
      this.ZJ.ZK(zbws.rowAtPoint(paramMouseEvent.getPoint()), 0);
      this.Zz.ZW.ZL(1);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt3e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */