package burp;

import java.util.concurrent.atomic.AtomicReference;

public class Ztcy {
  private final AtomicReference<Zb9a> ZU = new AtomicReference<>();
  
  private final AtomicReference<Zb9a> ZD = new AtomicReference<>();
  
  public void ZN(Zb9a paramZb9a) {
    this.ZU.set(paramZb9a);
  }
  
  public void Zq(Zb9a paramZb9a) {
    this.ZD.set(paramZb9a);
  }
  
  public Zb9a ZW() {
    return this.ZU.get();
  }
  
  public Zb9a ZS() {
    return this.ZD.get();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztcy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */