package burp;

import java.util.Iterator;

public class Zrdf {
  static boolean Zq(Zm0z paramZm0z, Object paramObject) {
    if (!(paramObject instanceof Zm0z))
      return false; 
    Zm0z zm0z = (Zm0z)paramObject;
    if (zm0z.size() != paramZm0z.size())
      return false; 
    Iterator<Zgn1> iterator1 = paramZm0z.iterator();
    Iterator<Zgn1> iterator2 = zm0z.iterator();
    while (iterator1.hasNext()) {
      if (!((Zgn1)iterator1.next()).equals(iterator2.next()))
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrdf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */