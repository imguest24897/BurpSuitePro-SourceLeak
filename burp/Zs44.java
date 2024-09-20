package burp;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public abstract class Zs44 implements Zg0y {
  protected final Zxjt Zg;
  
  protected final Zg4y Zo;
  
  protected final Zsiv Zi;
  
  protected final Zlka ZP;
  
  protected final Supplier<Integer> ZT;
  
  protected final Zmv7 Zl;
  
  protected final Zrp6 ZR;
  
  Zs44(Zxjt paramZxjt, Zg4y paramZg4y, Zsiv paramZsiv, Zlka paramZlka, Supplier<Integer> paramSupplier, Zmv7 paramZmv7, Zrp6 paramZrp6) {
    this.Zg = paramZxjt;
    this.Zo = paramZg4y;
    this.Zi = paramZsiv;
    this.ZP = paramZlka;
    this.ZT = paramSupplier;
    this.Zl = paramZmv7;
    this.ZR = paramZrp6;
  }
  
  public Optional<Ztc6> ZE(Zx51 paramZx51) {
    List<Ztc6> list = Zw(paramZx51.ZeB(), paramZx51.ZeE(), Objects.<Zr47>requireNonNullElseGet(paramZx51.Zew(), this::lambda$findPath$0), paramZx51.Zef());
    Optional<Ztc6> optional = list.stream().min(Zerh.Zr.thenComparing(paramZx51.ZeG()));
    Zbqc[] arrayOfZbqc = Ztc6.ZG();
    if (optional.isEmpty()) {
      this.Zl.Zy(Zrp6.DEBUG, Zlq7.NO_PATH_FOUND, new Object[0]);
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[2]);
      } else {
        return optional;
      } 
    } 
    this.Zl.Zy(this.ZR, Zlq7.FOUND_PATH, new Object[] { optional.get() });
    return optional;
  }
  
  protected abstract List<Ztc6> Zw(Ztsv paramZtsv, Zm8l paramZm8l, Zr47 paramZr47, Collection<Zrp0> paramCollection);
  
  public String toString() {
    return getClass().getSimpleName();
  }
  
  private Zr47 lambda$findPath$0() {
    return Zgj4.Zs(this.Zi);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs44.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */