package burp;

import java.util.concurrent.atomic.AtomicBoolean;

class Zrk7 {
  private final Zra1 Zj;
  
  private final Zr5v Zo;
  
  private final Zm39 ZL;
  
  private final AtomicBoolean Zn;
  
  Zrk7(Zra1 paramZra1, Zr5v paramZr5v, Zm39 paramZm39) {
    this.Zj = paramZra1;
    this.Zo = paramZr5v;
    this.ZL = paramZm39;
    this.Zn = new AtomicBoolean(paramZm39.ZOC());
  }
  
  void ZT(boolean paramBoolean) {
    this.Zn.set(paramBoolean);
  }
  
  Zb_w ZK() {
    return (this.Zn.get() && this.Zj == Zra1.EXECUTION_MODE_DESKTOP) ? this.Zo : this.ZL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrk7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */