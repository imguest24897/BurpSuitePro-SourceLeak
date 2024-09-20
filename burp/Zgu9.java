package burp;

import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

class Zgu9<T> implements Zg5b<T>, Zs18 {
  private final Map<T, Zs18> Zd = Collections.synchronizedMap(new Zsd5(this));
  
  private final Supplier<T> ZC;
  
  private final Zbnt ZS;
  
  public Zgu9(Supplier<T> paramSupplier, Zbnt paramZbnt) {
    this.ZC = paramSupplier;
    this.ZS = paramZbnt;
  }
  
  public Zs68 Zq(Zsmh paramZsmh) {
    return ZZ().Zq(paramZsmh);
  }
  
  private Zs18 ZZ() {
    return this.Zd.computeIfAbsent(this.ZC.get(), this::lambda$currentCache$0);
  }
  
  public void ZY(T paramT) {
    this.Zd.remove(paramT);
  }
  
  private Zs18 lambda$currentCache$0(Object paramObject) {
    return new Zmd2(this.ZS);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgu9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */