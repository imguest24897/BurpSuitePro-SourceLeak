package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzpi {
  private Zmfc<?> Z_;
  
  private Zt70 Zj;
  
  public Zzpi Zv(Zt70 paramZt70) {
    Zs68 zs68 = paramZt70.ZH();
    String str = (zs68.Zd == null) ? null : Ztnx.ZN(zs68.Zd);
    Zmfc<Zs68> zmfc = Zmfc.Zw(paramZt70.Zj(), zs68.ZH, str, null, zs68, null);
    return ZE(zmfc);
  }
  
  public Zzpi ZU(Zski paramZski) {
    Zmfc<?> zmfc = Zmfc.Za(paramZski);
    return ZE(zmfc);
  }
  
  public Zzpi ZE(Zmfc<?> paramZmfc) {
    this.Z_ = paramZmfc;
    return this;
  }
  
  public Zzpi Zi(Zt70 paramZt70) {
    this.Zj = paramZt70;
    return this;
  }
  
  public Zlve Zu() {
    Zuh.Zb((this.Z_ != null), Zqf.Zv);
    return new Zlve(this.Z_, this.Zj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */