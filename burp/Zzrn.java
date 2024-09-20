package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zzrn implements Zgtz {
  public List<Zb3t> ZO(List<Zb3t> paramList) {
    ArrayList<Zb3t> arrayList = new ArrayList();
    Iterator<Zb3t> iterator = paramList.iterator();
    arrayList.add(iterator.next());
    int i = Zggr.Zz();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      if (zb3t.Zk())
        arrayList.add(zb3t); 
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzrn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */