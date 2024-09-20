package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zz0d {
  private static int ZY;
  
  public static Zsqx<Zrdb> Zu(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    int i = ZN();
    if (i != 0)
      Zbqc.Zr(new Zbqc[5]); 
    return new Zx_5(Zzu2.STRICT_TRANSPORT_SECURITY_NOT_ENFORCED, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)2, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zx(int paramInt) {
    ZY = paramInt;
  }
  
  public static int ZD() {
    return ZY;
  }
  
  public static int ZN() {
    int i = ZD();
    return (i == 0) ? 16 : 0;
  }
  
  static {
    if (ZN() != 0)
      Zx(66); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz0d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */