package burp;

import java.util.Collections;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zs1x {
  private static int ZF;
  
  public static Zx_5 ZY(Zmzk paramZmzk, String paramString, Zvow paramZvow, int paramInt) {
    int i = Zs();
    Zerj zerj = Zi(paramInt);
    if (i != 0)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zx_5(Zzu2.ASP_NET_DEBUGGING_ENABLED, (byte)0, paramInt, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), zerj.Zs, zerj.ZC, paramZmzk, Zkb.Zy(paramString), null);
  }
  
  public static Zerj Zi(int paramInt) {
    int i = Zs();
    Zerj zerj = new Zerj();
    switch (paramInt) {
      case 1:
        zerj.ZC = 3;
        zerj.Zs = 2;
        if (i != 0);
        return zerj;
      case 2:
        zerj.ZC = 1;
        zerj.Zs = 2;
        if (i != 0)
          break; 
        return zerj;
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    zerj.ZC = 0;
    zerj.Zs = 0;
    return zerj;
  }
  
  public static void ZH(int paramInt) {
    ZF = paramInt;
  }
  
  public static int ZA() {
    return ZF;
  }
  
  public static int Zs() {
    int i = ZA();
    return (i == 0) ? 95 : 0;
  }
  
  static {
    if (Zs() != 0)
      ZH(34); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs1x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */