package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Zgu5 {
  private final List<Zkcm> ZW = new ArrayList<>();
  
  private final Supplier<Boolean> Zv;
  
  private Zkcm Zs;
  
  private Zkcm ZE;
  
  private Zkcm Z_;
  
  private Zgu5(Supplier<Boolean> paramSupplier) {
    this.Zv = paramSupplier;
  }
  
  public Zgu5 Zl(Zkcm paramZkcm) {
    this.Zs = paramZkcm;
    return ZI(paramZkcm);
  }
  
  public Zgu5 Z_(Zkcm paramZkcm) {
    this.ZE = paramZkcm;
    return ZI(paramZkcm);
  }
  
  public Zgu5 ZH(Zkcm paramZkcm) {
    this.Z_ = paramZkcm;
    return this;
  }
  
  public Zgu5 ZI(Zkcm paramZkcm) {
    this.ZW.add(paramZkcm);
    return this;
  }
  
  public Zren ZV() {
    return new Zren(this.ZE, this.Zs, this.Z_, this.Zv, this.ZW);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgu5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */