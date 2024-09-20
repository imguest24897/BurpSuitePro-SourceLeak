package burp;

import java.util.function.Consumer;

public class Zs0r implements Zbwk {
  private final Zbwk ZM;
  
  private final Consumer<Zlvj> Zf;
  
  private final Zz28 ZV;
  
  private final Zes1 Zi;
  
  public Zs0r(Zbwk paramZbwk, Consumer<Zlvj> paramConsumer, Zz28 paramZz28, Zes1 paramZes1) {
    this.ZM = paramZbwk;
    this.Zf = paramConsumer;
    this.ZV = paramZz28;
    this.Zi = paramZes1;
  }
  
  public Zmkk ZO(Zg8y paramZg8y) {
    if (this.ZV != null && this.Zi != null && paramZg8y instanceof Zlvj) {
      Zlvj zlvj = (Zlvj)paramZg8y;
      if (!this.ZV.ZG(zlvj.Zx().ZyR())) {
        this.Zf.accept(zlvj);
        return this.ZV.ZH(zlvj.Zx().ZyR()) ? Zmkk.Zy(Zlmk.EXCLUDED_FROM_SCOPE) : Zmkk.Zy(Zlmk.OUT_OF_SCOPE);
      } 
      if (this.Zi.ZM(zlvj.Zx().ZyR().Zd1()))
        return Zmkk.Zy(Zlmk.COLLABORATOR_SUB_DOMAIN); 
    } 
    return this.ZM.ZO(paramZg8y);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs0r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */