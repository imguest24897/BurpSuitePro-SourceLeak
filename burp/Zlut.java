package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zlut {
  private static Zbqc[] Zz;
  
  public static Zsqx<Zrdb> ZO(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    Zbqc[] arrayOfZbqc = Zu();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zx_5(Zzu2.ASP_NET_VIEWSTATE_WITHOUT_MAC_ENABLED, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)2, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void ZI(Zbqc[] paramArrayOfZbqc) {
    Zz = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zu() {
    return Zz;
  }
  
  static {
    if (Zu() != null)
      ZI(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlut.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */