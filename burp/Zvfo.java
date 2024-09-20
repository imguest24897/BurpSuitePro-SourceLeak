package burp;

import java.util.Collection;
import java.util.Collections;
import net.portswigger.Zkb;

public class Zvfo {
  private static Zbqc[] ZO;
  
  public static Zsqx<Zrdb> Zu(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2, Collection<String> paramCollection) {
    Zbqc[] arrayOfZbqc = ZH();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.BASE_64_ENCODED_DATA_IN_PARAMETER, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, paramCollection)), (byte)2, (byte)1, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void Ze(Zbqc[] paramArrayOfZbqc) {
    ZO = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZH() {
    return ZO;
  }
  
  static {
    if (ZH() != null)
      Ze(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */