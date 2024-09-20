package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Zmx7 {
  private final List<Map<Integer, Integer>> Zw = new ArrayList<>();
  
  public void Zj(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool = Zm23.Zt();
    while (this.Zw.size() <= paramInt2) {
      this.Zw.add(new HashMap<>());
      if (bool)
        break; 
    } 
    ((Map<Integer, Integer>)this.Zw.get(paramInt2)).put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt3));
  }
  
  public int Ze(int paramInt) {
    return ((Integer)this.Zw.stream().map(paramInt::lambda$maxRowHeight$0).filter(Objects::nonNull).reduce(Math::max).orElse(Integer.valueOf(0))).intValue();
  }
  
  private static Integer lambda$maxRowHeight$0(int paramInt, Map paramMap) {
    return (Integer)paramMap.get(Integer.valueOf(paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmx7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */