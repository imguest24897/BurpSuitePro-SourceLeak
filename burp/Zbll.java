package burp;

import java.util.Collections;
import java.util.List;

public class Zbll {
  public final Zewx Zk;
  
  public List<Zsjh<?>> ZP;
  
  public byte[] ZR;
  
  private Zbll(Zewx paramZewx, List<Zsjh<?>> paramList, byte[] paramArrayOfbyte) {
    this.Zk = paramZewx;
    this.ZP = paramList;
    this.ZR = paramArrayOfbyte;
  }
  
  public static Zbll Zu(Zewx paramZewx) {
    return Zu(paramZewx, null);
  }
  
  public static Zbll Zu(Zewx paramZewx, byte[] paramArrayOfbyte) {
    return ZA(paramZewx, Collections.emptyList(), paramArrayOfbyte);
  }
  
  public static Zbll ZA(Zewx paramZewx, List<Zsjh<?>> paramList, byte[] paramArrayOfbyte) {
    return new Zbll(paramZewx, paramList, paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbll.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */