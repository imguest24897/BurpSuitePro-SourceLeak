package burp;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zgiq extends Zgi2 {
  public Iterator<Map.Entry<Zro0, List<Zmaj>>> iterator() {
    ArrayList<Map.Entry<Zro0, List<Zmaj>>> arrayList = new ArrayList();
    Iterator<Map> iterator = this.Zi.values().iterator();
    String[] arrayOfString = Zgi2.ZD();
    while (iterator.hasNext()) {
      Map map = iterator.next();
      for (List list : map.values()) {
        arrayList.add(new AbstractMap.SimpleEntry<>(null, list));
        if (arrayOfString != null)
          break; 
      } 
      if (arrayOfString != null)
        break; 
    } 
    return arrayList.iterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgiq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */