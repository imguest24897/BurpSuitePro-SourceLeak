package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zm7h {
  private final Map<Zxs7, List<Ztbx>> Zq = new HashMap<>();
  
  private final Map<Zxs7, List<Byte>> Zc = new HashMap<>();
  
  public void ZG(byte paramByte, Ztbx paramZtbx) {
    List<Byte> list = this.Zc.computeIfAbsent(paramZtbx.Zl, Zm7h::lambda$add$0);
    if (!list.contains(Byte.valueOf(paramByte))) {
      list.add(Byte.valueOf(paramByte));
      ((List<Ztbx>)this.Zq.computeIfAbsent(paramZtbx.Zl, Zm7h::lambda$add$0)).add(paramZtbx);
    } 
  }
  
  public Collection<Ztbx> Zz(Zxs7 paramZxs7) {
    return this.Zq.getOrDefault(paramZxs7, Collections.emptyList());
  }
  
  private static List lambda$add$0(Zxs7 paramZxs7) {
    return new ArrayList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm7h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */