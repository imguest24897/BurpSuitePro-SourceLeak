package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zesx {
  private static String[] ZR;
  
  public static Zx_5 ZM(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2) {
    String[] arrayOfString = ZJ();
    if (Zbqc.Zwu() == null)
      Ze(new String[5]); 
    return new Zx_5(Zzu2.EMAIL_ADDRESSES_DISCLOSED, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, Zb99.Zn(new String[] { paramString2 }))), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void Ze(String[] paramArrayOfString) {
    ZR = paramArrayOfString;
  }
  
  public static String[] ZJ() {
    return ZR;
  }
  
  static {
    if (ZJ() == null)
      Ze(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zesx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */