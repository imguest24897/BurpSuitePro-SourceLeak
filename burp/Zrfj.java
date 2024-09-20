package burp;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Zrfj {
  private final Map<Zrwf, Zm4g> ZL = new LinkedHashMap<>();
  
  private final Map<Zrwf, Zm4g> ZZ = new LinkedHashMap<>();
  
  private boolean Zi = false;
  
  public void Zi(Zm4g paramZm4g) {
    int[] arrayOfInt = Zz6s.Zp();
    if (paramZm4g != null) {
      if (paramZm4g.ZA()) {
        this.ZZ.putIfAbsent(paramZm4g.ZG(), paramZm4g);
        if (arrayOfInt == null) {
          this.Zi = true;
          this.ZL.putIfAbsent(paramZm4g.ZG(), paramZm4g);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    this.Zi = true;
    this.ZL.putIfAbsent(paramZm4g.ZG(), paramZm4g);
  }
  
  int Zv() {
    int i = 0;
    Iterator<Zm4g> iterator = this.ZL.values().iterator();
    int[] arrayOfInt = Zz6s.Zp();
    while (iterator.hasNext()) {
      Zm4g zm4g = iterator.next();
      i |= zm4g.ZR();
      if (arrayOfInt == null)
        break; 
    } 
    return i;
  }
  
  boolean Zs() {
    return this.Zi;
  }
  
  void ZM(Zz4_ paramZz4_) {
    this.ZZ.values().forEach(paramZz4_::lambda$reportIssues$0);
    ZZ(this.ZL.values(), paramZz4_);
  }
  
  private static void ZZ(Collection<Zm4g> paramCollection, Zz4_ paramZz4_) {
    int[] arrayOfInt = Zz6s.Zp();
    Zm4g zm4g = Zc(paramCollection);
    if (zm4g == null)
      return; 
    Zx_5 zx_5 = zm4g.Zx();
    for (Zm4g zm4g1 : paramCollection) {
      if (zm4g1 != zm4g)
        zx_5.ZM(zm4g1.Zx()); 
      if (arrayOfInt == null)
        break; 
    } 
    paramZz4_.Zz(zx_5);
  }
  
  private static Zm4g Zc(Collection<Zm4g> paramCollection) {
    Zm4g zm4g = null;
    Iterator<Zm4g> iterator = paramCollection.iterator();
    int[] arrayOfInt = Zz6s.Zp();
    while (iterator.hasNext()) {
      Zm4g zm4g1 = iterator.next();
      if (zm4g == null || zm4g1.ZU() > zm4g.ZU())
        zm4g = zm4g1; 
      if (arrayOfInt == null)
        break; 
    } 
    return zm4g;
  }
  
  private static void lambda$reportIssues$0(Zz4_ paramZz4_, Zm4g paramZm4g) {
    paramZz4_.Zz(paramZm4g.Zx());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrfj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */