package burp;

import java.awt.Color;
import java.awt.LayoutManager;

class Zbdz extends Zbqc {
  final Zbd6 Zq;
  
  Zbdz(Zbd6 paramZbd6, LayoutManager paramLayoutManager) {
    super(paramLayoutManager);
  }
  
  public Color getBackground() {
    return (this.Zq.Zv == null) ? super.getBackground() : (this.Zq.Zv.ZR(this.Zq.ZX) ? this.Zq.ZX.getBackground() : this.Zq.ZA.ZB().getBackground());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */