package burp;

import java.util.HashMap;
import java.util.Map;

public class Zm03 {
  private final Map<Zs66, Integer> ZM = new HashMap<>();
  
  private final Map<Zs66, Integer> Zc = new HashMap<>();
  
  private final Map<Zs66, Integer> ZD = new HashMap<>();
  
  private final Map<Zs66, Integer> Zd = new HashMap<>();
  
  public void ZU(Zs66 paramZs66) {
    this.ZM.compute(paramZs66, Zm03::lambda$addIgnoredDueToLimit$0);
  }
  
  public void Zc(Zs66 paramZs66) {
    this.Zc.compute(paramZs66, Zm03::lambda$addIgnoredDueToLimit$0);
  }
  
  public void ZO(Zs66 paramZs66) {
    this.ZD.compute(paramZs66, Zm03::lambda$addIgnoredDueToLimit$0);
  }
  
  public void ZK(Zs66 paramZs66) {
    this.Zd.compute(paramZs66, Zm03::lambda$addIgnoredDueToLimit$0);
  }
  
  public int Zq() {
    return this.ZM.values().stream().mapToInt(Integer::intValue).sum();
  }
  
  public int ZE(Zs66 paramZs66) {
    return ((Integer)this.ZM.getOrDefault(paramZs66, Integer.valueOf(0))).intValue();
  }
  
  public int Zq(Zs66 paramZs66) {
    return ((Integer)this.Zc.getOrDefault(paramZs66, Integer.valueOf(0))).intValue();
  }
  
  private static Integer lambda$addIgnoredDueToLimit$0(Zs66 paramZs66, Integer paramInteger) {
    return Integer.valueOf((paramInteger == null) ? 1 : (paramInteger.intValue() + 1));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm03.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */