package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zkb;

public class Zrnz {
  private static Zbqc[] ZZ;
  
  public static Zx_5 Zw(Zmzk paramZmzk, String paramString, byte paramByte, Zxwd paramZxwd, Zvow paramZvow, List<Zsjh<?>> paramList, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    Zbqc[] arrayOfZbqc = Zd();
    if (!paramList.isEmpty())
      return new Zx_5(Zzu2.OUT_OF_BAND_RESOURCE_LOAD_HTTP, paramByte, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.DELIVERY_VECTOR, String.valueOf(paramZxwd.typeIndex)) }), Collections.singletonList(new Zt69(new Zz25(paramArrayOfbyte, 0), paramZvow, paramList)), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7); 
    if (Zbqc.Zwu() == null)
      ZR(new Zbqc[1]); 
    return new Zx_5(Zzu2.OUT_OF_BAND_RESOURCE_LOAD_HTTP, paramByte, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.DELIVERY_VECTOR, String.valueOf(paramZxwd.typeIndex)) }), Collections.singletonList(new Zt2w(new Zz25(paramArrayOfbyte, 0), paramZvow)), (byte)3, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void ZR(Zbqc[] paramArrayOfZbqc) {
    ZZ = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zd() {
    return ZZ;
  }
  
  static {
    if (Zd() == null)
      ZR(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrnz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */