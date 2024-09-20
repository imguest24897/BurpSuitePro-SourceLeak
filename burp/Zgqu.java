package burp;

import java.util.HashMap;
import java.util.Map;

class Zgqu {
  private static final Map<Byte, Zgl5> ZF = new HashMap<>();
  
  static Zgl5 Zh(byte paramByte) {
    return ZF.get(Byte.valueOf(paramByte));
  }
  
  static {
    for (Zgl5 zgl5 : Zgl5.values())
      ZF.put(Byte.valueOf(zgl5.typeIndex), zgl5); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgqu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */