package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zscn {
  private static Zbqc[] Zd;
  
  public static Zsqx<Zrdb> Zt(Zmzk paramZmzk, String paramString, Zvow paramZvow) {
    Zbqc[] arrayOfZbqc = Zq();
    if (Zbqc.Zwu() == null)
      ZR(new Zbqc[5]); 
    return new Zx_5(Zzu2.PRIVATE_KEY_DISCLOSED, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static void ZR(Zbqc[] paramArrayOfZbqc) {
    Zd = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zq() {
    return Zd;
  }
  
  static {
    if (Zq() == null)
      ZR(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zscn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */