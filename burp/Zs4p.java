package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public final class Zs4p extends Zs44 {
  Zs4p(Zxjt paramZxjt, Zg4y paramZg4y, Zsiv paramZsiv, Zlka paramZlka, Supplier<Integer> paramSupplier, Zmv7 paramZmv7, Zrp6 paramZrp6) {
    super(paramZxjt, paramZg4y, paramZsiv, paramZlka, paramSupplier, paramZmv7, paramZrp6);
  }
  
  protected List<Ztc6> Zw(Ztsv paramZtsv, Zm8l paramZm8l, Zr47 paramZr47, Collection<Zrp0> paramCollection) {
    Zst zst = new Zst(this.Zo, this.ZP, Collections.emptySet(), paramZr47, this.Zg, this.Zl);
    Zm8l zm8l = paramZm8l::lambda$findShortestPathsToMatchingExits$0;
    Zbqc[] arrayOfZbqc = Ztc6.ZG();
    if (Zbqc.Zwu() == null)
      Ztc6.Zc(new Zbqc[1]); 
    return zst.Zt(Ztsv.ZM8(), zm8l, ((Integer)this.ZT.get()).intValue()).stream().map(this::Zy).toList();
  }
  
  private static boolean Zv(Zrp0 paramZrp0) {
    if (paramZrp0 instanceof Zl_) {
      Zl_ zl_ = (Zl_)paramZrp0;
      if (zl_.Zfy() instanceof Zsp5);
      return false;
    } 
  }
  
  private Ztc6 Zy(Ztc6 paramZtc6) {
    if (paramZtc6.ZB())
      return paramZtc6; 
    Ztc6 ztc6 = Ztc6.ZD(paramZtc6.Zy(), Collections.singletonList(paramZtc6.ZV()));
    this.Zl.Zy(this.ZR, Zlq7.FOUND_PATH, new Object[] { ztc6 });
    return ztc6;
  }
  
  private static boolean lambda$findShortestPathsToMatchingExits$0(Zm8l paramZm8l, Zrp0 paramZrp0, Zszw paramZszw) {
    return (Zv(paramZrp0) && paramZm8l.ZS(paramZrp0, paramZszw));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs4p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */