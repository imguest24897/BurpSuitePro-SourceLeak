package burp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ztg_ {
  private final Map<String, Set<Zer0>> Zo = new HashMap<>(10000);
  
  private static boolean ZR;
  
  Set<Zer0> Za(String paramString) {
    return this.Zo.remove(paramString);
  }
  
  void ZJ(Zer0 paramZer0) {
    Set set = this.Zo.get(paramZer0.Zv());
    if (paramZer0.ZA() != Zb25.DNS && set != null)
      set.remove(paramZer0); 
    if (this.Zo.get(paramZer0.Zv()) != null && ((Set)this.Zo.get(paramZer0.Zv())).isEmpty())
      this.Zo.remove(paramZer0.Zv()); 
  }
  
  void ZX(Zer0 paramZer0) {
    if (paramZer0.ZA() == Zb25.DNS)
      return; 
    Set<Zer0> set = this.Zo.computeIfAbsent(paramZer0.Zv(), Ztg_::lambda$updateClientInteractionsMap$0);
    set.add(paramZer0);
  }
  
  public Set<String> ZO() {
    return new HashSet<>(this.Zo.keySet());
  }
  
  public Set<Zer0> Zd(String paramString) {
    return this.Zo.get(paramString);
  }
  
  public int ZJ() {
    return this.Zo.size();
  }
  
  private static Set lambda$updateClientInteractionsMap$0(String paramString) {
    return new HashSet();
  }
  
  public static void ZP(boolean paramBoolean) {
    ZR = paramBoolean;
  }
  
  public static boolean Z_() {
    return ZR;
  }
  
  public static boolean ZK() {
    boolean bool = Z_();
    return !bool;
  }
  
  static {
    if (!Z_())
      ZP(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztg_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */