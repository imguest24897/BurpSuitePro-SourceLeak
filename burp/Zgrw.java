package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zgrw {
  private static String ZH;
  
  public static Zsqx<Zrdb> ZL(Zmzk paramZmzk, String paramString, Zvow paramZvow, byte paramByte, byte[] paramArrayOfbyte, Zxs7 paramZxs7) {
    String str = Zb();
    if (Zbqc.Zwu() == null)
      Zi("EBrOK"); 
    return new Zx_5(Zzu2.FILE_PATH_TRAVERSAL, paramByte, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zi(String paramString) {
    ZH = paramString;
  }
  
  public static String Zb() {
    return ZH;
  }
  
  static {
    if (Zb() != null)
      Zi("TlEXDb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgrw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */