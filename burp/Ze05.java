package burp;

import java.util.function.Supplier;

public class Ze05 implements Ztsg {
  private final Supplier<Zes1> Zb;
  
  private final Zmi Zh;
  
  Ze05(Supplier<Zes1> paramSupplier, Zmi paramZmi) {
    this.Zb = paramSupplier;
    this.Zh = paramZmi;
  }
  
  public void ZC() {
    int i = Zbq5.ZD();
    Zes1 zes1 = this.Zb.get();
    if (zes1 == null)
      return; 
    if (zes1.ZT) {
      this.Zh.Zw();
      if (i == 0) {
        this.Zh.ZJ();
        return;
      } 
      return;
    } 
    this.Zh.ZJ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze05.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */