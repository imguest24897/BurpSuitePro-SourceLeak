package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zle5 {
  private static String ZU;
  
  public static Zx_5 ZP(Zmzk paramZmzk, String paramString, byte paramByte, Zvow paramZvow, long paramLong1, long paramLong2, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    String str = ZH();
    if (Zbqc.Zwu() == null)
      ZJ("Hmf99b"); 
    return new Zx_5(Zzu2.PYTHON_CODE_INJECTION, paramByte, 0, Collections.emptyMap(), Collections.singletonList(new Zt27(new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow), paramLong1, paramLong2)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void ZJ(String paramString) {
    ZU = paramString;
  }
  
  public static String ZH() {
    return ZU;
  }
  
  static {
    if (ZH() != null)
      ZJ("gFREtb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zle5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */