package burp;

import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zbfo implements Runnable {
  private final Matcher Zp;
  
  private final CountDownLatch Zv;
  
  private boolean Zu = false;
  
  Zbfo(Matcher paramMatcher, CountDownLatch paramCountDownLatch) {
    int[] arrayOfInt = Zbue.ZI();
    this.Zp = paramMatcher;
    this.Zv = paramCountDownLatch;
    if (Zbqc.Zwu() == null)
      Zbue.ZM(new int[2]); 
  }
  
  public void run() {
    int[] arrayOfInt = Zbue.ZI();
    try {
      this.Zu = this.Zp.find();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
    } finally {
      this.Zv.countDown();
    } 
    try {
      if (arrayOfInt != null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  public boolean ZF() {
    return this.Zu;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */