package burp;

import java.awt.Dimension;
import java.awt.LayoutManager;

class Zbhn extends Zbqc {
  final Zbhw Zj;
  
  Zbhn(Zbhw paramZbhw, LayoutManager paramLayoutManager) {
    super(paramLayoutManager);
  }
  
  public Dimension getPreferredSize() {
    return new Dimension((super.getPreferredSize()).width, (int)(this.Zj.Zl() * this.Zj.ZR));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbhn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */