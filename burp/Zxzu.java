package burp;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Zxzu {
  public static boolean Zp(Collection<?> paramCollection1, Collection<?> paramCollection2) {
    if (paramCollection1.size() != paramCollection2.size())
      return false; 
    Map map1 = (Map)paramCollection1.stream().collect(Collectors.toMap(Function.identity(), Zxzu::lambda$areContentsEqualInAnyOrder$0, Integer::sum));
    Map map2 = (Map)paramCollection2.stream().collect(Collectors.toMap(Function.identity(), Zxzu::lambda$areContentsEqualInAnyOrder$0, Integer::sum));
    return map1.equals(map2);
  }
  
  private static Integer lambda$areContentsEqualInAnyOrder$0(Object paramObject) {
    return Integer.valueOf(1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxzu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */