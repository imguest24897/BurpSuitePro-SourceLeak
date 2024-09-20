package burp;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

public class Zs5z implements Supplier<Duration> {
  private final Zttn Zx;
  
  private final Zv8z Zw;
  
  private final AtomicInteger ZJ;
  
  private final AtomicLong Zb;
  
  private final AtomicLong Zy;
  
  private final Zskh Zu;
  
  public Zs5z(Zttn paramZttn, Zv8z paramZv8z, Zskh paramZskh) {
    this.Zx = paramZttn;
    this.Zw = paramZv8z;
    this.Zu = paramZskh;
    this.ZJ = new AtomicInteger();
    this.Zb = new AtomicLong(10L);
    this.Zy = new AtomicLong(10L);
  }
  
  public Duration ZO() {
    int i = this.Zw.Zz();
    long l = ZW(i) ? this.Zb.accumulateAndGet(2L, Zs5z::lambda$get$0) : this.Zb.get();
    Duration duration1 = Duration.ofMillis(l);
    Duration duration2 = this.Zx.ZB(i);
    return duration1.plus(duration2);
  }
  
  private boolean ZW(int paramInt) {
    return (paramInt > this.ZJ.get() + 100);
  }
  
  void Zi(Zlit paramZlit) {
    this.ZJ.set(this.Zw.Zb());
    long l1 = this.Zb.addAndGet(10L);
    long l2 = this.Zy.getAndAccumulate(l1, Math::max);
    if (l2 < l1)
      Zmgc.AUTO_BACKOFF_APPLIED.ZK(this.Zu, new Object[] { Zmg3.ZD(paramZlit), Long.valueOf(l1) }); 
  }
  
  void Zz() {
    this.Zb.set(10L);
  }
  
  private static long lambda$get$0(long paramLong1, long paramLong2) {
    return Math.max(paramLong1 - paramLong2, 10L);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */