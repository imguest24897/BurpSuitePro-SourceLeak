package burp;

import net.portswigger.Zl0;

public class Zm6v {
  private final Zt4u Zo;
  
  private final Zs4c Zx;
  
  private final Zlal Zr;
  
  private final Zl0 ZE;
  
  public Zm6v(Zt4u paramZt4u, Zs4c paramZs4c, Zlal paramZlal, Zl0 paramZl0) {
    this.Zo = paramZt4u;
    this.Zx = paramZs4c;
    this.Zr = paramZlal;
    this.ZE = paramZl0;
  }
  
  public Zr1m ZL(Zm3g paramZm3g) {
    Zlaq zlaq = new Zlaq(paramZm3g, this.Zr);
    return new Zr1m(this.Zo, zlaq, this.Zx, this.ZE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */