package burp;

import java.awt.Component;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

class Zsvw implements PopupMenuListener {
  private final Zkj9 ZV;
  
  private final boolean ZQ;
  
  private final boolean Zr;
  
  private final boolean Zm;
  
  final Zbkv Zc;
  
  private Zsvw(Zbkv paramZbkv) {
    Zbk7 zbk7 = new Zbk7(paramZbkv.Zn);
    this.ZQ = paramZbkv.Zn.ZA();
    this.Zr = paramZbkv.Zn.Zc();
    this.Zm = paramZbkv.Zn.ZH();
    this.ZV = new Zkj9();
    this.ZV.ZE(Zlkk.PANEL_BACKGROUND);
    this.ZV.add(zbk7);
    this.ZV.addPopupMenuListener(this);
    this.ZV.pack();
  }
  
  private void Zu(Component paramComponent) {
    this.ZV.show(paramComponent, 0, -(this.ZV.getMinimumSize()).height);
  }
  
  public void popupMenuWillBecomeInvisible(PopupMenuEvent paramPopupMenuEvent) {
    ZE();
  }
  
  private void ZE() {
    if (Zy())
      this.Zc.Zw(); 
  }
  
  private boolean Zy() {
    return (this.ZQ != this.Zc.Zn.ZA() || this.Zr != this.Zc.Zn.Zc() || this.Zm != this.Zc.Zn.ZH());
  }
  
  public void popupMenuWillBecomeVisible(PopupMenuEvent paramPopupMenuEvent) {}
  
  public void popupMenuCanceled(PopupMenuEvent paramPopupMenuEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsvw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */