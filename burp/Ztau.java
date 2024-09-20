package burp;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public class Ztau implements Supplier<Ztwh> {
  private final AtomicReference<Ztwh> Zg;
  
  public Ztau(Ztwh paramZtwh) {
    this.Zg = new AtomicReference<>(paramZtwh);
  }
  
  public Ztwh ZQ() {
    return this.Zg.get();
  }
  
  public void Zs(Ztwh paramZtwh) {
    this.Zg.set(paramZtwh);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztau.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */