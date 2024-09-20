package burp;

import java.util.List;
import net.portswigger.browser.Zel;
import net.portswigger.browser.Zt3;

class Zza5 implements Zsgp {
  private final List<Zr1q> ZR;
  
  private Zza5(List<Zr1q> paramList) {
    this.ZR = paramList;
  }
  
  static Zza5 Zr(List<Zel> paramList, Zt3 paramZt3) {
    List<Zr1q> list = Zr1q.ZT(paramList, false, paramZt3);
    return new Zza5(list);
  }
  
  public List<Zrtj> Zm() {
    boolean bool = this.ZR.stream().anyMatch(Zr1q::ZR);
    return this.ZR.stream().map(bool::lambda$getInputs$0).toList();
  }
  
  private static Zrtj lambda$getInputs$0(boolean paramBoolean, Zr1q paramZr1q) {
    Zv5 zv5 = paramZr1q.ZI().Zl(true);
    if (paramBoolean && !paramZr1q.ZR())
      zv5.ZG(true); 
    return zv5.Zd();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zza5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */