package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zrih implements Ztpx {
  private final Ztpx Zj;
  
  private final Zbza ZA;
  
  private final Zkg9 Zf;
  
  private Zrih(Ztpx paramZtpx, Zbza paramZbza, Zkg9 paramZkg9) {
    this.Zj = paramZtpx;
    this.ZA = paramZbza;
    this.Zf = paramZkg9;
  }
  
  public Zsxd ZJ(Ztaw paramZtaw) throws Zgum {
    try {
      if (this.ZA != null)
        this.ZA.ZgM(); 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    try {
      return this.Zj.ZJ(paramZtaw);
    } catch (Zscd zscd) {
      try {
        Zah.Zl(zscd, Zk_.RETHROWN);
        if (this.ZA != null)
          this.ZA.Zgq(); 
      } catch (Zscd zscd1) {
        throw a(null);
      } 
      throw zscd;
    } finally {
      this.Zf.ZG(this.ZA);
    } 
  }
  
  private static Zscd a(Zscd paramZscd) {
    return paramZscd;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrih.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */