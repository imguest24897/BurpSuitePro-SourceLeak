package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zkb;

public class Zkir {
  private static Zbqc[] Ze;
  
  public static Zsqx<Zrdb> Ze(Zlvf paramZlvf, Zxs7 paramZxs7, byte[] paramArrayOfbyte, Zl1r paramZl1r, List<Zl1r> paramList) {
    Zbqc[] arrayOfZbqc = ZE();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[5]); 
    return new Zx_5(Zzu2.XML_INJECTION, (byte)0, 0, Collections.emptyMap(), (List)Collections.singletonList(paramZlvf.Zq(new Zz25(paramArrayOfbyte, 0), Collections.singletonList(paramZl1r), paramList)), (byte)1, (byte)3, paramZlvf.ZB(), paramZlvf.ZD(), paramZxs7);
  }
  
  public static Zsqx<Zrdb> Zb(Zmzk paramZmzk, String paramString, Zvow paramZvow, Zxs7 paramZxs7, List<Zsjh<?>> paramList, byte[] paramArrayOfbyte) {
    return new Zx_5(Zzu2.XML_INJECTION, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt69(new Zz25(paramArrayOfbyte, 0), paramZvow, paramList)), (byte)3, (byte)3, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zm(Zbqc[] paramArrayOfZbqc) {
    Ze = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZE() {
    return Ze;
  }
  
  static {
    if (ZE() != null)
      Zm(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkir.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */