package burp;

import javax.swing.SwingUtilities;
import javax.swing.event.PopupMenuEvent;

class Zzqh extends Zzqq {
  final Zbv6 Zg;
  
  Zzqh(Zbv6 paramZbv6) {}
  
  public void popupMenuWillBecomeInvisible(PopupMenuEvent paramPopupMenuEvent) {
    SwingUtilities.invokeLater(this::lambda$popupMenuWillBecomeInvisible$0);
  }
  
  private void lambda$popupMenuWillBecomeInvisible$0() {
    this.Zg.Zv = false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzqh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */