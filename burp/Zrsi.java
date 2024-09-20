package burp;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zrsi implements ThreadFactory {
  private final AtomicInteger ZQ = new AtomicInteger();
  
  public Thread newThread(Runnable paramRunnable) {
    Zuh.Zb((this.ZQ.incrementAndGet() == 1), Zqf.Zr);
    Thread thread = new Thread(paramRunnable);
    thread.setPriority(10);
    return thread;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrsi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */