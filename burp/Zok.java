package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zok {
  private static int[] ZS;
  
  static byte ZD(Zeew paramZeew) {
    if (paramZeew == null)
      return 9; 
    switch (Zg6i.Zf[paramZeew.ordinal()]) {
      case 1:
        return 0;
      case 2:
        return 1;
      case 3:
        return 2;
      case 4:
        return 3;
      case 5:
        return 4;
      case 6:
        return 5;
      case 7:
        return 8;
    } 
    Zuh.ZT(false, Zqf.Zk, paramZeew.toolName);
    return 0;
  }
  
  public static void ZE(int[] paramArrayOfint) {
    ZS = paramArrayOfint;
  }
  
  public static int[] Zi() {
    return ZS;
  }
  
  static {
    if (Zi() == null)
      ZE(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zok.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */