package burp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class Zlj3 implements Zgte {
  private final Zrdz Zi;
  
  private final Zboz Zn;
  
  private final Supplier<Ztcr> ZD;
  
  private final Zsni Z_;
  
  private final Set<Zbq5> ZT = new HashSet<>();
  
  public Zlj3(Zrdz paramZrdz, Zboz paramZboz, Supplier<Ztcr> paramSupplier, Zsni paramZsni) {
    this.Zi = paramZrdz;
    this.Zn = paramZboz;
    this.ZD = paramSupplier;
    this.Z_ = paramZsni;
  }
  
  public boolean ZH(Zer0 paramZer0) {
    Zzyw zzyw = (new Zt15(paramZer0.Zi())).Zt();
    if (zzyw == null)
      return false; 
    int i = zzyw.ZK;
    Zbq5 zbq5 = this.Zi.ZE(i);
    if (zbq5 != null) {
      List<Zzem> list = this.Zn.ZF(paramZer0, i);
      if (!list.isEmpty()) {
        this.ZT.add(zbq5);
        zbq5.ZL(list);
        this.Z_.ZL(list);
      } 
    } 
    return true;
  }
  
  public void ZQ() {
    this.ZT.forEach(this::lambda$afterAllInteractionsProcessed$0);
  }
  
  private void lambda$afterAllInteractionsProcessed$0(Zbq5 paramZbq5) {
    ((Ztcr)this.ZD.get()).ZQ(paramZbq5);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlj3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */