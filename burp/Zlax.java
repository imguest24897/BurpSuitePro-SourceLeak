package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.browser.Ztf;

public class Zlax {
  private final Ztks ZU;
  
  private final Zzs1 Zl;
  
  private final Zz28 ZR;
  
  private final Zzmb ZT;
  
  private final Zgb6 Zk;
  
  public Zlax(Ztks paramZtks, Zzs1 paramZzs1, Zz28 paramZz28, Zzmb paramZzmb, Zgb6 paramZgb6) {
    this.ZU = paramZtks;
    this.Zl = paramZzs1;
    this.ZR = paramZz28;
    this.ZT = paramZzmb;
    this.Zk = paramZgb6;
  }
  
  Zzb Zh(Zkvp paramZkvp) {
    try {
      Zzb zzb = this.ZU.Zq(paramZkvp, this.ZR, this.ZT, this.Zk, this.Zl);
      Zuh.Zb(zzb.Zk(), Zqf.Zr);
      return zzb;
    } catch (Ztf ztf) {
      Zah.Zl((Throwable)ztf, Zk_.RETHROWN);
      throw new Zsck(ztf);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlax.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */