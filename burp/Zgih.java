package burp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zgih extends Zgiq {
  public Iterator<Map.Entry<Zro0, List<Zmaj>>> iterator() {
    boolean bool = Zd();
    return bool ? (new HashMap<>()).entrySet().iterator() : super.iterator();
  }
  
  private boolean Zd() {
    Collection<Map<Zlp9, List<Zmaj>>> collection = this.Zi.values();
    if (collection.isEmpty())
      return false; 
    Map map = collection.iterator().next();
    return map.containsKey(Zlp9.COLLABORATOR_EVERYWHERE_X_SCRAPED_PAYLOAD);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgih.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */