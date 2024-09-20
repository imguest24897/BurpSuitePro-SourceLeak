package burp;

import java.util.Iterator;

public class Zx43 {
  static boolean ZY(Zsli paramZsli, Object paramObject) {
    if (!(paramObject instanceof Zsli))
      return false; 
    Zsli zsli = (Zsli)paramObject;
    if (zsli.size() != paramZsli.size())
      return false; 
    Iterator<Zrh9> iterator1 = paramZsli.iterator();
    Iterator<Zrh9> iterator2 = zsli.iterator();
    while (iterator1.hasNext()) {
      if (!((Zrh9)iterator1.next()).equals(iterator2.next()))
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx43.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */