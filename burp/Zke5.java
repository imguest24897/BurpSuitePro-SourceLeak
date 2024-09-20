package burp;

import java.util.function.Supplier;

public class Zke5 extends Zket {
  private final Zs9h Zm;
  
  private final Supplier<Zsmh> Zb;
  
  Zke5(Zs9h paramZs9h, Supplier<Zsmh> paramSupplier, Ztrk paramZtrk) {
    super(paramZtrk);
    this.Zm = paramZs9h;
    this.Zb = paramSupplier;
  }
  
  public Zgsq Zd() {
    return this.Zm.ZB();
  }
  
  public void ZG(Zgsq paramZgsq) {
    this.Zm.ZG(paramZgsq);
    Zk(Zz(Za(), paramZgsq));
  }
  
  public Zsmh Za() {
    return this.Zb.get();
  }
  
  private static Zsmh Zz(Zsmh paramZsmh, Zgsq paramZgsq) {
    Ztuo ztuo = new Ztuo(paramZgsq);
    paramZsmh.Zh(ztuo);
    return ztuo.ZB();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zke5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */