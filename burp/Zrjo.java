package burp;

import java.util.function.Supplier;

public class Zrjo {
  private final Zs98 ZO;
  
  private final Supplier<Zz28> Zc;
  
  public Zrjo(Zs98 paramZs98, Supplier<Zz28> paramSupplier) {
    this.ZO = paramZs98;
    this.Zc = paramSupplier;
  }
  
  public Ztfx ZU(Zlit paramZlit) {
    return new Ztfx(this.ZO, paramZlit, this.Zc.get());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrjo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */