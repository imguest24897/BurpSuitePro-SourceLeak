package burp;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zk2p {
  private static final Map<Zl5x, Zkj5> Zv = Collections.unmodifiableMap(new Zx5i());
  
  private final Zkq4 Zq;
  
  private final Zes1 Zf;
  
  Zk2p(Zkq4 paramZkq4, Zes1 paramZes1) {
    this.Zq = paramZkq4;
    this.Zf = paramZes1;
  }
  
  int Zw() {
    return ZI(Zl5x.ZA);
  }
  
  int Zz(Zbza paramZbza) {
    List<Zl5x> list = (List)Zl5x.ZA.stream().filter(paramZbza::lambda$getRemainingWork$0).collect(Collectors.toList());
    return ZI(list);
  }
  
  private int ZI(List<Zl5x> paramList) {
    return paramList.stream().mapToInt(this::Zk).sum();
  }
  
  int Zk(Zl5x paramZl5x) {
    Zkj5 zkj5 = Zv.get(paramZl5x);
    if (zkj5 == null) {
      Zuh.Zb(false, Zqf.Zk);
      return 0;
    } 
    return zkj5.ZD(this.Zq, this.Zf);
  }
  
  private static boolean lambda$getRemainingWork$0(Zbza paramZbza, Zl5x paramZl5x) {
    return !paramZbza.ZW(paramZl5x).Zk();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */