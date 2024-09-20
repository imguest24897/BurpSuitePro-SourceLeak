package burp;

import java.util.Map;
import java.util.function.Predicate;

class Zxcr implements Zejc<S, E> {
  final Zk2f ZB;
  
  Zxcr(Zk2f paramZk2f) {}
  
  public S ZH() {
    return this.ZB.Zc;
  }
  
  public S Zg(S paramS, E paramE) {
    int i = Zv84.ZB();
    if (paramE instanceof Zxno)
      return this.ZB.ZS; 
    Map map = (Map)this.ZB.Zi.get(paramS);
    for (Map.Entry entry : map.entrySet()) {
      if (((Predicate<E>)entry.getKey()).test(paramE)) {
        Zg0z zg0z = (Zg0z)entry.getValue();
        this.ZB.Zn.Zv(paramS, paramE, zg0z);
        return (S)zg0z;
      } 
      if (i == 0)
        break; 
    } 
    return null;
  }
  
  public void ZJ(S paramS) {
    this.ZB.Zz.accept(paramS);
  }
  
  public String toString() {
    return this.ZB.Zv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxcr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */