package burp;

import java.util.Iterator;
import java.util.List;

public class Zg44 implements Iterable<Zxs7> {
  private final List<Zxs7> Zq;
  
  Zg44(List<Zxs7> paramList) {
    this.Zq = paramList;
  }
  
  public Zxs7 Zt(Zro0 paramZro0) {
    Zxs7 zxs7 = null;
    Iterator<Zxs7> iterator = this.Zq.iterator();
    String str = Ze3n.Zy();
    while (iterator.hasNext()) {
      Zxs7 zxs71 = iterator.next();
      if (zxs71.Zl().equals(paramZro0))
        zxs7 = zxs71; 
      if (str == null)
        break; 
    } 
    return zxs7;
  }
  
  public Iterator<Zxs7> iterator() {
    return this.Zq.iterator();
  }
  
  public Zxs7 Zo() {
    String str = Ze3n.Zy();
    for (Zxs7 zxs7 : this.Zq) {
      if (zxs7.Z_().equals(Zs66.ENTIRE_BODY))
        return zxs7; 
      if (str == null)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg44.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */