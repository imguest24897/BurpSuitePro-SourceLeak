package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zrlm {
  private static String Z_;
  
  public static Zsqx<Zrdb> ZN(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2) {
    String str = ZQ();
    if (str == null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.PRIVATE_IP_ADDRESSES_DISCLOSED, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, Zb99.Zn(new String[] { paramString2 }))), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void Zw(String paramString) {
    Z_ = paramString;
  }
  
  public static String ZQ() {
    return Z_;
  }
  
  static {
    if (ZQ() == null)
      Zw("wSuHab"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrlm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */