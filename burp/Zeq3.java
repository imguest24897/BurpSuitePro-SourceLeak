package burp;

import java.util.Collections;
import java.util.Set;

class Zeq3 implements Zrbc, Zrcg {
  private final Zl5x Zr;
  
  private final Zz09 ZX;
  
  private Zeq3(Zl5x paramZl5x, Zz09 paramZz09) {
    this.Zr = paramZl5x;
    this.ZX = paramZz09;
  }
  
  public Set<? extends Zmgr> Zc() {
    return this.Zr.Zv() ? Collections.<Zmgr>emptySet() : Collections.<Zmgr>singleton(this::lambda$getPassiveWorkItems$0);
  }
  
  public Set<? extends Zz09> Zs() {
    return this.Zr.Zv() ? Collections.<Zz09>singleton(this.ZX) : Collections.<Zz09>emptySet();
  }
  
  private void lambda$getPassiveWorkItems$0(Zrj paramZrj, Zlsy paramZlsy) {
    paramZlsy.ZR(this.ZX);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeq3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */