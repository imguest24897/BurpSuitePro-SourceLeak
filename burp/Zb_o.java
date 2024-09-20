package burp;

import java.util.Timer;
import java.util.TimerTask;

class Zb_o {
  private final Timer ZP = new Timer();
  
  private TimerTask ZA;
  
  public void Zu(Runnable paramRunnable) {
    if (this.ZA != null)
      this.ZA.cancel(); 
    this.ZA = new Zxjr(this, paramRunnable);
    this.ZP.schedule(this.ZA, 100L);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb_o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */