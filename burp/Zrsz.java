package burp;

import net.portswigger.Zdz;

public final class Zrsz {
  private static String Zi;
  
  public static boolean ZQ(String paramString) {
    return Zdz.ZF.contains(paramString);
  }
  
  public static void ZT(String paramString) {
    Zi = paramString;
  }
  
  public static String Zr() {
    return Zi;
  }
  
  static {
    if (Zr() == null)
      ZT("U75g"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrsz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */