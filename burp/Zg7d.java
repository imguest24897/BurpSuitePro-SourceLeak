package burp;

import java.util.concurrent.atomic.AtomicBoolean;

class Zg7d {
  private final AtomicBoolean ZA;
  
  private final Runnable Zu;
  
  Zg7d(Runnable paramRunnable) {
    this.Zu = paramRunnable;
    this.ZA = new AtomicBoolean();
  }
  
  void ZP() {
    this.ZA.set(true);
  }
  
  void ZI() {
    this.ZA.set(false);
  }
  
  void Zp() {
    if (!this.ZA.get())
      this.Zu.run(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg7d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */