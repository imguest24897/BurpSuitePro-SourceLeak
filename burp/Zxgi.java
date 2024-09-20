package burp;

import java.util.Collections;
import net.portswigger.Zdo;

public class Zxgi {
  private static String Zp;
  
  public static Zsqx<Zrdb> ZT(Zmzk paramZmzk) {
    String str = ZU();
    if (str == null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.UNENCRYPTED_COMMUNICATIONS, (byte)0, 0, Collections.emptyMap(), Collections.emptyList(), (byte)3, (byte)2, paramZmzk, Zdo.Za, null);
  }
  
  public static void ZP(String paramString) {
    Zp = paramString;
  }
  
  public static String ZU() {
    return Zp;
  }
  
  static {
    if (ZU() == null)
      ZP("Xhg8Uc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */