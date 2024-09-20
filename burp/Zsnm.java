package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

public class Zsnm {
  private static Zbqc[] Zv;
  
  public static Zsqx<Zrdb> ZB(Zmzk paramZmzk, String paramString, Zvow paramZvow1, Zvow paramZvow2, Zxs7 paramZxs7, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    List<Zlfv> list = Arrays.asList(new Zlfv[] { new Zt2w(new Zz25(paramArrayOfbyte1, 0), paramZvow1), new Zt2w(null, paramZvow2) });
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REFLECTION, Zkb.ZG(paramArrayOfbyte2)), Zriz.ZG(Ztz3.ANGULAR_VERSION, Zkb.ZG(paramArrayOfbyte3)) });
    Zbqc[] arrayOfZbqc = ZO();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
    return ZW(paramZmzk, paramString, (List)list, paramZxs7, map, (byte)2);
  }
  
  public static Zsqx<Zrdb> ZN(Zmzk paramZmzk, String paramString, Zvow paramZvow, Zxs7 paramZxs7, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    List<Zt2w> list = Collections.singletonList(new Zt2w(new Zz25(paramArrayOfbyte1, 0), paramZvow));
    Map<Long, String> map = Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.REFLECTION, Zkb.ZG(paramArrayOfbyte2)) });
    Zbqc[] arrayOfZbqc = ZO();
    if (Zbqc.Zwu() == null)
      Zu(new Zbqc[4]); 
    return ZW(paramZmzk, paramString, (List)list, paramZxs7, map, (byte)1);
  }
  
  private static Zsqx<Zrdb> ZW(Zmzk paramZmzk, String paramString, List<Zlfv<? extends Zgkc>> paramList, Zxs7 paramZxs7, Map<Long, String> paramMap, byte paramByte) {
    return new Zx_5(Zzu2.CLIENT_SIDE_TEMPLATE_ENGINE_INJECTION, (byte)0, 0, paramMap, paramList, paramByte, (byte)4, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  public static void Zu(Zbqc[] paramArrayOfZbqc) {
    Zv = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZO() {
    return Zv;
  }
  
  static {
    if (ZO() == null)
      Zu(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsnm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */