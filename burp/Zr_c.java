package burp;

import java.util.HashMap;
import java.util.Map;

class Zr_c {
  private static final Zr_c Za = new Zr_c();
  
  private final Map<Integer, Zvs> ZI = new HashMap<>();
  
  static Zvs Zy(int paramInt) {
    return Za.ZM(paramInt);
  }
  
  private Zvs ZM(int paramInt) {
    synchronized (this.ZI) {
      Zvs zvs = this.ZI.get(Integer.valueOf(paramInt));
      if (zvs == null) {
        zvs = new Zlin(paramInt);
        this.ZI.put(Integer.valueOf(paramInt), zvs);
      } 
      return zvs;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */