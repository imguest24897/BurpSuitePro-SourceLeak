package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zxf7 {
  private static int[] Zh;
  
  public static Zsqx<Zrdb> Zg(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    int[] arrayOfInt = ZX();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zx_5(Zzu2.LONG_REDIRECTION_RESPONSE, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)2, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void ZS(int[] paramArrayOfint) {
    Zh = paramArrayOfint;
  }
  
  public static int[] ZX() {
    return Zh;
  }
  
  static {
    if (ZX() == null)
      ZS(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxf7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */