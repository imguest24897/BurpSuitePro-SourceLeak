package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

class Zlac {
  private final Map<Class<?>, Object> ZF;
  
  private final Zgzs ZN;
  
  Zlac(Zgzs paramZgzs) {
    this.ZN = paramZgzs;
    this.ZF = new ConcurrentHashMap<>();
  }
  
  void ZW(Object paramObject) {
    this.ZF.put(paramObject.getClass(), paramObject);
  }
  
  List<?> Zd(Zmt5<?> paramZmt5) {
    if (!paramZmt5.Ze())
      return Collections.emptyList(); 
    Class<?> clazz = paramZmt5.ZZ();
    List<Class<?>> list = this.ZN.ZF(clazz, this.ZF.keySet());
    Objects.requireNonNull(this.ZF);
    return list.stream().map(this.ZF::get).filter(Objects::nonNull).toList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlac.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */