package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zx6h {
  static boolean ZR(int paramInt) {
    return ((paramInt & Integer.MIN_VALUE) == Integer.MIN_VALUE);
  }
  
  static int ZF(int paramInt) {
    return paramInt & Integer.MAX_VALUE;
  }
  
  static int Ze(int paramInt) {
    Zuh.Zb(!ZR(paramInt), Zqf.Zk);
    return paramInt | Integer.MIN_VALUE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx6h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */