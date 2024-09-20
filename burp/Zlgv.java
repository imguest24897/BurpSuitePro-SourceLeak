package burp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

class Zlgv {
  static void Zz(Zt8i paramZt8i, Zzwo<Zlru, Zefg<Zt8i>> paramZzwo, Zr_4 paramZr_4, Zmv7 paramZmv7) {
    int i = Zx18.ZiZ();
    Zefg<Zt8i> zefg = paramZzwo.Zt(paramZt8i.ZsD(), paramZr_4::lambda$add$0);
    byte b1 = (paramZt8i.Zsu() instanceof Zxtr) ? 2 : 1;
    byte b2 = 0;
    while (b2 < b1) {
      if (zefg.size() >= 5) {
        Zt8i zt8i = zefg.remove(0);
        paramZmv7.Zy(Zrp6.TRACE, Zlq7.REMOVING_DESTINATION, new Object[] { zt8i.Zsu() });
      } 
      zefg.add(paramZt8i);
      b2++;
      if (i == 0)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zx18.ZP(++i); 
  }
  
  static void ZG(Zt8i paramZt8i, Zzwo<Zlru, Zefg<Zt8i>> paramZzwo) {
    Zefg zefg = paramZzwo.Zd(paramZt8i.ZsD());
    if (zefg != null)
      zefg.removeIf(paramZt8i::lambda$remove$1); 
  }
  
  static Collection<Zt8i> Zk(Zzwo<Zlru, Zefg<Zt8i>> paramZzwo) {
    LinkedList<Zt8i> linkedList = new LinkedList();
    Iterator<Zefg> iterator = paramZzwo.ZlZ().iterator();
    int i = Zx18.ZiZ();
    while (iterator.hasNext()) {
      Zefg zefg = iterator.next();
      HashSet<Zeu9> hashSet = new HashSet();
      for (Zt8i zt8i : zefg) {
        if (hashSet.add(zt8i.Zsu()))
          linkedList.add(zt8i); 
        if (i == 0)
          break; 
      } 
      if (i == 0)
        break; 
    } 
    return linkedList;
  }
  
  private static boolean lambda$remove$1(Zt8i paramZt8i1, Zt8i paramZt8i2) {
    return Objects.equals(paramZt8i2.Zsu(), paramZt8i1.Zsu());
  }
  
  private static Zefg lambda$add$0(Zr_4 paramZr_4, Zlru paramZlru) {
    return (Zefg)paramZr_4.ZH(Zk63.Zl);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlgv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */