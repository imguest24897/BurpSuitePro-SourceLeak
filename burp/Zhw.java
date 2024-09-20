package burp;

import java.util.Collection;

public class Zhw extends Zni implements Zx0c {
  @Zzvo(1)
  private final Zzwo<Zlru, Zefg<Zt8i>> Zr;
  
  private final Zr_4 Zq;
  
  Zhw(Zzwo<Zlru, Zefg<Zt8i>> paramZzwo, Zr_4 paramZr_4) {
    this.Zr = paramZzwo;
    this.Zq = paramZr_4;
  }
  
  public void Ze(Zt8i paramZt8i, Zmv7 paramZmv7) {
    Zlgv.Zz(paramZt8i, this.Zr, this.Zq, paramZmv7);
  }
  
  public void ZB(Zt8i paramZt8i) {
    Zlgv.ZG(paramZt8i, this.Zr);
  }
  
  public Collection<Zt8i> Zko() {
    return Zlgv.Zk(this.Zr);
  }
  
  public Zeu4<? extends Zx0c> ZF() {
    return Zx0c.ZK;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zhw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */