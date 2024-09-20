package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zr5y {
  private final Zlp9 Z_;
  
  private final Zer0 ZX;
  
  private final Zlp9 ZS;
  
  private Zr5y(Zewx paramZewx, Zer0 paramZer0) {
    this.Z_ = paramZewx.ZG();
    this.ZX = paramZer0;
    Ztt6 ztt6 = (new Zrh3(paramZer0.Zi())).Zd();
    Zuh.ZT((ztt6 != null), Zqf.Zk, paramZer0.Zi());
    this.ZS = (ztt6 == null) ? null : ztt6.ZN();
  }
  
  boolean ZM() {
    return (this.ZX.ZO() == 1);
  }
  
  boolean ZK() {
    return (this.ZS != null && this.ZS == this.Z_);
  }
  
  boolean ZI() {
    return (this.ZX.ZA() != Zb25.DNS);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr5y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */