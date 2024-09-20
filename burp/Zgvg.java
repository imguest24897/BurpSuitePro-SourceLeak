package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zgvg {
  private static int ZY;
  
  public static Zsqx<Zrdb> ZB(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    int i = ZP();
    if (i != 0)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.PASSWORD_RETURNED_IN_URL_QUERY_STRING, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)2, (byte)2, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zx(int paramInt) {
    ZY = paramInt;
  }
  
  public static int ZP() {
    return ZY;
  }
  
  public static int ZV() {
    int i = ZP();
    return (i == 0) ? 81 : 0;
  }
  
  static {
    if (ZV() == 0)
      Zx(116); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */