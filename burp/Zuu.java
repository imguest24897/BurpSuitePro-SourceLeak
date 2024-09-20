package burp;

import java.time.Duration;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zuu extends Zu3 implements Zr5h {
  private final Zr_4 Zm;
  
  @Zzvo(16)
  private final Zz1i ZJ;
  
  @Zzvo(17)
  private Zb4g Zz;
  
  Zuu(Zr_4 paramZr_4, int paramInt, String paramString1, String paramString2, String paramString3, Zz1i paramZz1i, Zb4g paramZb4g, Zl5o paramZl5o) {
    super(paramInt, paramString1, paramString2, paramString3, paramZl5o);
    this.Zm = paramZr_4;
    this.ZJ = paramZz1i;
    this.Zz = paramZb4g;
  }
  
  public Zkcl ZNs() {
    return Zkcl.SCAN_AUDIT;
  }
  
  public Zz1i Zdm() {
    return this.ZJ;
  }
  
  public Zb4g Zd5() {
    if (this.Zz == null) {
      this.Zz = Zbit.Zw(this.Zm, ZPo());
      Zrpc.ZF(this.Zz);
    } 
    return this.Zz;
  }
  
  public void Zr(Duration paramDuration) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZHG() {}
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkpq.Z_, 1871779041);
  }
  
  public Zeu4<? extends Zgna> ZF() {
    return (Zeu4)Zr5h.Zx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zuu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */