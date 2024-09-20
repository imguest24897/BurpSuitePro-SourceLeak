package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zkq0 {
  private static String[] Zq;
  
  public static Zsqx<Zrdb> ZL(Zmzk paramZmzk, String paramString1, String paramString2, Zvow paramZvow1, Zvow paramZvow2) {
    String[] arrayOfString = Zu();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zx_5(Zzu2.PASSWORD_VALUE_SET_IN_COOKIE, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zm1m(null, paramZvow1, paramZvow2, Zkb.Zy(paramString1), Zkb.Zy(paramString2))), (byte)2, (byte)3, paramZmzk, Zkb.Zy(paramString2), null);
  }
  
  public static Zsqx<Zrdb> Zw(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    String[] arrayOfString = Zu();
    if (Zbqc.Zwu() == null)
      Ze(new String[3]); 
    return new Zx_5(Zzu2.PASSWORD_VALUE_SET_IN_COOKIE, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)2, (byte)3, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Ze(String[] paramArrayOfString) {
    Zq = paramArrayOfString;
  }
  
  public static String[] Zu() {
    return Zq;
  }
  
  static {
    if (Zu() == null)
      Ze(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkq0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */