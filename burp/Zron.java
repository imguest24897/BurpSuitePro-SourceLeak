package burp;

import java.time.Instant;

class Zron {
  private final Zb43 ZW;
  
  private final Instant ZU;
  
  private final Zrgd Za;
  
  Zron(Zb43 paramZb43, Zrgd paramZrgd) {
    this.ZW = paramZb43;
    this.Za = paramZrgd;
    this.ZU = paramZrgd.Zn();
  }
  
  boolean ZD() {
    return this.Za.Zn().isAfter(this.ZU.plusMillis(5000L));
  }
  
  long Zn() {
    return this.ZW.ZH();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zron.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */