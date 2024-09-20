package burp;

import java.util.Collections;
import java.util.Map;
import net.portswigger.Zkb;

public class Zkjo {
  private static boolean Zn;
  
  public static Zsqx<Zrdb> ZC(Zvs paramZvs, Zmzk paramZmzk, String paramString, Zvow paramZvow, int paramInt, Map<Long, String> paramMap) {
    return new Zx_5(paramZvs, (byte)0, paramInt, paramMap, Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, Zu(paramZvs, paramInt), paramZmzk, Zkb.Zy(paramString), null);
  }
  
  private static byte Zu(Zvs paramZvs, int paramInt) {
    return (paramZvs == Zzu2.CROSS_ORIGIN_RESOURCE_SHARING) ? 1 : (((paramInt & 0x40) == 64) ? 1 : (((paramInt & 0x1) == 1) ? 1 : (((paramInt & 0x10000) == 65536 && (paramInt & 0x1) != 1) ? 1 : (((paramInt & 0x2000000) == 33554432) ? 4 : (((paramInt & 0x1000000) == 16777216) ? 1 : ((paramZvs == Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ARBITRARY_ORIGIN) ? 4 : 2))))));
  }
  
  public static void Zq(boolean paramBoolean) {
    Zn = paramBoolean;
  }
  
  public static boolean ZH() {
    return Zn;
  }
  
  public static boolean ZQ() {
    boolean bool = ZH();
    return !bool;
  }
  
  static {
    if (ZQ())
      Zq(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkjo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */