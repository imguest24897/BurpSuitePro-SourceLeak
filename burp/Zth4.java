package burp;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Zth4 implements Zmwt, Zrcc {
  private final Set<String> ZJ = Collections.newSetFromMap(new ConcurrentHashMap<>());
  
  private final Set<String> Zz = Collections.newSetFromMap(new ConcurrentHashMap<>());
  
  public void ZE(String paramString) {
    this.ZJ.add(paramString);
  }
  
  public void ZX(String paramString) {
    this.Zz.add(paramString);
  }
  
  public boolean Z_(String paramString) {
    return this.ZJ.contains(paramString);
  }
  
  public boolean Zt(String paramString) {
    return this.Zz.contains(paramString);
  }
  
  public void Zz() {
    this.ZJ.clear();
    this.Zz.clear();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zth4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */