package burp;

import java.awt.Window;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import net.portswigger.Zm2;

public class Zlgj {
  private final Supplier<Zgx0> ZJ;
  
  private final Window Zx;
  
  private final AtomicInteger Zt;
  
  public Zlgj(Supplier<Zgx0> paramSupplier, Window paramWindow) {
    this.ZJ = paramSupplier;
    this.Zx = paramWindow;
    this.Zt = new AtomicInteger();
  }
  
  public void ZK() {
    Zl41 zl41 = ((Zgx0)this.ZJ.get()).ZL(this.Zx, null);
    if (this.Zt.incrementAndGet() >= 2)
      Zm2.Zi(Zv8r.SUITE_SEARCH_GLOBAL_SIMULTANEOUS_WINDOWS, this.Zt.get()); 
    zl41.addWindowListener(new Zb21(this));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlgj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */