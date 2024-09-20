package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Zxgs implements Zms6 {
  private final AtomicBoolean ZQ;
  
  private final AtomicInteger ZK;
  
  private final AtomicBoolean Zr;
  
  private final Zstw Zq;
  
  public Zxgs(Zstw paramZstw) {
    this.Zq = paramZstw;
    this.ZQ = new AtomicBoolean(false);
    this.ZK = new AtomicInteger(0);
    this.Zr = new AtomicBoolean(false);
  }
  
  public void Zd() {
    this.ZQ.set(true);
    ZA();
  }
  
  public void ZX() {
    this.ZK.decrementAndGet();
    ZA();
  }
  
  public void Zi() {
    this.ZK.incrementAndGet();
    this.ZQ.set(false);
    this.Zr.set(false);
  }
  
  private void ZA() {
    if (Zw() && this.Zr.compareAndSet(false, true))
      this.Zq.Zm(); 
  }
  
  public boolean Zw() {
    return (this.ZQ.get() && this.ZK.get() == 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */