package burp;

import java.util.concurrent.atomic.AtomicBoolean;

public class Zlvy {
  private final AtomicBoolean ZW = new AtomicBoolean(false);
  
  public boolean Zr() {
    return this.ZW.get();
  }
  
  public boolean Zh() {
    return this.ZW.compareAndSet(true, false);
  }
  
  public void Zr(boolean paramBoolean) {
    this.ZW.set(paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlvy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */