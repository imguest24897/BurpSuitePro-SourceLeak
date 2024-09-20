package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Ztob {
  private static String[] ZK;
  
  public static Zsqx<Zrdb> ZZ(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    String[] arrayOfString = ZM();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zx_5(Zzu2.HTML_DOES_NOT_SPECIFY_CHARSET, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zm(String[] paramArrayOfString) {
    ZK = paramArrayOfString;
  }
  
  public static String[] ZM() {
    return ZK;
  }
  
  static {
    if (ZM() == null)
      Zm(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztob.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */