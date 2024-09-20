package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zmrt {
  private static String[] Zj;
  
  public static Zsqx<Zrdb> ZN(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2) {
    String[] arrayOfString = ZF();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zx_5(Zzu2.CREDIT_CARD_NUMBERS_DISCLOSED, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, Zb99.Zn(new String[] { paramString2 }))), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void Zn(String[] paramArrayOfString) {
    Zj = paramArrayOfString;
  }
  
  public static String[] ZF() {
    return Zj;
  }
  
  static {
    if (ZF() == null)
      Zn(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmrt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */