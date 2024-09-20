package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zz63 {
  private static int ZB;
  
  public static Zsqx<Zrdb> Zc(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2) {
    int i = Zh();
    if (i != 0)
      Zbqc.Zr(new Zbqc[5]); 
    return new Zx_5(Zzu2.SOCIAL_SECURITY_NUMBERS_DISCLOSED, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, Zb99.Zn(new String[] { paramString2 }))), (byte)1, (byte)1, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void ZC(int paramInt) {
    ZB = paramInt;
  }
  
  public static int Zh() {
    return ZB;
  }
  
  public static int Zw() {
    int i = Zh();
    return (i == 0) ? 68 : 0;
  }
  
  static {
    if (Zh() != 0)
      ZC(72); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz63.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */