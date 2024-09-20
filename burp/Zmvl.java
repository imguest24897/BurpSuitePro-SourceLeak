package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zmvl {
  private static String Zg;
  
  public static Zsqx<Zrdb> Zc(Zmzk paramZmzk, String paramString1, Zvow paramZvow, Zxs7 paramZxs7, byte[] paramArrayOfbyte, String paramString2) {
    return new Zx_5(Zzu2.FILE_PATH_MANIPULATION, (byte)0, 1, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.FILENAME, paramString2) }), Collections.singletonList(new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow)), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static Zsqx<Zrdb> ZY(Zmzk paramZmzk, String paramString, byte paramByte, Zvow paramZvow1, Zvow paramZvow2, Zxs7 paramZxs7, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    String str = Zy();
    if (Zbqc.Zwu() == null)
      ZO("b731p"); 
    return new Zx_5(Zzu2.FILE_PATH_MANIPULATION, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(Zl2v.Zp(new Zt2w(new Zz25(paramArrayOfbyte1, 0), paramZvow1), new Zt2w(new Zz25(paramArrayOfbyte2, 0), paramZvow2))), paramByte, (byte)1, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void ZO(String paramString) {
    Zg = paramString;
  }
  
  public static String Zy() {
    return Zg;
  }
  
  static {
    if (Zy() != null)
      ZO("VpCMV"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmvl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */