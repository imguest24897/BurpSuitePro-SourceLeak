package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Ze0k {
  private static String ZS;
  
  public static Zsqx<Zrdb> ZH(Zmzk paramZmzk, String paramString, byte paramByte1, Zvow paramZvow1, Zvow paramZvow2, byte paramByte2) {
    String str = Zx();
    if (str == null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zx_5(Zzu2.REFERER_DEPENDENT_RESPONSE, paramByte1, 0, Collections.emptyMap(), Collections.singletonList(Zl2v.Zp(new Zt2w(null, paramZvow1), new Zt2w(null, paramZvow2))), paramByte2, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zb(String paramString) {
    ZS = paramString;
  }
  
  public static String Zx() {
    return ZS;
  }
  
  static {
    if (Zx() == null)
      Zb("K0PJx"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze0k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */