package burp;

import java.time.Duration;

public class Zv1 implements Zrwi {
  private static final long ZP = Duration.ofMinutes(1L).toMillis();
  
  private final Zrwi Zu;
  
  private final Zee7 ZR;
  
  private long ZY = 0L;
  
  Zv1(Zrwi paramZrwi, Zee7 paramZee7) {
    this.Zu = paramZrwi;
    this.ZR = paramZee7;
  }
  
  public boolean ZS() {
    return this.Zu.ZS();
  }
  
  public long Zt() {
    return (this.ZR.ZX() < this.ZY) ? 0L : ZF(this.Zu.Zt());
  }
  
  private long ZF(long paramLong) {
    if (paramLong < this.ZR.ZV() * 0.005D)
      this.ZY = this.ZR.ZX() + ZP; 
    return paramLong;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */