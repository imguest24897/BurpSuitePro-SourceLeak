package burp;

import java.util.Iterator;

public class Zbnw {
  static boolean ZU(Zif paramZif, Object paramObject) {
    if (!(paramObject instanceof Zif))
      return false; 
    Zif zif = (Zif)paramObject;
    if (zif.size() != paramZif.size())
      return false; 
    Iterator<Zgl_> iterator1 = paramZif.iterator();
    Iterator<Zgl_> iterator2 = zif.iterator();
    while (iterator1.hasNext()) {
      if (!((Zgl_)iterator1.next()).equals(iterator2.next()))
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbnw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */