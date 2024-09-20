package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zsth {
  private static boolean Z_;
  
  public static Zsqx<Zrdb> ZU(Zmzk paramZmzk, String paramString1, String paramString2, Zvow paramZvow1, Zvow paramZvow2, byte paramByte) {
    boolean bool = ZH();
    if (bool)
      Zbqc.Zr(new Zbqc[5]); 
    return new Zx_5(Zzu2.PASSWORD_RETURNED_IN_LATER_RESPONSE, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zm1m(null, paramZvow1, paramZvow2, Zkb.Zy(paramString1), Zkb.Zy(paramString2))), paramByte, (byte)3, paramZmzk, Zkb.Zy(paramString2), null);
  }
  
  public static void ZH(boolean paramBoolean) {
    Z_ = paramBoolean;
  }
  
  public static boolean ZH() {
    return Z_;
  }
  
  public static boolean ZE() {
    boolean bool = ZH();
    return !bool;
  }
  
  static {
    if (!ZE())
      ZH(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsth.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */