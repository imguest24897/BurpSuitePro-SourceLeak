package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zkqa {
  private static int[] Zr;
  
  public static Zsqx<Zrdb> Zy(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    int[] arrayOfInt = ZV();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
    return new Zx_5(Zzu2.BROWSER_XSS_FILTER_DISABLED, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void ZF(int[] paramArrayOfint) {
    Zr = paramArrayOfint;
  }
  
  public static int[] ZV() {
    return Zr;
  }
  
  static {
    if (ZV() == null)
      ZF(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkqa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */