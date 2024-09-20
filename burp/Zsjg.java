package burp;

import java.util.HashSet;
import java.util.Set;

class Zsjg implements Zs4_ {
  private final Zroi ZZ;
  
  private final Set<Zvs> ZA;
  
  Zsjg(Zroi paramZroi) {
    this.ZZ = paramZroi;
    this.ZA = new HashSet<>();
  }
  
  public void Z_(Ze3n paramZe3n, Zlit paramZlit, long paramLong, Zefx paramZefx, Zb6q paramZb6q, Zswz paramZswz, Zsw6 paramZsw6, Zsdd paramZsdd, Zgq<Zrdb> paramZgq) {
    this.ZA.add(paramZsw6.Zn());
    this.ZZ.Z_(paramZe3n, paramZlit, paramLong, paramZefx, paramZb6q, paramZswz, paramZsw6, paramZsdd, paramZgq);
  }
  
  public Set<Zvs> ZD() {
    return this.ZA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsjg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */