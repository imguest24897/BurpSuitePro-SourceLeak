package burp;

import java.util.concurrent.CountDownLatch;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zt87 implements Ztkr {
  private final CountDownLatch ZF = new CountDownLatch(1);
  
  private boolean Zq;
  
  public void ZA(boolean paramBoolean) {
    this.Zq = paramBoolean;
    this.ZF.countDown();
  }
  
  boolean ZE() {
    try {
      this.ZF.await();
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } 
    return this.Zq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt87.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */