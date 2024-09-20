package burp;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

public interface Zt7v<V extends Zgpi> extends Zg35<Zt7v<V>> {
  int Zx1();
  
  boolean ZR(long paramLong);
  
  V ZJ(long paramLong);
  
  V ZI(long paramLong, V paramV);
  
  V ZD(long paramLong);
  
  void Zx0();
  
  Set<Long> ZP4();
  
  Collection<V> ZPN();
  
  default V Ze(long paramLong, Function<Long, ? extends V> paramFunction) {
    Objects.requireNonNull(paramFunction);
    V v;
    Zgpi zgpi;
    if ((v = ZJ(paramLong)) == null && (zgpi = (Zgpi)paramFunction.apply(Long.valueOf(paramLong))) != null) {
      ZI(paramLong, (V)zgpi);
      return (V)zgpi;
    } 
    return v;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */