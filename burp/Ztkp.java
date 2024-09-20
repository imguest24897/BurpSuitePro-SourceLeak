package burp;

import java.util.concurrent.CountDownLatch;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ztkp implements Zb6n {
  private final Zt90 Zp;
  
  private final CountDownLatch ZM;
  
  public Ztkp(Zt90 paramZt90) {
    this.Zp = paramZt90;
    this.ZM = new CountDownLatch(1);
    paramZt90.Zf(new Zra7(this), Zxc8.REST_API);
  }
  
  public Zg33 Zh(Zkce paramZkce) {
    try {
      this.ZM.await();
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
      Thread.currentThread().interrupt();
    } 
    return new Zg33(this.Zp.Zn(), false);
  }
  
  public Zg33 Zz(Zkce paramZkce) {
    try {
      this.ZM.await();
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
      Thread.currentThread().interrupt();
    } 
    return new Zg33(this.Zp.Zn(), false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztkp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */