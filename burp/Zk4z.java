package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zk4z extends Zklz<Zx_z> {
  private static int ZR;
  
  Zk4z() {
    super(new Zm31[0], (Zllo<Zx_z>)null, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Zx_z> Z_(byte paramByte) {
    try {
      switch (paramByte) {
        case 100:
          return (Zeu4)Ze6.ZI;
        case 101:
          return (Zeu4)Zmhu.ZZ;
        case 102:
          return (Zeu4)Zz9d.Z_;
        case 103:
          return (Zeu4)Zgay.ZX;
        case 104:
          return (Zeu4)Zl3h.Zb;
        case 105:
          return (Zeu4)Zr_8.ZZ;
        case 106:
          return (Zeu4)Zkq6.ZV;
        case 107:
          return (Zeu4)Zlmg.Z_;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    throw new UnsupportedOperationException();
  }
  
  public static void Ze(int paramInt) {
    ZR = paramInt;
  }
  
  public static int ZE() {
    return ZR;
  }
  
  public static int ZT() {
    int i = ZE();
    try {
      if (i == 0)
        return 106; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    if (ZE() != 0)
      Ze(17); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk4z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */