package burp;

import java.util.HashMap;
import java.util.Map;

public class Zl2z {
  private final Map<Zez3, Zb4b> ZD = new HashMap<>();
  
  public boolean ZD(Zez3 paramZez3, byte paramByte) {
    return ZU(paramZez3).ZI(paramByte);
  }
  
  public void ZS(Zez3 paramZez3, byte paramByte) {
    ZU(paramZez3).ZO(paramByte);
  }
  
  public void ZX(Zez3 paramZez3) {
    ZU(paramZez3).Zd();
  }
  
  public Zb4b ZU(Zez3 paramZez3) {
    Zb4b zb4b = this.ZD.get(paramZez3);
    if (zb4b == null) {
      zb4b = new Zb4b();
      this.ZD.put(paramZez3, zb4b);
    } 
    return zb4b;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl2z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */