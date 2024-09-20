package burp;

import java.util.Locale;

class Zlrf extends Zlge {
  private final Zlge Zr;
  
  public Zlrf(Zlge paramZlge) {
    this.Zr = paramZlge;
  }
  
  public String Zs(Zzvx paramZzvx) {
    return this.Zr.Zs(paramZzvx).toLowerCase(Locale.ROOT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlrf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */