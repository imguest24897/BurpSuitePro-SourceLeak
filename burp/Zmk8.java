package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zmk8 implements Zgtz {
  public List<Zb3t> ZO(List<Zb3t> paramList) {
    Iterator<Zb3t> iterator = paramList.iterator();
    Zb3t zb3t = iterator.next();
    int i = Zggr.ZB();
    while (iterator.hasNext()) {
      ((Zb3t)iterator.next()).ZN(zb3t);
      if (i == 0)
        break; 
    } 
    ArrayList<Zb3t> arrayList = new ArrayList(1);
    arrayList.add(zb3t);
    if (Zbqc.Zwu() == null)
      Zggr.ZK(++i); 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmk8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */