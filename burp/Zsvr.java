package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsvr {
  private final Zm42 Zg;
  
  public Zsvr(Zm42 paramZm42) {
    this.Zg = paramZm42;
  }
  
  public Zmrh Zi(Zxwh paramZxwh) {
    switch (Zrg7.Zt[paramZxwh.ZWG().ordinal()]) {
      case 1:
        return new Zlwp(paramZxwh);
      case 2:
        return new Zzmj(paramZxwh);
      case 3:
        return new Ztn(paramZxwh);
      case 4:
        return new Zs4q(paramZxwh);
      case 5:
        return new Zeuk(paramZxwh);
      case 6:
        return new Ztyz(paramZxwh);
      case 7:
        return new Zbw(paramZxwh);
      case 8:
        return new Zb1a(paramZxwh);
      case 9:
        return new Zt9g(paramZxwh);
      case 10:
        return new Zt75(paramZxwh);
      case 11:
        return new Zrs7(paramZxwh);
      case 12:
        return new Zma5(paramZxwh, this.Zg);
      case 13:
        return new Zt_(paramZxwh);
      case 14:
        return new Zt0(paramZxwh, this.Zg);
    } 
    Zuh.ZT(false, Zqf.Zk, (paramZxwh.ZWG()).displayName);
    return Zmye.Zr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsvr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */