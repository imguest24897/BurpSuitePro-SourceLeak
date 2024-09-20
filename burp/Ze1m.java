package burp;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Ze1m<T> implements Zxnw<T> {
  private final Zmjx<T> ZW;
  
  private final Map<Zmk7<T>, Function<Zmk7<T>, Zs1_<T>>> Zs;
  
  private final Function<Zmk7<T>, Zs1_<T>> ZO;
  
  public Ze1m(Zmjx<T> paramZmjx, Map<Zmk7<T>, Function<Zmk7<T>, Zs1_<T>>> paramMap) {
    this.ZW = paramZmjx;
    this.Zs = paramMap;
    this.ZO = Zt9n::new;
  }
  
  public List<Zs1_<T>> ZJ() {
    int[] arrayOfInt = Zt9n.Zn();
    if (Zbqc.Zwu() == null)
      Zt9n.Zi(new int[2]); 
    return (List<Zs1_<T>>)this.ZW.Zf().stream().filter(Predicate.not(Zmk7::ZX)).map(this::lambda$allFields$0).collect(Collectors.toCollection(java.util.ArrayList::new));
  }
  
  private Zs1_ lambda$allFields$0(Zmk7 paramZmk7) {
    return ((Function<Zmk7, Zs1_>)this.Zs.getOrDefault(paramZmk7, this.ZO)).apply(paramZmk7);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze1m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */