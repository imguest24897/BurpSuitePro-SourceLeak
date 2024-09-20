package burp;

import java.util.Collections;
import net.portswigger.Zkb;

public class Zs2s {
  private static Zbqc[] Zh;
  
  public static Zsqx<Zrdb> ZG(Zmzk paramZmzk, String paramString, Zvow paramZvow, Zxs7 paramZxs7, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    Zbqc[] arrayOfZbqc = ZG();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.EXPRESSION_LANGUAGE_ENGINE_INJECTION, (byte)1, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REFLECTION, Zkb.ZG(paramArrayOfbyte2)) }), Collections.singletonList(new Zt2w(new Zz25(paramArrayOfbyte1, 0), paramZvow)), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zl(Zbqc[] paramArrayOfZbqc) {
    Zh = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZG() {
    return Zh;
  }
  
  static {
    if (ZG() == null)
      Zl(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs2s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */