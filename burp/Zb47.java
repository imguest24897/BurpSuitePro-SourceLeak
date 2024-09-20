package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zb47 {
  static byte Zy(Zx_5 paramZx_5, Zer0 paramZer0) {
    return (paramZx_5 == null) ? ZN(paramZer0) : (((paramZx_5.ZK() == 0 && paramZer0.ZA() == Zb25.HTTPS) || (paramZx_5.ZK() == 1 && paramZer0.ZA() == Zb25.HTTP) || paramZx_5.ZK() == 2) ? 2 : paramZx_5.ZK());
  }
  
  private static byte ZN(Zer0 paramZer0) {
    switch (Zzbp.ZN[paramZer0.ZA().ordinal()]) {
      case 1:
        return 1;
      default:
        Zuh.ZT(false, Zqf.Zk, paramZer0.ZA().toString());
        break;
      case 2:
        break;
    } 
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb47.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */