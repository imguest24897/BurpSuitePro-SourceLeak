package burp;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zld6 implements Zmdl {
  private static final EnumSet<Zb25> Zk = EnumSet.of(Zb25.DNS, Zb25.HTTP, Zb25.HTTPS);
  
  private static final EnumSet<Zlp9> Zi = EnumSet.noneOf(Zlp9.class);
  
  private final EnumSet<Zb25> Zf;
  
  private final EnumSet<Zlp9> Zq;
  
  private final List<Zmaj> Zg = new ArrayList<>();
  
  public Zld6() {
    this(Zk, Zi);
  }
  
  public Zld6(EnumSet<Zb25> paramEnumSet, EnumSet<Zlp9> paramEnumSet1) {
    this.Zf = paramEnumSet;
    this.Zq = paramEnumSet1;
  }
  
  public Iterator<Map.Entry<Zro0, List<Zmaj>>> iterator() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Zmaj> iterator = this.Zg.iterator();
    String[] arrayOfString = Zgi2.ZD();
    while (iterator.hasNext()) {
      Zmaj zmaj = iterator.next();
      if (this.Zq.contains(zmaj.Zy.ZN()))
        continue; 
      Zro0 zro0 = zmaj.Zy.Zk();
      ((List<Zmaj>)hashMap.computeIfAbsent(zro0, Zld6::lambda$iterator$0)).add(zmaj);
      if (arrayOfString != null)
        break; 
    } 
    return hashMap.entrySet().iterator();
  }
  
  public void Zr(Zmaj paramZmaj) {
    Zb25 zb25 = paramZmaj.ZO.ZA();
    if (this.Zf.contains(zb25))
      this.Zg.add(paramZmaj); 
  }
  
  private static List lambda$iterator$0(Zro0 paramZro0) {
    return new ArrayList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zld6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */