package burp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Zssq {
  private final Map<Byte, Zzrl> Zq = new HashMap<>();
  
  public Zbfg Zy() {
    return new Zbfg(this, Collections.unmodifiableMap(this.Zq));
  }
  
  public Zssq Za(byte paramByte, Zzrl paramZzrl) {
    this.Zq.put(Byte.valueOf(paramByte), paramZzrl);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zssq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */