package burp;

import java.util.Iterator;

public class Zeq_ {
  static boolean ZS(Ztrr paramZtrr, Object paramObject) {
    if (!(paramObject instanceof Ztrr))
      return false; 
    Ztrr ztrr = (Ztrr)paramObject;
    if (ztrr.size() != paramZtrr.size())
      return false; 
    Iterator<Zlva> iterator1 = paramZtrr.iterator();
    Iterator<Zlva> iterator2 = ztrr.iterator();
    while (iterator1.hasNext()) {
      if (!((Zlva)iterator1.next()).equals(iterator2.next()))
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeq_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */