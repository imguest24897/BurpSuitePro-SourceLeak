package burp;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

public class Zx67<T> extends AbstractMap<T, Object> {
  protected final ConcurrentMap<T, Object> Zw = new ConcurrentHashMap<>();
  
  public Object put(T paramT, Object paramObject) {
    return this.Zw.put(paramT, paramObject);
  }
  
  public Object remove(Object paramObject) {
    return this.Zw.remove(paramObject);
  }
  
  public void clear() {
    this.Zw.clear();
  }
  
  public Collection<Object> values() {
    return this.Zw.values();
  }
  
  public Set<Map.Entry<T, Object>> entrySet() {
    return this.Zw.entrySet();
  }
  
  public Object computeIfAbsent(T paramT, Function<? super T, ?> paramFunction) {
    return this.Zw.computeIfAbsent(paramT, paramFunction);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx67.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */