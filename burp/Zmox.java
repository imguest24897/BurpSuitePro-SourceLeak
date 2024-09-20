package burp;

import net.portswigger.Zh6;
import net.portswigger.Zqw;

public class Zmox implements Zqw {
  private final Zqw Zx;
  
  private final Zgb6 Zp;
  
  private static int ZG;
  
  public Zmox(Zqw paramZqw, Zgb6 paramZgb6) {
    this.Zx = paramZqw;
    this.Zp = paramZgb6;
  }
  
  public void ZA(Zh6 paramZh6) {
    if (this.Zp.Zqj())
      this.Zx.ZA(paramZh6); 
  }
  
  public static void Zo(int paramInt) {
    ZG = paramInt;
  }
  
  public static int ZF() {
    return ZG;
  }
  
  public static int Zb() {
    int i = ZF();
    return (i == 0) ? 28 : 0;
  }
  
  static {
    if (Zb() != 0)
      Zo(25); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmox.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */