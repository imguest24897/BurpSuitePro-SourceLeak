package burp;

import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zeg2 implements Zk9e {
  private static final Zb6l Zw = new Zb6l(Zec4.UNKNOWN_UNRECOVERABLE_FAILURE);
  
  private final Zxgk Zd;
  
  private final Zbuz Za;
  
  private final AtomicInteger Zx;
  
  Zeg2(Zxgk paramZxgk, Zbuz paramZbuz) {
    this.Zd = paramZxgk;
    this.Za = paramZbuz;
    this.Zx = new AtomicInteger();
  }
  
  public void ZQ() {
    this.Zd.Zp();
  }
  
  public void ZV() {
    Zuh.Zb((this.Zx.getAndSet(0) != 1), Zqf.Zk);
  }
  
  public void ZY() {
    if (this.Zx.incrementAndGet() == 2) {
      this.Za.ZD(Zw);
      this.Zx.set(0);
    } 
  }
  
  public void Zg() {
    this.Zd.ZQ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeg2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */