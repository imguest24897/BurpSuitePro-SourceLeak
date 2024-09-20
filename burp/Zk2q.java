package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zk2q extends Zk2i {
  Zk2q(Collection<Zrdb> paramCollection, Zr1x paramZr1x) {
    super(paramCollection, paramZr1x);
    HashMap<Object, Object> hashMap = new HashMap<>();
    boolean bool = Zsh9.ZX();
    Iterator<Zrdb> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      try {
        Zrdb zrdb = iterator.next();
        Zax zax = new Zax(zrdb.ZaB(), zrdb.Zax());
        List<Zrdb> list = (List)hashMap.get(zax);
        if (list == null) {
          list = new ArrayList();
          hashMap.put(zax, list);
        } 
        list.add(zrdb);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
        paramZr1x.ZV();
        if (!bool)
          break; 
      } 
    } 
    ArrayList<Comparable> arrayList = new ArrayList(hashMap.keySet());
    Collections.sort(arrayList);
    this.Zp = new ArrayList();
    Iterator<Comparable> iterator1 = arrayList.iterator();
    while (iterator1.hasNext()) {
      this.Zp.add(Zr((List)hashMap.get(iterator1.next())));
      if (!bool)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */