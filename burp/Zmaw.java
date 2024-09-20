package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zmaw {
  private static boolean Zw;
  
  public static Zsqx<Zrdb> Zh(Zmzk paramZmzk, String paramString, Zvow paramZvow, int paramInt) {
    boolean bool = Zo();
    if (Zbqc.Zwu() == null)
      Zi(!bool); 
    return new Zx_5(Zzu2.SOURCE_CODE_DISCLOSURE, (byte)0, paramInt, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)1, (byte)2, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zi(boolean paramBoolean) {
    Zw = paramBoolean;
  }
  
  public static boolean Zo() {
    return Zw;
  }
  
  public static boolean ZG() {
    boolean bool = Zo();
    return !bool;
  }
  
  static {
    if (Zo())
      Zi(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmaw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */