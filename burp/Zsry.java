package burp;

import java.util.Collection;
import java.util.Collections;
import net.portswigger.Zkb;

public class Zsry {
  private static int Zr;
  
  public static Zsqx<Zrdb> Zf(Zmzk paramZmzk, String paramString1, Zvow paramZvow, byte paramByte, String paramString2, Collection<String> paramCollection) {
    int i = Zi();
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zx_5(Zzu2.SESSION_TOKEN_IN_URL, paramByte, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, paramCollection)), (byte)2, (byte)3, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void ZJ(int paramInt) {
    Zr = paramInt;
  }
  
  public static int Zi() {
    return Zr;
  }
  
  public static int Zz() {
    int i = Zi();
    return (i == 0) ? 95 : 0;
  }
  
  static {
    if (Zi() != 0)
      ZJ(99); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */