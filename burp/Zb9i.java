package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zkb;

public class Zb9i {
  private static Zbqc[] ZY;
  
  public static Zsqx<Zrdb> Zf(Zmzk paramZmzk, String paramString, Zvow paramZvow, List<Zsjh<?>> paramList, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    Zbqc[] arrayOfZbqc = Zu();
    if (Zbqc.Zwu() == null)
      Zg(new Zbqc[1]); 
    return new Zx_5(Zzu2.SMTP_HEADER_INJECTION, (byte)0, 0, Collections.emptyMap(), Zbxq.ZS(paramArrayOfbyte, paramZvow, paramList), (byte)3, (byte)3, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zg(Zbqc[] paramArrayOfZbqc) {
    ZY = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zu() {
    return ZY;
  }
  
  static {
    if (Zu() != null)
      Zg(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb9i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */