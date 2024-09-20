package burp;

import java.util.concurrent.atomic.AtomicInteger;

class Zlca {
  private final AtomicInteger ZX;
  
  private final Runnable ZU;
  
  public Zlca(Runnable paramRunnable) {
    this.ZU = paramRunnable;
    this.ZX = new AtomicInteger(0);
  }
  
  void ZL() {
    this.ZX.incrementAndGet();
  }
  
  void Zh() {
    if (this.ZX.decrementAndGet() == 0)
      this.ZU.run(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlca.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */