package burp;

import java.util.concurrent.atomic.AtomicReference;

class Zebq implements Zbf7 {
  final AtomicReference Zp;
  
  final Zrqo Zl;
  
  final Zgu3 ZD;
  
  Zebq(AtomicReference paramAtomicReference, Zrqo paramZrqo, Zgu3 paramZgu3) {}
  
  public void ZS(Zefx paramZefx) {
    this.Zp.set(Zx5c.ZB(paramZefx, this.Zl));
  }
  
  public void ZO(Zxpe paramZxpe) {
    Zx8r zx8r = (this.ZD == Zgu3.HTTP_RESPONSE) ? Zx5c.ZS(paramZxpe, this.Zl) : Zx8r.NONE;
    this.Zp.set(zx8r);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zebq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */