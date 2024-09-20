package burp;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Zl1t {
  private final Zrk_ ZS;
  
  private final Zbqs Zc;
  
  private final ScheduledExecutorService ZP;
  
  private final Object Zx;
  
  private ScheduledFuture<?> Zs;
  
  Zl1t(Zrk_ paramZrk_, Zbqs paramZbqs, Ztwv paramZtwv, Zgb6 paramZgb6) {
    this.ZS = paramZrk_;
    this.Zc = paramZbqs;
    this.ZP = paramZtwv.Ze();
    this.Zx = new Object();
    paramZgb6.Z_(new Zgfs(this, paramZgb6::lambda$new$0));
  }
  
  public void ZV() {
    synchronized (this.Zx) {
      if (this.Zs == null)
        this.Zs = this.ZP.scheduleWithFixedDelay(this::lambda$start$1, 20L, 60L, TimeUnit.SECONDS); 
    } 
  }
  
  private void Zu() {
    synchronized (this.Zx) {
      if (this.Zs != null) {
        this.Zs.cancel(false);
        this.Zs = null;
      } 
    } 
  }
  
  private void lambda$start$1() {
    this.Zc.ZJ(this.ZS.ZO());
  }
  
  private static Boolean lambda$new$0(Zgb6 paramZgb6) {
    return Boolean.valueOf((paramZgb6.ZU0()).ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl1t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */