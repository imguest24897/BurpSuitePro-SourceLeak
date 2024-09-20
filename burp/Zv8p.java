package burp;

import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zv8p extends Zv84 {
  private final Supplier<Ztc6> ZN;
  
  Zv8p(Supplier<Ztc6> paramSupplier) {
    this.ZN = paramSupplier;
  }
  
  public Zvb Zb(Zvb paramZvb) {
    try {
      Ztc6 ztc6 = this.ZN.get();
      return (Zvb)((ztc6 == null) ? new Zo_() : (ztc6.ZB() ? new Zon() : new Zox(ztc6)));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return new Zo_();
    } 
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */