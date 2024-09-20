package burp;

import java.util.Map;

public class Zs8x implements Zlfv<Zlg_> {
  private final Zei8<?> ZD;
  
  private final Zrde ZG;
  
  private final String Zy;
  
  private final String Zg;
  
  private final String Zx;
  
  private static boolean Zq;
  
  public Zs8x(Zei8<?> paramZei8, String paramString1, String paramString2, String paramString3) {
    this.Zy = paramString1;
    this.Zg = paramString2;
    this.Zx = paramString3;
    this.ZG = null;
    this.ZD = paramZei8;
  }
  
  public Zsqx<Zlg_> Zc(Map<Zvow, Zzi8> paramMap) {
    return new Zt3r(this, paramMap);
  }
  
  public static void ZI(boolean paramBoolean) {
    Zq = paramBoolean;
  }
  
  public static boolean Ze() {
    return Zq;
  }
  
  public static boolean ZQ() {
    boolean bool = Ze();
    return !bool;
  }
  
  static {
    if (ZQ())
      ZI(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */