package burp;

import java.util.Iterator;
import java.util.List;

public class Zxfm {
  static boolean ZN(Zmfv paramZmfv, Object paramObject) {
    if (!(paramObject instanceof List))
      return false; 
    List list = (List)paramObject;
    if (list.size() != paramZmfv.size())
      return false; 
    Iterator<Boolean> iterator = paramZmfv.iterator();
    Iterator iterator1 = list.iterator();
    while (iterator.hasNext()) {
      if (!((Boolean)iterator.next()).equals(iterator1.next()))
        return false; 
    } 
    return true;
  }
  
  static int Zg(Zmfv paramZmfv) {
    int j = 1;
    Iterator<Boolean> iterator = paramZmfv.iterator();
    int i = Zri6.ZU();
    while (iterator.hasNext()) {
      Boolean bool = iterator.next();
      j = 31 * j + ((bool == null) ? 0 : bool.hashCode());
      if (i != 0)
        break; 
    } 
    return j;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxfm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */