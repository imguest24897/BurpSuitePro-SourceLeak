package burp;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zkfr implements Zrus {
  private final Zx5y ZO;
  
  private final Ztwv ZD;
  
  private Zkfr(Zx5y paramZx5y, Ztwv paramZtwv) {
    this.ZO = paramZx5y;
    this.ZD = paramZtwv;
  }
  
  public Zg33 Zn(Zt90 paramZt90, Zb6n paramZb6n) {
    Objects.requireNonNull(this.ZO);
    Future<?> future = this.ZD.Zx(this.ZO::Zf);
    try {
      future.get(10L, TimeUnit.SECONDS);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      this.ZO.ZN();
      future.cancel(true);
    } 
    return Zx_g.ZG(paramZt90, paramZb6n, new Zxae());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkfr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */