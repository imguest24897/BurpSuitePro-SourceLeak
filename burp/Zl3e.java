package burp;

import java.util.HashMap;
import java.util.Map;

class Zl3e {
  private static final Map<Byte, Zg3e> Zv = new HashMap<>();
  
  static Zg3e Zg(byte paramByte) {
    return Zv.get(Byte.valueOf(paramByte));
  }
  
  static {
    for (Zg3e zg3e : Zg3e.values())
      Zv.put(Byte.valueOf(zg3e.typeIndex), zg3e); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl3e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */