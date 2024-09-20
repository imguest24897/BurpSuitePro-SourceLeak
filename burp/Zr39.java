package burp;

import java.util.Objects;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

class Zr39 implements MenuListener {
  final Zzk6 ZW;
  
  Zr39(Zzk6 paramZzk6) {}
  
  public void menuCanceled(MenuEvent paramMenuEvent) {}
  
  public void menuDeselected(MenuEvent paramMenuEvent) {}
  
  public void menuSelected(MenuEvent paramMenuEvent) {
    this.ZW.ZR.removeAll();
    Zzyu zzyu = this.ZW.ZC.Zw();
    if (zzyu != null) {
      Objects.requireNonNull(this.ZW.ZR);
      zzyu.Zb().forEach(this.ZW.ZR::add);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr39.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */