package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Zz3p {
  private static Map<String, String> Zk(Ztlj paramZtlj) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Long> iterator = paramZtlj.Zy().iterator();
    Zbqc[] arrayOfZbqc = Zl7o.Zx();
    while (iterator.hasNext()) {
      Long long_ = iterator.next();
      hashMap.put(Long.toString(long_.longValue()), paramZtlj.ZJ(Ztz3.Zd(long_)));
      if (arrayOfZbqc == null)
        break; 
    } 
    return (Map)hashMap;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz3p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */