package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Zb66 implements Iterable<String> {
  private final Map<String, List<Zesk>> ZG;
  
  Zb66(Zgvn paramZgvn) {
    List list = (List)((paramZgvn == null) ? Collections.emptyList() : paramZgvn.ZY());
    this.ZG = (list == null) ? Collections.<String, List<Zesk>>emptyMap() : (Map<String, List<Zesk>>)list.stream().collect(Collectors.groupingBy(Zesk::ZT));
  }
  
  boolean Zm() {
    return this.ZG.isEmpty();
  }
  
  List<Zesk> Zb(String paramString) {
    return this.ZG.get(paramString);
  }
  
  public Iterator<String> iterator() {
    return this.ZG.keySet().stream().sorted().toList().iterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb66.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */