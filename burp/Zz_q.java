package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Zz_q {
  private final Collection<Zeqc> Zd = new ConcurrentLinkedQueue<>();
  
  private final Map<Ztu8, Zgfi> ZU = Collections.synchronizedMap(new IdentityHashMap<>());
  
  private static boolean ZE;
  
  public Collection<Zeqc> ZM() {
    return this.Zd;
  }
  
  public void Zo(Zeqc paramZeqc, Zgfi paramZgfi) {
    if (paramZgfi != null) {
      this.ZU.put(paramZeqc.ZV, paramZgfi);
      this.Zd.remove(paramZeqc);
    } 
  }
  
  public void ZN(Collection<Zeqc> paramCollection) {
    this.Zd.addAll(paramCollection);
  }
  
  public boolean Zr(Ztu8 paramZtu8) {
    return this.ZU.containsKey(paramZtu8);
  }
  
  Zgfi Zf(Ztu8 paramZtu8) {
    return this.ZU.get(paramZtu8);
  }
  
  public static void ZG(boolean paramBoolean) {
    ZE = paramBoolean;
  }
  
  public static boolean ZB() {
    return ZE;
  }
  
  public static boolean Za() {
    boolean bool = ZB();
    return !bool;
  }
  
  static {
    if (!Za())
      ZG(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */