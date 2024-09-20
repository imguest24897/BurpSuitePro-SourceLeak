package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zrrp extends Zrgr {
  Zrrp(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe, false);
  }
  
  public boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    boolean bool;
    Zz1p zz1p;
    int i = Zrgr.Zi();
    switch (ZC()) {
      case 0:
      case 1:
        bool = false;
        zz1p = paramZml3.Zi();
        for (Zt8g zt8g : zz1p.ZV) {
          if (zt8g.ZbQ() == Zrdu.BODY_PARAM_URL_ENCODED || zt8g.ZbQ() == Zrdu.BODY_PARAM_MULTIPART || zt8g.ZbQ() == Zrdu.URL_PARAM) {
            bool = true;
            if (i == 0)
              continue; 
            break;
          } 
          continue;
          if (i == 0)
            break; 
        } 
        return (bool == ((ZC() == 0) ? true : false));
    } 
    Zuh.Zv(false, Zqf.Zk, ZC());
    return false;
  }
  
  public boolean ZQ(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    Zeo2 zeo2;
    switch (ZC()) {
      case 0:
      case 1:
        return ZV(paramZml3, paramZrgd, paramZgb6, paramZz28, paramZr1j, paramZkh7);
      case 2:
      case 3:
        return (paramZml3.Zp() == ((ZC() == 2)));
      case 4:
      case 5:
        return (paramZml3.Zn() == ((ZC() == 4)));
      case 6:
      case 7:
        zeo2 = paramZml3.Zd();
        return (zeo2.ZXo() == ((ZC() == 6)));
    } 
    Zuh.Zv(false, Zqf.Zk, ZC());
    return false;
  }
  
  public String Zf() {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrrp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */