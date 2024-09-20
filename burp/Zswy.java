package burp;

import java.util.Iterator;

public class Zswy {
  static boolean Zl(Zmkl paramZmkl, Object paramObject) {
    if (!(paramObject instanceof Zmkl))
      return false; 
    Zmkl zmkl = (Zmkl)paramObject;
    if (zmkl.size() != paramZmkl.size())
      return false; 
    Iterator<Zzwr> iterator1 = paramZmkl.iterator();
    Iterator<Zzwr> iterator2 = zmkl.iterator();
    while (iterator1.hasNext()) {
      if (!((Zzwr)iterator1.next()).equals(iterator2.next()))
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zswy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */