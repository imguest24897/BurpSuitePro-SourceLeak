package burp;

import java.util.Collections;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxzr {
  private static Zbqc[] ZV;
  
  public static Zx_5 Zi(Zmzk paramZmzk, String paramString, Zvow paramZvow, int paramInt) {
    Zbqc[] arrayOfZbqc = Zv();
    Ze81 ze81 = Zq(paramInt);
    if (Zbqc.Zwu() == null)
      ZE(new Zbqc[3]); 
    return new Zx_5(Zzu2.ASP_NET_TRACING_ENABLED, (byte)0, paramInt, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), ze81.Zc, ze81.Zg, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  private static Ze81 Zq(int paramInt) {
    Zbqc[] arrayOfZbqc = Zv();
    Ze81 ze81 = new Ze81();
    switch (paramInt) {
      case 1:
        ze81.Zg = 4;
        ze81.Zc = 3;
        if (arrayOfZbqc != null);
        return ze81;
      case 2:
        ze81.Zg = 2;
        ze81.Zc = 2;
        if (arrayOfZbqc != null)
          break; 
        return ze81;
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    ze81.Zg = 0;
    ze81.Zc = 0;
    return ze81;
  }
  
  public static void ZE(Zbqc[] paramArrayOfZbqc) {
    ZV = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zv() {
    return ZV;
  }
  
  static {
    if (Zv() != null)
      ZE(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxzr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */