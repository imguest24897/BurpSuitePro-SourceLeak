package burp;

import java.util.HashMap;
import java.util.Map;

class Ztor {
  private final Map<Integer, Integer> Za = new HashMap<>();
  
  int Zh(int paramInt) {
    return ((Integer)this.Za.get(Integer.valueOf(paramInt))).intValue();
  }
  
  private void Zg(int paramInt1, int paramInt2) {
    this.Za.put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */