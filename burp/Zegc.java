package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zegc {
  private static int ZY;
  
  public static Zsqx<Zrdb> Zx(Zmzk paramZmzk, String paramString, Zvow paramZvow1, Zvow paramZvow2, byte paramByte) {
    int i = ZZ();
    if (i == 0)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zx_5(Zzu2.USER_AGENT_DEPENDENT_RESPONSE, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(Zl2v.Zp(new Zt2w(null, paramZvow1), new Zt2w(null, paramZvow2))), paramByte, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zu(int paramInt) {
    ZY = paramInt;
  }
  
  public static int ZZ() {
    return ZY;
  }
  
  public static int Ze() {
    int i = ZZ();
    return (i == 0) ? 111 : 0;
  }
  
  static {
    if (ZZ() == 0)
      Zu(53); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zegc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */