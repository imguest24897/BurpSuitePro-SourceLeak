package burp;

import java.util.HashMap;
import java.util.Map;

public class Zeom {
  private final Map<Integer, Integer> Zt = new HashMap<>();
  
  public int Zt(int paramInt) {
    return ((Integer)this.Zt.getOrDefault(Integer.valueOf(paramInt), Integer.valueOf(0))).intValue();
  }
  
  public void Zq(int paramInt1, int paramInt2) {
    this.Zt.put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeom.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */