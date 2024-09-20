package burp;

import java.util.HashMap;
import java.util.Map;

public class Ze7b {
  private final Map<Zez3, Zxya> ZY = new HashMap<>();
  
  public Zxya ZK(Zez3 paramZez3) {
    Zxya zxya = this.ZY.get(paramZez3);
    return (zxya == null) ? null : (!zxya.ZX.ZF(paramZez3) ? null : zxya);
  }
  
  public Zxya Zl(Zez3 paramZez3, Zxya paramZxya) {
    return this.ZY.put(paramZez3, paramZxya);
  }
  
  public Zxya Zr(Zez3 paramZez3) {
    return this.ZY.remove(paramZez3);
  }
  
  public void ZU() {
    this.ZY.clear();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */