package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zx4i {
  private static Zbqc[] ZB;
  
  public static Zsqx<Zrdb> Zs(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    Zbqc[] arrayOfZbqc = ZF();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.CONTENT_TYPE_NOT_SPECIFIED, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void ZA(Zbqc[] paramArrayOfZbqc) {
    ZB = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZF() {
    return ZB;
  }
  
  static {
    if (ZF() != null)
      ZA(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */