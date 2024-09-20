package burp;

import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zrbv implements Zkfj {
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.ZR).ZK(paramZbll.Zk.Zn(paramZbll, paramZxs7));
    return Zrbh.ZU(paramZe3n.Za(), paramZe3n.ZN(), ZL(paramZbll.Zk.ZG()), zvow, paramZbll.ZP, paramZxs7, paramZbll.Zk.ZV());
  }
  
  private static byte ZL(Zlp9 paramZlp9) {
    switch (Zzy8.ZZ[paramZlp9.ordinal()]) {
      case 1:
        return 2;
      case 2:
        return 3;
      case 3:
        return 4;
      case 4:
        return 5;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrbv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */