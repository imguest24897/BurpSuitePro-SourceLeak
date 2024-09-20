package burp;

import java.util.HashMap;
import java.util.Map;

class Zlxe {
  private static final Map<Integer, Zzu2> Zf = new HashMap<>();
  
  static Zvs Z_(int paramInt) {
    return Zf.get(Integer.valueOf(paramInt));
  }
  
  static {
    Zf.put(Integer.valueOf(269484288), Zzu2.TLS_CERTIFICATE);
    Zf.put(Integer.valueOf(1053696), Zzu2.PATH_RELATIVE_STYLESHEET_IMPORT);
    for (Zzu2 zzu2 : Zzu2.values())
      Zf.put(Integer.valueOf(zzu2.ZS()), zzu2); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlxe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */