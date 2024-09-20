package burp;

import java.util.List;
import java.util.function.Predicate;

public class Zt8n {
  private final List<Zmfj> Zd;
  
  private final Zkl6 ZV;
  
  private final Zm6x ZA;
  
  public Zt8n(List<Zmfj> paramList, Zkl6 paramZkl6, Zm6x paramZm6x) {
    this.Zd = paramList;
    this.ZV = paramZkl6;
    this.ZA = paramZm6x;
  }
  
  void ZY(Predicate<Zez3> paramPredicate, Zez3 paramZez3) {
    if (paramPredicate == null || paramPredicate.test(paramZez3))
      this.Zd.add(paramZez3.Zq(this.ZV, this.ZA)); 
    Zl92 zl92 = new Zl92(this, paramPredicate);
    paramZez3.ZK(zl92);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt8n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */