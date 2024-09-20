package burp;

import java.util.concurrent.atomic.AtomicInteger;

public class Zm90 {
  private final Zlz4 Zf;
  
  private final Zr69 Zu;
  
  private final Zt1g Zg;
  
  private final AtomicInteger ZO;
  
  public Zm90(Zlz4 paramZlz4, Zr69 paramZr69, Zt1g paramZt1g) {
    this.Zf = paramZlz4;
    this.Zu = paramZr69;
    this.Zg = paramZt1g;
    this.ZO = new AtomicInteger(0);
  }
  
  public void ZU(boolean paramBoolean) {
    this.Zf.Z_();
    if (paramBoolean) {
      int i = this.ZO.incrementAndGet();
      try {
        if (this.Zu.Zq() > 0)
          try {
            if (i >= this.Zu.Zq())
              ZI(new Zb6l(Zec4.CONSECUTIVE_CRAWLING_REQUEST_FAILURES, Integer.valueOf(i))); 
          } catch (Zlff zlff) {
            throw a(null);
          }  
      } catch (Zlff zlff) {
        throw a(null);
      } 
      int j = this.Zf.ZO();
      try {
        if (j >= 10 && this.Zu.Zg() > 0) {
          int k = this.Zf.Zc();
          float f = k / j * 100.0F;
          try {
            if (f > this.Zu.Zg())
              ZI(new Zb6l(Zec4.PERCENTAGE_OF_CRAWL_REQUEST_FAILURES, Integer.valueOf(this.Zu.Zg()))); 
          } catch (Zlff zlff) {
            throw a(null);
          } 
        } 
      } catch (Zlff zlff) {
        throw a(null);
      } 
    } 
  }
  
  public void Zm() {
    try {
      if (this.Zu.ZW() == 0)
        return; 
    } catch (Zlff zlff) {
      throw a(null);
    } 
    try {
      if (this.Zf.ZO() + 1 > this.Zu.ZW())
        throw new Zlff(); 
    } catch (Zlff zlff) {
      throw a(null);
    } 
  }
  
  private void ZI(Zb6l paramZb6l) {
    this.Zu.ZD().Zy(Zrp6.DEBUG, Zlq7.HTTP_FAILURE, new Object[] { paramZb6l.ZX() });
    this.Zg.ZZ(paramZb6l);
  }
  
  public void ZJ() {
    this.ZO.set(0);
  }
  
  private static Zlff a(Zlff paramZlff) {
    return paramZlff;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm90.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */