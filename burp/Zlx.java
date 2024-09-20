package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlx implements Zkfj {
  private final Zs40 Ze;
  
  public Zlx(Zs40 paramZs40) {
    this.Ze = paramZs40;
  }
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    String str = Zmit.ZH();
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.ZR).ZK(this.Ze.Zn(paramZbll, paramZxs7)).Z_(Collections.singletonList(paramZbll.Zk.ZE(paramZbll.ZR)));
    if (str != null)
      Zbqc.Zr(new Zbqc[4]); 
    return Zrnz.Zw(paramZe3n.Za(), paramZe3n.ZN(), ZZ(paramZer0, paramZbll.Zk), Zxwd.ZN(paramZbll.Zk.ZG(), paramZxs7), zvow, paramZbll.ZP, paramZxs7, paramZbll.Zk.ZV());
  }
  
  private byte ZZ(Zer0 paramZer0, Zewx paramZewx) {
    if (paramZer0 != null)
      switch (Zb_m.Zx[paramZer0.ZA().ordinal()]) {
        case 1:
          return 0;
        case 2:
          return 1;
        case 3:
          Zuh.Zb(false, Zqf.Zk);
          return 0;
      }  
    switch (Zb_m.ZG[paramZewx.ZG().ordinal()]) {
      case 1:
      case 2:
      case 3:
        return 0;
      case 4:
        return 1;
    } 
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */