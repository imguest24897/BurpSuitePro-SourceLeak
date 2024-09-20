package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Zr1p extends ComponentAdapter {
  final Zljk ZC;
  
  private Zr1p(Zljk paramZljk) {}
  
  public void componentHidden(ComponentEvent paramComponentEvent) {
    this.ZC.Zh(Ztjr.POPUP_HIDDEN);
  }
  
  public void componentShown(ComponentEvent paramComponentEvent) {
    this.ZC.Zh(Ztjr.POPUP_SHOWN);
  }
  
  public void Zs(Zkmv paramZkmv) {
    paramZkmv.addComponentListener(this);
  }
  
  public void ZT(Zkmv paramZkmv) {
    if (paramZkmv != null)
      paramZkmv.removeComponentListener(this); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr1p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */