package burp;

import java.util.HashMap;
import java.util.Map;

class Zblz {
  private static final Zm7p ZX = new Zg11();
  
  private Map<String, Zm7p> ZK = new HashMap<>();
  
  public Zm7p ZO(String paramString) {
    paramString = paramString.toLowerCase();
    return this.ZK.containsKey(paramString) ? this.ZK.get(paramString) : ZX;
  }
  
  public void ZL(String paramString, Zm7p paramZm7p) {
    this.ZK.put(paramString, paramZm7p);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zblz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */