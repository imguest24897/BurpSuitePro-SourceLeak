package burp;

import java.util.HashMap;
import java.util.Map;

public class Zxmx extends Zxsr implements Zz9x {
  private final Map<String, Zzuq> ZA = new HashMap<>();
  
  private static int ZS;
  
  Zxmx(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zeu4<? extends Zz9x> ZF() {
    return ZQ;
  }
  
  private Zbom lambda$getHostScanCheckHistory$0(Zmzk paramZmzk) {
    return this.Za.<Zbom>ZH(new Zmyh());
  }
  
  public static void ZC(int paramInt) {
    ZS = paramInt;
  }
  
  public static int Zr() {
    return ZS;
  }
  
  public static int Zt() {
    int i = Zr();
    return (i == 0) ? 8 : 0;
  }
  
  static {
    if (Zt() == 0)
      ZC(37); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxmx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */