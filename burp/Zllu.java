package burp;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.Zto;

public class Zllu implements Zmf7 {
  private final int ZE;
  
  Zllu(int paramInt) {
    this.ZE = paramInt;
  }
  
  public boolean ZC(Zxs7 paramZxs7) {
    return paramZxs7 instanceof Zlh;
  }
  
  public Optional<Zxs7> Ze(Zto<String, Zro0> paramZto, Zxs7 paramZxs7, Map<Zto<String, Zro0>, Zxs7> paramMap) {
    if (paramMap.size() == this.ZE) {
      List<Zxs7> list = (List)paramMap.values().stream().filter(Zllu::lambda$matches$0).map(Zllu::lambda$matches$1).filter(paramZxs7::lambda$matches$2).collect(Collectors.toList());
      if (!list.isEmpty())
        return Optional.of(list.get(0)); 
    } 
    return Optional.empty();
  }
  
  private static boolean lambda$matches$2(Zxs7 paramZxs7, Zlh paramZlh) {
    return (paramZlh.ZP() == paramZxs7.ZP() && paramZlh.ZV() == ((Zlh)paramZxs7).ZV());
  }
  
  private static Zlh lambda$matches$1(Zxs7 paramZxs7) {
    return (Zlh)paramZxs7;
  }
  
  private static boolean lambda$matches$0(Zxs7 paramZxs7) {
    return paramZxs7 instanceof Zlh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zllu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */