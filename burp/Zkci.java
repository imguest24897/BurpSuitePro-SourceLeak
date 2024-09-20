package burp;

import java.util.HashSet;
import java.util.Set;

public class Zkci implements Zs4_ {
  private final Zroi ZC;
  
  private final Set<Zvs> Zs;
  
  public Zkci(Zroi paramZroi) {
    this.ZC = paramZroi;
    this.Zs = new HashSet<>();
  }
  
  public void Z_(Ze3n paramZe3n, Zlit paramZlit, long paramLong, Zefx paramZefx, Zb6q paramZb6q, Zswz paramZswz, Zsw6 paramZsw6, Zsdd paramZsdd, Zgq<Zrdb> paramZgq) {
    boolean bool = Zz_q.ZB();
    Zvs zvs = paramZsw6.Zn();
    if (Zeb4.Zj(zvs)) {
      this.Zs.add(zvs);
      if (bool) {
        this.ZC.Z_(paramZe3n, paramZlit, paramLong, paramZefx, paramZb6q, paramZswz, paramZsw6, paramZsdd, paramZgq);
        return;
      } 
      return;
    } 
    this.ZC.Z_(paramZe3n, paramZlit, paramLong, paramZefx, paramZb6q, paramZswz, paramZsw6, paramZsdd, paramZgq);
  }
  
  public Set<Zvs> ZD() {
    return this.Zs;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkci.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */