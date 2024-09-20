package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztuh {
  private static Zbqc[] Z_;
  
  static byte Zv(Zeew paramZeew) {
    switch (Zrpw.Zz[paramZeew.ordinal()]) {
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
  
  public static void Zx(Zbqc[] paramArrayOfZbqc) {
    Z_ = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zz() {
    return Z_;
  }
  
  static {
    if (Zz() == null)
      Zx(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztuh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */