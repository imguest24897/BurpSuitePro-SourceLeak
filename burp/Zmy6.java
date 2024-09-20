package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zmy6 implements Zlmh {
  public Zr27 ZF(Zzct paramZzct) {
    switch (Zzx6.ZD[paramZzct.ordinal()]) {
      case 2:
        return Zr27.DOM_XSS_SINGLE_QUOTED_HTML_ATTR;
      case 3:
        return Zr27.DOM_XSS_DOUBLE_QUOTED_HTML_ATTR;
    } 
    Zuh.ZT(true, Zqf.Zk, paramZzct.name());
    return Zr27.NONE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmy6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */