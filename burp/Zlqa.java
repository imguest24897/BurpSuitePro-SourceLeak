package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zlqa {
  private static int[] ZN;
  
  public static Zsqx<Zrdb> Zh(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2) {
    int[] arrayOfInt = ZQ();
    if (Zbqc.Zwu() == null)
      Zw(new int[2]); 
    return new Zx_5(Zzu2.HTML_USES_UNRECOGNIZED_CHARSET, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, Zb99.Zn(new String[] { paramString2 }))), (byte)1, (byte)1, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void Zw(int[] paramArrayOfint) {
    ZN = paramArrayOfint;
  }
  
  public static int[] ZQ() {
    return ZN;
  }
  
  static {
    if (ZQ() != null)
      Zw(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlqa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */