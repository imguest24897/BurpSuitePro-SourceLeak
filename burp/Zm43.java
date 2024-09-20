package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zm43 {
  private static Zbqc[] Zo;
  
  public static Zsqx<Zrdb> Zl(Zmzk paramZmzk, String paramString1, Zvow paramZvow, String paramString2) {
    Zbqc[] arrayOfZbqc = Ze();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.FILE_UPLOAD_FUNCTIONALITY, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.ACTION_URL, paramString2) }), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)1, paramZmzk, Zkb.Zy(paramString1), null);
  }
  
  public static void ZZ(Zbqc[] paramArrayOfZbqc) {
    Zo = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Ze() {
    return Zo;
  }
  
  static {
    if (Ze() != null)
      ZZ(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm43.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */