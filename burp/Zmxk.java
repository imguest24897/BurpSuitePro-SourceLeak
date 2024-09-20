package burp;

import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zmxk implements Zkfj {
  private final Ztai Z_;
  
  Zmxk(Ztai paramZtai) {
    this.Z_ = paramZtai;
  }
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.ZR).ZK(paramZbll.Zk.Zn(paramZbll, paramZxs7));
    Zzu2 zzu2 = ZZ(paramZbll.Zk.ZG());
    return (zzu2 != null && this.Z_.Zr(zzu2)) ? Zzhp.ZV(zzu2, paramZe3n.Za(), paramZe3n.ZN(), zvow, paramZxs7, paramZbll.Zk.Zh(), paramZbll.ZP) : null;
  }
  
  private Zzu2 ZZ(Zlp9 paramZlp9) {
    switch (Zrxs.ZF[paramZlp9.ordinal()]) {
      case 1:
        return Zzu2.JWT_JKU_HEADER_SUPPORTED;
      case 2:
        return Zzu2.JWT_X5U_HEADER_SUPPORTED;
    } 
    Zuh.ZT(false, Zqf.Zr, paramZlp9.name());
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmxk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */