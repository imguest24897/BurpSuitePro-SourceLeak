package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zz0o {
  private static String ZI;
  
  public static Zsqx<Zrdb> ZZ(Zmzk paramZmzk, String paramString, Zvow paramZvow, byte paramByte) {
    String str = Zi();
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
    return new Zx_5(Zzu2.DIRECTORY_LISTING, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), paramByte, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void Zo(String paramString) {
    ZI = paramString;
  }
  
  public static String Zi() {
    return ZI;
  }
  
  static {
    if (Zi() != null)
      Zo("v7R8Fb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz0o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */