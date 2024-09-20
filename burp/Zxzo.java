package burp;

import java.util.Collection;
import java.util.Collections;
import net.portswigger.Zkb;

public class Zxzo {
  private static String Za;
  
  public static Zsqx<Zrdb> ZW(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2, Collection<String> paramCollection) {
    String str = ZP();
    if (Zbqc.Zwu() == null)
      Ze("XKOdab"); 
    return new Zx_5(Zzu2.PASSWORD_SUBMITTED_USING_GET_METHOD, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.ACTION_URL, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, paramCollection)), (byte)3, (byte)2, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void Ze(String paramString) {
    Za = paramString;
  }
  
  public static String ZP() {
    return Za;
  }
  
  static {
    if (ZP() == null)
      Ze("J9MnYb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxzo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */