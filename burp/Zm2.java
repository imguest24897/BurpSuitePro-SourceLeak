package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zm2 implements Zih {
  private final Zih ZP;
  
  private final Zih ZN;
  
  private static boolean ZD;
  
  public Zm2(Zbip paramZbip, Ze0y paramZe0y) {
    Zkko zkko = new Zkko();
    this.ZP = new Zs5p(zkko, paramZe0y, paramZbip);
    this.ZN = new Zm19(zkko);
  }
  
  public byte[] ZL(Zsp paramZsp) throws Zzt7 {
    try {
      switch (Zt0a.ZF[paramZsp.Zi.ordinal()]) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
          return this.ZN.ZL(paramZsp);
        case 8:
          return this.ZP.ZL(paramZsp);
      } 
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    Zuh.ZT(false, Zqf.Zr, paramZsp.Zi.toString());
    return this.ZN.ZL(paramZsp);
  }
  
  public static void Zt(boolean paramBoolean) {
    ZD = paramBoolean;
  }
  
  public static boolean ZB() {
    return ZD;
  }
  
  public static boolean ZD() {
    boolean bool = ZB();
    return !bool;
  }
  
  private static Zzt7 a(Zzt7 paramZzt7) {
    return paramZzt7;
  }
  
  static {
    if (!ZD())
      Zt(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */