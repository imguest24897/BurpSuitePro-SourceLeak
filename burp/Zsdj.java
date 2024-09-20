package burp;

import java.util.Arrays;
import java.util.Collections;
import net.portswigger.Zkb;

public class Zsdj {
  private static int[] ZV;
  
  public static Zsqx<Zrdb> Zt(Zmzk paramZmzk, String paramString, byte paramByte, int paramInt, Zvow paramZvow) {
    return new Zx_5(Zzu2.PATH_RELATIVE_STYLESHEET_IMPORT, (byte)0, paramInt, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), paramByte, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static Zsqx<Zrdb> Zc(Zmzk paramZmzk, String paramString, byte paramByte, int paramInt, Zvow paramZvow1, Zvow paramZvow2, Zvow paramZvow3) {
    int[] arrayOfInt = ZH();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.PATH_RELATIVE_STYLESHEET_IMPORT, (byte)0, paramInt, Collections.emptyMap(), Arrays.asList((Zlfv<? extends Zgkc>[])new Zlfv[] { new Zt2w(null, paramZvow1), new Zt2w(null, paramZvow2), new Zt2w(null, paramZvow3) }), paramByte, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zt(int[] paramArrayOfint) {
    ZV = paramArrayOfint;
  }
  
  public static int[] ZH() {
    return ZV;
  }
  
  static {
    if (ZH() != null)
      Zt(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsdj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */