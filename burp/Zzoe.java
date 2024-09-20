package burp;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

class Zzoe extends Zzom {
  private final Zlog Zd;
  
  private final Zr69 ZB;
  
  Zzoe(Zlog paramZlog, Zr69 paramZr69, Zrgd paramZrgd) {
    super(paramZlog, Zx0k.ZJ(paramZrgd, Duration.ofMinutes(2L), Duration.ofSeconds(15L)));
    this.Zd = paramZlog;
    this.ZB = paramZr69;
  }
  
  protected int ZI() {
    return this.Zd.ZnH().ZVN();
  }
  
  protected List<Duration> Zi() {
    return this.ZB.ZG().isPresent() ? Collections.<Duration>singletonList(this.ZB.ZG().get()) : Collections.<Duration>emptyList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzoe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */