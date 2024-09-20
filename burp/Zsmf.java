package burp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Zsmf {
  private final Map<Zeu9, Set<Zszw>> Zf;
  
  Zsmf(Collection<Zt5r> paramCollection) {
    this.Zf = (Map<Zeu9, Set<Zszw>>)paramCollection.stream().map(Zt5r::ZL).collect(Collectors.groupingBy(Zt8i::Zsu, Collectors.mapping(Zt8i::ZsU, Collectors.toSet())));
  }
  
  public Set<Zszw> Zn(Zt5r paramZt5r) {
    Zt8i zt8i = paramZt5r.ZL();
    HashSet<Zszw> hashSet = new HashSet(this.Zf.get(zt8i.Zsu()));
    hashSet.remove(zt8i.ZsU());
    return hashSet;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsmf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */