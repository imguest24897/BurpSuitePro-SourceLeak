package burp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Ztqx {
  protected final Map<Integer, Set<Zer0>> Zi = new HashMap<>(20);
  
  public Map<Integer, Set<Zer0>> Zl() {
    return this.Zi;
  }
  
  void ZK(Zer0 paramZer0) {
    int i = Zc(paramZer0);
    if (Zx(i)) {
      Set<Zer0> set = this.Zi.get(Integer.valueOf(i));
      if (set == null) {
        set = new HashSet();
        this.Zi.put(Integer.valueOf(i), set);
      } 
      set.add(paramZer0);
    } 
  }
  
  void ZX(Zer0 paramZer0) {
    int i = Zc(paramZer0);
    if (this.Zi.get(Integer.valueOf(i)) != null)
      ((Set)this.Zi.get(Integer.valueOf(i))).remove(paramZer0); 
  }
  
  private boolean Zx(int paramInt) {
    return (paramInt > 13);
  }
  
  private int Zc(Zer0 paramZer0) {
    return (int)(Math.log(paramZer0.Zf()) / Math.log(2.0D));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztqx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */