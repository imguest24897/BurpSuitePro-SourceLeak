package burp;

import java.util.Optional;
import net.portswigger.Zif;
import net.portswigger.Zl5;
import net.portswigger.Zvj;

class Zr5m extends Zvj {
  final Ztgn ZH;
  
  Zr5m(Ztgn paramZtgn) {}
  
  public Optional<Zif> ZK(Zl5 paramZl5) {
    int i = Zgdu.Zb();
    for (Zgt zgt : this.ZH.Zf.Zs()) {
      if (!zgt.ZE)
        continue; 
      if (zgt.Zb.equals(Zldl.ZI(paramZl5.Zw())))
        return Optional.of(new Zsfn(this, paramZl5)); 
      if (i != 0)
        break; 
    } 
    return Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr5m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */