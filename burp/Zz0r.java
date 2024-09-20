package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zz0r implements Zlmh {
  public Zr27 ZF(Zzct paramZzct) {
    switch (Zzx6.ZD[paramZzct.ordinal()]) {
      case 1:
        return Zr27.JAVASCRIPT_INJECTION_UNQUOTED_ASSIGNMENT;
      case 2:
        return Zr27.JAVASCRIPT_INJECTION_SINGLE_QUOTED_ASSIGNMENT;
      case 3:
        return Zr27.JAVASCRIPT_INJECTION_DOUBLE_QUOTED_ASSIGNMENT;
      case 4:
        return Zr27.JAVASCRIPT_INJECTION_BACKTICKS_QUOTED_ASSIGNMENT;
    } 
    Zuh.ZT(true, Zqf.Zk, paramZzct.name());
    return Zr27.NONE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz0r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */