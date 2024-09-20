package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zton {
  private static String[] ZG;
  
  public static Zx_5 Zc(Zmzk paramZmzk, String paramString, Zvow paramZvow, int paramInt) {
    String[] arrayOfString = ZG();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.FRAMEABLE_RESPONSE_POTENTIAL_CLICKJACKING, (byte)0, paramInt, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)2, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void ZN(String[] paramArrayOfString) {
    ZG = paramArrayOfString;
  }
  
  public static String[] ZG() {
    return ZG;
  }
  
  static {
    if (ZG() == null)
      ZN(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zton.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */