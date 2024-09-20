package burp;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.LongStream;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zz15 implements Zspe {
  private final CountDownLatch Zv;
  
  private final Runnable ZT;
  
  private final AtomicBoolean Zp;
  
  private final int ZU;
  
  Zz15(int paramInt1, int paramInt2, Runnable paramRunnable) {
    this.ZT = paramRunnable;
    this.Zv = new CountDownLatch(paramInt1);
    this.Zp = new AtomicBoolean();
    this.ZU = paramInt2;
  }
  
  public void ZL() throws Zs92 {
    this.Zv.countDown();
    try {
      boolean bool = !this.Zv.await(this.ZU, TimeUnit.MILLISECONDS) ? true : false;
      try {
        if (bool)
          throw new Zs92(); 
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
    } finally {
      try {
        if (this.Zp.compareAndSet(false, true))
          this.ZT.run(); 
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
    } 
  }
  
  public void Za() {
    LongStream.range(0L, this.Zv.getCount()).forEach(this::lambda$cancel$0);
  }
  
  private void lambda$cancel$0(long paramLong) {
    this.Zv.countDown();
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz15.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */