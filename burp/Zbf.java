package burp;

import net.portswigger.Zb1;

public final class Zbf {
  private static boolean ZH;
  
  public static boolean ZO(String paramString) {
    return Zb1.Zv.contains(paramString);
  }
  
  public static void ZY(boolean paramBoolean) {
    ZH = paramBoolean;
  }
  
  public static boolean ZP() {
    return ZH;
  }
  
  public static boolean ZZ() {
    boolean bool = ZP();
    return !bool;
  }
  
  static {
    if (!ZP())
      ZY(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */