package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zxlf {
  private static String Zo;
  
  public static Zx_5 Zm(Zmzk paramZmzk, String paramString, byte paramByte, Zvow paramZvow, long paramLong1, long paramLong2, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    String str = Z_();
    if (str != null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zx_5(Zzu2.UNIDENTIFIED_CODE_INJECTION, paramByte, 0, Collections.emptyMap(), Collections.singletonList(new Zt27(new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow), paramLong1, paramLong2)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zt(String paramString) {
    Zo = paramString;
  }
  
  public static String Z_() {
    return Zo;
  }
  
  static {
    if (Z_() != null)
      Zt("QaT8Jb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxlf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */