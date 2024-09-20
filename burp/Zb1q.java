package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zb1q {
  private static String[] ZJ;
  
  public static Zx_5 Zj(Zmzk paramZmzk, String paramString1, Zvow paramZvow, Zxs7 paramZxs7, byte[] paramArrayOfbyte, int paramInt, String paramString2) {
    String[] arrayOfString = Zw();
    if (Zbqc.Zwu() == null)
      ZW(new String[3]); 
    return new Zx_5(Zzu2.HTTP_RESPONSE_HEADER_INJECTION_REFLECTED, (byte)0, paramInt, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.HEADER_NAME, paramString2) }), Collections.singletonList(new Zt2w(new Zz25(paramArrayOfbyte, paramInt), paramZvow)), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static void ZW(String[] paramArrayOfString) {
    ZJ = paramArrayOfString;
  }
  
  public static String[] Zw() {
    return ZJ;
  }
  
  static {
    if (Zw() == null)
      ZW(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */