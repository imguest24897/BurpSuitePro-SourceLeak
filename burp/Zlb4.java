package burp;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Zlb4 {
  private final Map<Ztbx, Zlc0> Zc = new IdentityHashMap<>();
  
  public void Zt(Ztbx paramZtbx, Zlc0 paramZlc0) {
    this.Zc.put(paramZtbx, paramZlc0);
  }
  
  Zlc0 ZC(Ztbx paramZtbx) {
    return this.Zc.get(paramZtbx);
  }
  
  Set<Zvs> Zh() {
    return (Set<Zvs>)this.Zc.values().stream().map(Zlc0::Z_).flatMap(Collection::stream).collect(Collectors.toSet());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlb4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */