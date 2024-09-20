package burp;

import java.time.Duration;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zu9 extends Zu3 implements Zlog {
  private final Zr_4 Zb;
  
  @Zzvo(16)
  private final Zl7h Zw;
  
  @Zzvo(17)
  private Zb4g Ze;
  
  Zu9(Zr_4 paramZr_4, int paramInt, String paramString1, String paramString2, String paramString3, Zl7h paramZl7h, Zb4g paramZb4g) {
    super(paramInt, paramString1, paramString2, paramString3);
    this.Zb = paramZr_4;
    this.Zw = paramZl7h;
    this.Ze = paramZb4g;
  }
  
  public Zkcl ZNs() {
    return Zkcl.SCAN_CRAWL;
  }
  
  public Zl7h ZnH() {
    return this.Zw;
  }
  
  public Zb4g Zd5() {
    if (this.Ze == null) {
      this.Ze = Zbit.Zw(this.Zb, ZPo());
      Zrpc.ZF(this.Ze);
    } 
    return this.Ze;
  }
  
  public void Zr(Duration paramDuration) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZHG() {}
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkp7.Zl, 1639358769);
  }
  
  public Zeu4<? extends Zgna> ZF() {
    return (Zeu4)Zlog.ZD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zu9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */