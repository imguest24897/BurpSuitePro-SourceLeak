package burp;

import java.util.List;
import java.util.function.Predicate;

public class Zsn {
  private final List<Zrdb> Zg;
  
  public Zsn(List<Zrdb> paramList) {
    this.Zg = paramList;
  }
  
  public void ZZ(Predicate<Zez3> paramPredicate, Zez3 paramZez3) {
    Zl99 zl99 = new Zl99(this, paramPredicate);
    paramZez3.ZK(zl99);
    if (paramPredicate == null || paramPredicate.test(paramZez3))
      Zb(paramZez3); 
  }
  
  private void Zb(Zez3 paramZez3) {
    Zbfs zbfs = (new Zt2z(paramZez3)).Zf();
    if (zbfs != null) {
      Zefg<Zrdb> zefg = zbfs.ZRn();
      this.Zg.addAll(zefg);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */