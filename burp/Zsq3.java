package burp;

import java.time.Instant;

public class Zsq3 {
  private static String ZL;
  
  static Instant ZW(long paramLong) {
    return (paramLong == -1L) ? null : Instant.ofEpochMilli(paramLong);
  }
  
  static void Zu(Instant paramInstant, Zk21 paramZk21, Zkit paramZkit) {
    String str = Zb();
    if (paramInstant == null) {
      paramZkit.ZV(paramZk21, Zk_8.ZU, -1L);
      if (str != null) {
        Zbqc.Zr(new Zbqc[3]);
      } else {
        return;
      } 
    } 
    paramZkit.ZV(paramZk21, Zk_8.ZU, paramInstant.toEpochMilli());
  }
  
  public static void ZR(String paramString) {
    ZL = paramString;
  }
  
  public static String Zb() {
    return ZL;
  }
  
  static {
    if (Zb() != null)
      ZR("lrG8rb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsq3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */