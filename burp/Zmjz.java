package burp;

import java.util.function.Supplier;

public class Zmjz implements Supplier<Zrtw> {
  private final Supplier<Boolean> Zy;
  
  private final Zrtw Zx;
  
  private final Zrtw ZF;
  
  public Zmjz(Supplier<Boolean> paramSupplier, Zkvh paramZkvh, Zrtw paramZrtw, Zenk paramZenk) {
    this.Zy = paramSupplier;
    this.Zx = new Zvoo(paramZkvh, paramZenk);
    this.ZF = new Zb6(paramZrtw, paramZenk);
  }
  
  public Zrtw Zh() {
    return ((Boolean)this.Zy.get()).booleanValue() ? this.ZF : this.Zx;
  }
  
  public Zrtw Zv() {
    return this.ZF;
  }
  
  public Zrtw ZT() {
    return this.Zx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmjz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */