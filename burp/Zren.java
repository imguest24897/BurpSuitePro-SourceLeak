package burp;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Zren implements Iterable<Zkcm> {
  private final Zkcm Zq;
  
  private final Zkcm Zp;
  
  private final Zkcm Zf;
  
  private final Supplier<Boolean> ZW;
  
  private final List<Zkcm> Zi;
  
  public static Zgu5 Zt(Supplier<Boolean> paramSupplier) {
    return new Zgu5(paramSupplier);
  }
  
  private Zren(Zkcm paramZkcm1, Zkcm paramZkcm2, Zkcm paramZkcm3, Supplier<Boolean> paramSupplier, List<Zkcm> paramList) {
    this.Zq = paramZkcm1;
    this.Zp = paramZkcm2;
    this.Zf = paramZkcm3;
    this.ZW = paramSupplier;
    this.Zi = paramList;
  }
  
  public Zkcm Za() {
    return ((Boolean)this.ZW.get()).booleanValue() ? Zi().filter(Zkcm::ZD).orElse(this.Zp) : this.Zp;
  }
  
  public Zkcm Zb() {
    return this.Zp;
  }
  
  public Optional<Zkcm> Zi() {
    return Optional.ofNullable(this.Zq);
  }
  
  public Zkcm ZC() {
    return this.Zf;
  }
  
  public Iterator<Zkcm> iterator() {
    return this.Zi.iterator();
  }
  
  public Zkcm ZX(int paramInt) {
    return this.Zi.get(paramInt);
  }
  
  public int Zj(Zkcm paramZkcm) {
    return this.Zi.indexOf(paramZkcm);
  }
  
  public int Zj() {
    return this.Zi.size();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zren.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */