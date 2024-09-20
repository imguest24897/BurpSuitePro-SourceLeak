package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zxom {
  private static boolean Zm;
  
  public static Zsqx<Zrdb> ZJ(Zmzk paramZmzk, String paramString1, byte paramByte1, byte paramByte2, Zvow paramZvow, String paramString2, int paramInt) {
    boolean bool = Z_();
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zx_5(Zzu2.SERIALIZED_OBJECT_IN_HTTP_MESSAGE, paramByte1, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.PARAMETER_NAME, paramString2), Zriz.ZG(Ztz3.HTML_ELEMENT_OFFSET, Integer.toString(paramInt)), Zriz.ZG(Ztz3.PERVASIVE_ISSUE_IDENTIFIER, paramString2) }), Collections.singletonList(new Zrn_(paramZvow, Collections.emptyList())), paramByte2, (byte)4, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void ZC(boolean paramBoolean) {
    Zm = paramBoolean;
  }
  
  public static boolean ZE() {
    return Zm;
  }
  
  public static boolean Z_() {
    boolean bool = ZE();
    return !bool;
  }
  
  static {
    if (Z_())
      ZC(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxom.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */