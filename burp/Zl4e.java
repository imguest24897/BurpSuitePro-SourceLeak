package burp;

import java.util.function.Supplier;

public class Zl4e implements Zlpe {
  private final Zb_x ZM;
  
  private final Supplier<Boolean> Zo;
  
  private final Runnable ZJ;
  
  public Zl4e(Zb_x paramZb_x, Supplier<Boolean> paramSupplier, Runnable paramRunnable) {
    this.ZM = paramZb_x;
    this.Zo = paramSupplier;
    this.ZJ = paramRunnable;
  }
  
  public boolean Zn() {
    return !((Boolean)this.Zo.get()).booleanValue() ? false : (!this.ZM.Zj());
  }
  
  public void Zg() {
    this.ZM.Zk();
  }
  
  public void ZZ() {
    if (!this.ZM.Zl())
      return; 
    if (this.ZM.Zj())
      return; 
    if (((Boolean)this.Zo.get()).booleanValue())
      this.ZJ.run(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */