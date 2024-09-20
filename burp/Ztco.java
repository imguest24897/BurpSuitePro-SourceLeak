package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Ztco {
  private static Zbqc[] Zc;
  
  public static Zx_5 ZL(Zmzk paramZmzk, String paramString, Zvow paramZvow, Ztbr paramZtbr) {
    Zbqc[] arrayOfZbqc = ZO();
    if (Zbqc.Zwu() == null)
      Zb(new Zbqc[2]); 
    return new Zx_5(Zzu2.DUPLICATE_COOKIES_SET, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramZtbr.Zqy()) }), Collections.singletonList(new Zrn_(paramZvow, Zb99.Zn(new String[] { paramZtbr.Zqy() }))), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zb(Zbqc[] paramArrayOfZbqc) {
    Zc = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZO() {
    return Zc;
  }
  
  static {
    if (ZO() != null)
      Zb(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztco.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */