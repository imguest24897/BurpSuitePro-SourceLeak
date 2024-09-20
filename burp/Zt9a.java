package burp;

import java.util.Iterator;
import java.util.List;

public class Zt9a {
  static boolean ZZ(Zg06 paramZg06, Object paramObject) {
    if (!(paramObject instanceof List))
      return false; 
    List list = (List)paramObject;
    if (list.size() != paramZg06.size())
      return false; 
    Iterator<Short> iterator = paramZg06.iterator();
    Iterator iterator1 = list.iterator();
    while (iterator.hasNext()) {
      if (!((Short)iterator.next()).equals(iterator1.next()))
        return false; 
    } 
    return true;
  }
  
  public static int Zt(Zg06 paramZg06) {
    int i = 1;
    Iterator<Short> iterator = paramZg06.iterator();
    boolean bool = Zx8z.ZS();
    while (iterator.hasNext()) {
      Short short_ = iterator.next();
      i = 31 * i + ((short_ == null) ? 0 : short_.hashCode());
      if (bool)
        break; 
    } 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt9a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */