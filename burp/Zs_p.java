package burp;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.Zto;

public class Zs_p implements Zmf7 {
  private final int ZN;
  
  Zs_p(int paramInt) {
    this.ZN = paramInt;
  }
  
  public boolean ZC(Zxs7 paramZxs7) {
    return !(paramZxs7 instanceof Zlh);
  }
  
  public Optional<Zxs7> Ze(Zto<String, Zro0> paramZto, Zxs7 paramZxs7, Map<Zto<String, Zro0>, Zxs7> paramMap) {
    if (paramMap.size() == this.ZN) {
      List<Zxs7> list = (List)paramMap.values().stream().filter(Zs_p::lambda$matches$0).filter(paramZxs7::lambda$matches$1).collect(Collectors.toList());
      if (!list.isEmpty())
        return Optional.of(list.get(0)); 
    } 
    return Optional.empty();
  }
  
  private static boolean lambda$matches$1(Zxs7 paramZxs71, Zxs7 paramZxs72) {
    return (paramZxs72.ZP() == paramZxs71.ZP());
  }
  
  private static boolean lambda$matches$0(Zxs7 paramZxs7) {
    return !(paramZxs7 instanceof Zlh);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */