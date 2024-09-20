package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zzt6 {
  private static boolean Zh;
  
  public static Zx_5 ZS(Zmzk paramZmzk, String paramString, byte paramByte, Zvow paramZvow, long paramLong1, long paramLong2, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    boolean bool = Zu();
    if (Zbqc.Zwu() == null)
      ZJ(!bool); 
    return new Zx_5(Zzu2.PERL_CODE_INJECTION, paramByte, 0, Collections.emptyMap(), Collections.singletonList(new Zt27(new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow), paramLong1, paramLong2)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void ZJ(boolean paramBoolean) {
    Zh = paramBoolean;
  }
  
  public static boolean ZQ() {
    return Zh;
  }
  
  public static boolean Zu() {
    boolean bool = ZQ();
    return !bool;
  }
  
  static {
    if (!Zu())
      ZJ(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzt6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */