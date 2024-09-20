package burp;

import java.util.function.Predicate;

public final class Zrhn implements Zg10 {
  private final Zxds ZV;
  
  private final Zm5k Zg;
  
  public Zrhn(Zrgd paramZrgd, Zkl6 paramZkl6, Ztwv paramZtwv) {
    this.ZV = new Zxds(paramZrgd, paramZkl6);
    Zgut zgut = new Zgut(paramZrgd, paramZtwv, this.ZV);
    this.Zg = new Zm5k(paramZtwv, zgut);
    this.Zg.ZF();
  }
  
  public void ZT(Predicate<byte[]> paramPredicate, Zx7 paramZx7) {
    this.ZV.Zg(paramPredicate, paramZx7);
  }
  
  public void Zh(Predicate<byte[]> paramPredicate, Zx7 paramZx7) {
    this.ZV.Zr(paramPredicate, paramZx7);
  }
  
  public void ZP(Predicate<byte[]> paramPredicate) {
    this.ZV.Za(paramPredicate);
  }
  
  public void Zp(Zx7 paramZx7) {
    this.ZV.Zs(paramZx7);
  }
  
  public void ZS(Predicate<byte[]> paramPredicate, Zx7 paramZx7, Zz3d paramZz3d) {
    this.ZV.Zk(paramPredicate, paramZx7, paramZz3d);
  }
  
  public int ZR() {
    return this.Zg.ZW();
  }
  
  public void ZY() {
    this.Zg.ZX();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrhn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */