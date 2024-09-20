package burp;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class Zso3 {
  Map<String, Set<Zer0>> ZV = new ConcurrentHashMap<>(10000);
  
  public Map<String, Set<Zer0>> Zh() {
    return this.ZV;
  }
  
  public void ZZ(Zer0 paramZer0) {
    if (this.ZV.get(paramZer0.ZQ()) != null) {
      boolean bool = ((Set)this.ZV.get(paramZer0.ZQ())).remove(paramZer0);
      if (bool && ((Set)this.ZV.get(paramZer0.ZQ())).isEmpty())
        this.ZV.remove(paramZer0.ZQ()); 
    } 
  }
  
  public Set<Zer0> Zf(String paramString) {
    return this.ZV.remove(paramString);
  }
  
  void ZX(String paramString, Zer0 paramZer0) {
    Set<Zer0> set = this.ZV.get(paramString);
    if (set == null) {
      set = new HashSet();
      this.ZV.put(paramString, set);
    } 
    set.add(paramZer0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zso3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */