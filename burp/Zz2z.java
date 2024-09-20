package burp;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.Zto;

public class Zz2z implements Zmf7 {
  private final int Za;
  
  Zz2z(int paramInt) {
    this.Za = paramInt;
  }
  
  public boolean ZC(Zxs7 paramZxs7) {
    return paramZxs7 instanceof Zlh;
  }
  
  public Optional<Zxs7> Ze(Zto<String, Zro0> paramZto, Zxs7 paramZxs7, Map<Zto<String, Zro0>, Zxs7> paramMap) {
    if (paramMap.size() == this.Za) {
      List<Zxs7> list = (List)paramMap.values().stream().filter(Zz2z::lambda$matches$0).map(Zz2z::lambda$matches$1).filter(paramZxs7::lambda$matches$2).collect(Collectors.toList());
      if (!list.isEmpty())
        return Optional.of(list.get(0)); 
    } 
    return Optional.empty();
  }
  
  private static boolean lambda$matches$2(Zxs7 paramZxs7, Zlh paramZlh) {
    return (paramZlh.ZV() == ((Zlh)paramZxs7).ZV());
  }
  
  private static Zlh lambda$matches$1(Zxs7 paramZxs7) {
    return (Zlh)paramZxs7;
  }
  
  private static boolean lambda$matches$0(Zxs7 paramZxs7) {
    return paramZxs7 instanceof Zlh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz2z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */