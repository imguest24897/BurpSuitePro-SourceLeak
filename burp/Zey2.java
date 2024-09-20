package burp;

import java.util.function.Supplier;

public class Zey2 {
  private final Zxl2 ZE;
  
  private final Zega Zl;
  
  private final Supplier<Zz28> Zp;
  
  private final Zlae Zc;
  
  private final Ze9i Zg;
  
  public Zey2(Zxl2 paramZxl2, Zega paramZega, Supplier<Zz28> paramSupplier, Ze9i paramZe9i) {
    this.ZE = paramZxl2;
    this.Zl = paramZega;
    this.Zp = paramSupplier;
    this.Zc = paramZe9i.ZPT();
    this.Zg = paramZe9i;
  }
  
  void Zx(Zeo2 paramZeo2, Zz1p paramZz1p) {
    if (Zi(Zmup.PROXY, paramZz1p))
      this.Zl.ZH(paramZeo2); 
  }
  
  void ZL(Zvo1 paramZvo1, Zz1p paramZz1p) {
    if (Zi(Zmup.REPEATER, paramZz1p))
      this.Zl.ZM(paramZvo1); 
  }
  
  void Zo(Zz1p paramZz1p, Zstu paramZstu1, Zstu paramZstu2) {
    if (Zi(Zmup.INTRUDER, paramZz1p))
      this.ZE.Zn(paramZz1p, paramZstu1, paramZstu2); 
  }
  
  private boolean Zi(Zmup paramZmup, Zz1p paramZz1p) {
    return (this.Zg.ZPp() && this.Zg.ZPW().contains(paramZmup) && ((Zz28)this.Zp.get()).ZG(paramZz1p.Zo)) ? ((!this.Zg.ZPG() || !this.Zc.Zx(paramZz1p))) : false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zey2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */