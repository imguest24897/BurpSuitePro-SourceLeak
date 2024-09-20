package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zld2 {
  static byte ZB(Zeew paramZeew) {
    if (paramZeew == null)
      return 0; 
    switch (Zl74.ZU[paramZeew.ordinal()]) {
      case 1:
        return 1;
      case 2:
        return 4;
      case 3:
        return 5;
    } 
    Zuh.ZT(false, Zqf.Zk, paramZeew.toolName);
    return 0;
  }
  
  static Zeew Zm(byte paramByte) {
    switch (paramByte) {
      case 0:
        return null;
      case 1:
        return Zeew.PROXY;
      case 4:
        return Zeew.REPEATER;
      case 5:
        return Zeew.EXTENDER;
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zld2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */