package burp;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

class Zt8a implements AncestorListener {
  final Zl6k Zm;
  
  final Zbqr ZC;
  
  Zt8a(Zbqr paramZbqr, Zl6k paramZl6k) {}
  
  public void ancestorAdded(AncestorEvent paramAncestorEvent) {
    this.ZC.Za = true;
    this.ZC.ZX();
    if (this.Zm.ZR() || this.Zm.ZD() > 0)
      this.ZC.ZW(); 
  }
  
  public void ancestorRemoved(AncestorEvent paramAncestorEvent) {
    this.ZC.Za = false;
    this.ZC.ZC();
  }
  
  public void ancestorMoved(AncestorEvent paramAncestorEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt8a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */