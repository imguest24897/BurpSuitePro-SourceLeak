package burp;

import java.util.Iterator;

class Zbp4 {
  static boolean ZL(Zrvk paramZrvk, Object paramObject) {
    if (!(paramObject instanceof Zrvk))
      return false; 
    Zrvk zrvk = (Zrvk)paramObject;
    if (zrvk.size() != paramZrvk.size())
      return false; 
    Iterator<Zbq_> iterator1 = paramZrvk.iterator();
    Iterator<Zbq_> iterator2 = zrvk.iterator();
    while (iterator1.hasNext()) {
      if (!((Zbq_)iterator1.next()).equals(iterator2.next()))
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbp4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */