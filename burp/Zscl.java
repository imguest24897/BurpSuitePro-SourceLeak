package burp;

import net.portswigger.Zcr;

public class Zscl {
  public final Zcr Z_;
  
  public Zm36 Zt;
  
  private static String[] Zh;
  
  public Zscl(Zcr paramZcr, Zm36 paramZm36) {
    this.Z_ = paramZcr;
    this.Zt = paramZm36;
  }
  
  public static void Zj(String[] paramArrayOfString) {
    Zh = paramArrayOfString;
  }
  
  public static String[] ZL() {
    return Zh;
  }
  
  static {
    if (ZL() != null)
      Zj(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zscl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */