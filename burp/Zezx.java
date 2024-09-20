package burp;

import java.awt.Window;

public class Zezx {
  private final Window Zs;
  
  private static boolean Zv;
  
  public Zezx(Window paramWindow) {
    this.Zs = paramWindow;
  }
  
  public String ZV(String paramString1, String paramString2, String paramString3) {
    return Zb12.ZG() ? "" : Zrv7.ZT(this.Zs, paramString1, paramString2, paramString3);
  }
  
  public String Zi(String paramString) {
    return Zb12.ZG() ? "" : Zrvq.ZK(this.Zs, paramString, true);
  }
  
  public String ZM(String paramString1, String paramString2, String paramString3) {
    return Zb12.ZG() ? "" : Zrvh.Zm(this.Zs, paramString1, paramString2, paramString3);
  }
  
  public static void ZU(boolean paramBoolean) {
    Zv = paramBoolean;
  }
  
  public static boolean Zx() {
    return Zv;
  }
  
  public static boolean ZY() {
    boolean bool = Zx();
    return !bool;
  }
  
  static {
    if (Zx())
      ZU(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zezx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */