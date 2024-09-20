package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zmuv {
  private static boolean Zh;
  
  public static Zsqx<Zrdb> ZZ(Zmzk paramZmzk, String paramString1, byte paramByte, Zvow paramZvow, long paramLong1, long paramLong2, Zxs7 paramZxs7, byte[] paramArrayOfbyte, String paramString2) {
    boolean bool = ZX();
    if (!bool)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zx_5(Zzu2.SERVER_SIDE_JAVASCRIPT_CODE_INJECTION, paramByte, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.CANARY, paramString2) }), Collections.singletonList(new Zt27(new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow), paramLong1, paramLong2)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static void ZE(boolean paramBoolean) {
    Zh = paramBoolean;
  }
  
  public static boolean ZX() {
    return Zh;
  }
  
  public static boolean Zi() {
    boolean bool = ZX();
    return !bool;
  }
  
  static {
    if (Zi())
      ZE(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmuv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */