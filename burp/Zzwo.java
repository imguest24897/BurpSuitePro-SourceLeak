package burp;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

public interface Zzwo<K extends Zgpi, V extends Zgpi> extends Zg35<Zzwo<K, V>> {
  int Zl3();
  
  boolean Zl6();
  
  boolean ZB(Object paramObject);
  
  V Zd(Object paramObject);
  
  V Zu(K paramK, V paramV);
  
  V ZM(Object paramObject);
  
  void Zly();
  
  Set<K> ZlW();
  
  Collection<V> ZlZ();
  
  default V Zt(K paramK, Function<? super K, ? extends V> paramFunction) {
    Objects.requireNonNull(paramFunction);
    V v;
    Zgpi zgpi;
    if ((v = Zd(paramK)) == null && (zgpi = (Zgpi)paramFunction.apply(paramK)) != null) {
      Zu(paramK, (V)zgpi);
      return (V)zgpi;
    } 
    return v;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzwo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */