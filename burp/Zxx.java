package burp;

import java.util.Collections;
import net.portswigger.Zdo;

public class Zxx {
  private static boolean ZG;
  
  public static Zsqx<Zrdb> Zr(Zmzk paramZmzk, Zvow paramZvow) {
    boolean bool = ZE();
    if (bool)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.HTTP_TRACE_METHOD_IS_ENABLED, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)1, paramZmzk, Zdo.Za, null);
  }
  
  public static void Zh(boolean paramBoolean) {
    ZG = paramBoolean;
  }
  
  public static boolean ZE() {
    return ZG;
  }
  
  public static boolean Zy() {
    boolean bool = ZE();
    return !bool;
  }
  
  static {
    if (!Zy())
      Zh(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */