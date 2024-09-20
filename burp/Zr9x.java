package burp;

import java.util.Iterator;

public class Zr9x {
  static boolean ZN(Zl5f paramZl5f, Object paramObject) {
    if (!(paramObject instanceof Zl5f))
      return false; 
    Zl5f zl5f = (Zl5f)paramObject;
    if (zl5f.size() != paramZl5f.size())
      return false; 
    Iterator<Zs3e> iterator1 = paramZl5f.iterator();
    Iterator<Zs3e> iterator2 = zl5f.iterator();
    while (iterator1.hasNext()) {
      if (!((Zs3e)iterator1.next()).equals(iterator2.next()))
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr9x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */