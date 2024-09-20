package burp;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Ztk3 implements Zt7b {
  private final ScheduledExecutorService Zo;
  
  private final Runnable ZQ;
  
  private Future<?> Zr;
  
  Ztk3(ScheduledExecutorService paramScheduledExecutorService, Runnable paramRunnable) {
    this.Zo = paramScheduledExecutorService;
    this.ZQ = paramRunnable;
  }
  
  public void Zj(Zgu3 paramZgu3) {
    ZE();
  }
  
  public void ZU() {
    ZE();
  }
  
  public void Zn() {
    ZE();
  }
  
  private void ZE() {
    if (this.Zr != null)
      this.Zr.cancel(false); 
    this.Zr = this.Zo.schedule(this.ZQ, 500L, TimeUnit.MILLISECONDS);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztk3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */