package burp;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ze0_ implements Iterable<Zm6i> {
  private final Map<Zm6i, Zg8y> Zl;
  
  private static int[] Zw;
  
  private Ze0_(Map<Zm6i, Zg8y> paramMap) {
    this.Zl = paramMap;
  }
  
  public static Ze0_ ZW(List<Zg8y> paramList) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Iterator<Zg8y> iterator = paramList.iterator();
    int[] arrayOfInt = Zq();
    while (iterator.hasNext()) {
      Zg8y zg8y = iterator.next();
      if (!zg8y.ZM().Ze())
        linkedHashMap.put(zg8y.Zw(), zg8y); 
      if (arrayOfInt == null)
        break; 
    } 
    return new Ze0_((Map)linkedHashMap);
  }
  
  public Zg8y ZA(Zm6i paramZm6i) {
    return this.Zl.get(paramZm6i);
  }
  
  public Iterator<Zm6i> iterator() {
    return this.Zl.keySet().iterator();
  }
  
  public static void Zk(int[] paramArrayOfint) {
    Zw = paramArrayOfint;
  }
  
  public static int[] Zq() {
    return Zw;
  }
  
  static {
    if (Zq() == null)
      Zk(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze0_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */