package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zg2v {
  private static int Zw;
  
  public static Zx_5 Zl(Zmzk paramZmzk, String paramString1, Zvow paramZvow1, Zvow paramZvow2, String paramString2) {
    int i = ZZ();
    if (i != 0)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.HTTP_PUT_METHOD_IS_ENABLED, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.FILENAME, paramString2) }), Collections.singletonList(new Zm1m(null, paramZvow1, paramZvow2, Zkb.Zy(paramString1), Zkb.Zy(paramString1))), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void Zw(int paramInt) {
    Zw = paramInt;
  }
  
  public static int ZT() {
    return Zw;
  }
  
  public static int ZZ() {
    int i = ZT();
    return (i == 0) ? 34 : 0;
  }
  
  static {
    if (ZZ() != 0)
      Zw(25); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */