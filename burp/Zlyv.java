package burp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.portswigger.Zrzt;

public abstract class Zlyv implements Zm80 {
  private final Map<String, Set<Zkdd>> Zc = new HashMap<>();
  
  private static boolean ZV;
  
  public String ZC(Zku6 paramZku6, Zkv8 paramZkv8) {
    boolean bool = Zj();
    if (paramZkv8 instanceof Zg5y) {
      Zg5y zg5y = (Zg5y)paramZkv8;
      if (this.Zc.containsKey(zg5y.Zl))
        for (Zkdd zkdd : this.Zc.get(zg5y.Zl)) {
          if (zkdd.ZP(zg5y))
            return Zrzt.Zn(zg5y.ZK).toLowerCase(); 
          if (!bool)
            break; 
        }  
    } 
    return null;
  }
  
  public void Zc(String paramString, Zmzk paramZmzk, Zxs7 paramZxs7, Zgit paramZgit, Zz4_ paramZz4_) {
    Zzmd.Zz(paramString, paramZmzk, paramZxs7, paramZgit, paramZz4_);
  }
  
  public void ZF(String paramString, Zkdd paramZkdd) {
    Set<Zkdd> set = this.Zc.get(paramString);
    if (set == null) {
      set = new HashSet();
      this.Zc.put(paramString, set);
    } 
    set.add(paramZkdd);
  }
  
  public static void ZM(boolean paramBoolean) {
    ZV = paramBoolean;
  }
  
  public static boolean Zj() {
    return ZV;
  }
  
  public static boolean ZA() {
    boolean bool = Zj();
    return !bool;
  }
  
  static {
    if (ZA())
      ZM(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlyv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */