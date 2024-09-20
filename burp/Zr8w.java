package burp;

import java.util.Iterator;

public class Zr8w {
  static boolean Za(Zkc3 paramZkc3, Object paramObject) {
    if (!(paramObject instanceof Zkc3))
      return false; 
    Zkc3 zkc3 = (Zkc3)paramObject;
    if (zkc3.size() != paramZkc3.size())
      return false; 
    Iterator<Ztp0> iterator1 = paramZkc3.iterator();
    Iterator<Ztp0> iterator2 = zkc3.iterator();
    while (iterator1.hasNext()) {
      if (!((Ztp0)iterator1.next()).equals(iterator2.next()))
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr8w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */