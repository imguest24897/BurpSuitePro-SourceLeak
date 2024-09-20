package burp;

import java.util.Iterator;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zegz {
  static boolean Zi(Zlp9 paramZlp91, Zlp9 paramZlp92, List<Zlp9> paramList) {
    if (!Zlp9.Za(paramList, paramZlp91) || !Zlp9.Za(paramList, paramZlp92)) {
      Zuh.Zb(false, Zqf.Zk);
      return false;
    } 
    return (Zi(paramList, paramZlp91) > Zi(paramList, paramZlp92));
  }
  
  static int Zi(List<Zlp9> paramList, Zlp9 paramZlp9) {
    byte b = -1;
    Iterator<Zlp9> iterator = paramList.iterator();
    String[] arrayOfString = Zgi2.ZD();
    while (iterator.hasNext()) {
      Zlp9 zlp9 = iterator.next();
      b++;
      if (zlp9 == paramZlp9)
        return b; 
      if (arrayOfString != null)
        break; 
    } 
    return b;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zegz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */