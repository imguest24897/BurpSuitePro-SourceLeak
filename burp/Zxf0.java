package burp;

import java.util.concurrent.atomic.AtomicBoolean;

class Zxf0 extends Zxfj {
  private final Zrtw Zo;
  
  private final Zms7 Zj;
  
  private final AtomicBoolean ZF;
  
  private Zxf0(Zrtw paramZrtw, Zms7 paramZms7, AtomicBoolean paramAtomicBoolean) {
    this.Zo = paramZrtw;
    this.Zj = paramZms7;
    this.ZF = paramAtomicBoolean;
  }
  
  public Zg4n Zb() {
    return this.ZF.get() ? Zg4n.ABORT : Zg4n.CONTINUE;
  }
  
  public Zg4n ZZ() {
    return this.ZF.get() ? Zg4n.ABORT : Zg4n.CONTINUE;
  }
  
  public Zms7 Zd() {
    return this.Zj;
  }
  
  public Zx_o Zx() {
    return Zx_o.Zb(this.Zo.ZTQ());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxf0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */