package burp;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Zsih implements Zxa2 {
  private final Iterator<Zrbc> ZB;
  
  private final Zbza ZH;
  
  Zsih(Zbza paramZbza, Iterable<Zrbc> paramIterable) {
    this.ZH = paramZbza;
    this.ZB = paramIterable.iterator();
  }
  
  public Zm6s<? extends Zm75> Z_() {
    Zrbc zrbc;
    synchronized (this.ZH.Zz6()) {
      zrbc = this.ZB.hasNext() ? this.ZB.next() : null;
    } 
    if (zrbc != null && this.ZH.Zg6() != 4) {
      LinkedHashSet<Zz09> linkedHashSet = new LinkedHashSet();
      linkedHashSet.addAll(zrbc.Zs());
      linkedHashSet.addAll(zrbc.Zc());
      return linkedHashSet.isEmpty() ? Z_() : Zm6s.Zc((Set)linkedHashSet);
    } 
    return Zm6s.ZG();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsih.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */