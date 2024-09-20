package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zshj {
  private static int[] ZC;
  
  public static Zx_5 Zk(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    int[] arrayOfInt = ZH();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zx_5(Zzu2.CACHEABLE_HTTPS_RESPONSE, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void ZP(int[] paramArrayOfint) {
    ZC = paramArrayOfint;
  }
  
  public static int[] ZH() {
    return ZC;
  }
  
  static {
    if (ZH() != null)
      ZP(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zshj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */