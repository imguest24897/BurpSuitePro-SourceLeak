package burp;

import java.util.Iterator;
import java.util.List;

public class Ze4l {
  static boolean Ze(Zxsn paramZxsn, Object paramObject) {
    if (!(paramObject instanceof List))
      return false; 
    List list = (List)paramObject;
    if (list.size() != paramZxsn.size())
      return false; 
    Iterator<Long> iterator = paramZxsn.iterator();
    Iterator iterator1 = list.iterator();
    while (iterator.hasNext()) {
      if (!((Long)iterator.next()).equals(iterator1.next()))
        return false; 
    } 
    return true;
  }
  
  public static int Za(Zxsn paramZxsn) {
    int j = 1;
    int i = Zsif.ZP();
    for (Long long_ : paramZxsn) {
      j = 31 * j + ((long_ == null) ? 0 : long_.hashCode());
      if (i != 0)
        break; 
    } 
    return j;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze4l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */