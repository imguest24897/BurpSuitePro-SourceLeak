package burp;

import java.util.Collections;
import java.util.EnumSet;
import net.portswigger.Zkb;

public class Zx45 {
  private static String[] Zz;
  
  public static Zsqx<Zrdb> Zr(Zmzk paramZmzk, String paramString, Zvow paramZvow, Zk8m paramZk8m, EnumSet<Zklf> paramEnumSet1, EnumSet<Zklf> paramEnumSet2) {
    String[] arrayOfString = ZM();
    if (Zbqc.Zwu() == null)
      Zx(new String[1]); 
    return new Zx_5(Zzu2.CONTENT_TYPE_INCORRECTLY_STATED, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.NUM_CONTENT_TYPE_STATEMENTS, String.valueOf(paramZk8m.ZB().size())), Zriz.ZG(Ztz3.CONTENT_TYPE_STATED, paramZk8m.ZJ()), Zriz.ZG(Ztz3.CONTENT_TYPE_INFERRED, Zk8m.Zm(paramZk8m.Zj)), Zriz.ZG(Ztz3.BROWSERS, Zrt0.Zm(paramEnumSet1)), Zriz.ZG(Ztz3.HTML_BROWSERS, Zrt0.Zm(paramEnumSet2)) }), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)2, (byte)2, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zx(String[] paramArrayOfString) {
    Zz = paramArrayOfString;
  }
  
  public static String[] ZM() {
    return Zz;
  }
  
  static {
    if (ZM() == null)
      Zx(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx45.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */