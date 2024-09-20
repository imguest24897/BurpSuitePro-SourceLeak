package burp;

import java.util.function.Supplier;

public class Zl6x implements Zb9b {
  private final Supplier<Zbdx> Zd;
  
  private final Zxcj Z_;
  
  public Zl6x(Supplier<Zbdx> paramSupplier, Zxcj paramZxcj) {
    this.Zd = paramSupplier;
    this.Z_ = paramZxcj;
  }
  
  public boolean Zy(Zgu3 paramZgu3) {
    return false;
  }
  
  public void ZM(Zgu3 paramZgu3, Zsmh paramZsmh, Zrqo paramZrqo) {
    if (Zy(paramZgu3)) {
      Zx8r zx8r = Zx5c.ZD(paramZgu3, paramZsmh, paramZrqo);
      Zbdx zbdx = this.Zd.get();
      Zbxj zbxj = zbdx.Zs();
      zbxj.ZJ(true);
      zbxj.Zv(Zs_i.EXPLAINER);
      this.Z_.Zc(paramZrqo.Zjp(), zx8r);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */