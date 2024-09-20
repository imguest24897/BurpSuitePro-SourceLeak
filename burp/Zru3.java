package burp;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Zru3 implements Zxfy, Supplier<Zen5> {
  private final AtomicInteger Zn = new AtomicInteger();
  
  private final AtomicInteger Zb = new AtomicInteger();
  
  private final AtomicInteger Zi = new AtomicInteger();
  
  public Zen5 Z_() {
    return new Zgzw(this.Zn.get(), this.Zb.get(), this.Zi.get());
  }
  
  public void Zu() {
    this.Zn.incrementAndGet();
  }
  
  public void ZM() {
    this.Zn.decrementAndGet();
    this.Zi.incrementAndGet();
  }
  
  public void ZT() {
    this.Zb.incrementAndGet();
  }
  
  public void Zp() {
    this.Zb.decrementAndGet();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zru3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */