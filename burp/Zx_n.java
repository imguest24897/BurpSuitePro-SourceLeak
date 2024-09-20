package burp;

import java.util.List;
import java.util.Objects;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zx_n {
  private final List<? extends Zll9> Zy;
  
  private Zx_n(List<? extends Zll9> paramList) {
    this.Zy = paramList;
  }
  
  void Zt(Ztj1 paramZtj1) {
    int i = Zmu5.Z_();
    Zrbm zrbm = paramZtj1.Zi();
    if (zrbm instanceof Zriy) {
      Zriy zriy = (Zriy)zrbm;
      if (i == 0) {
        Objects.requireNonNull(zriy);
        this.Zy.forEach(zriy::Zy);
        return;
      } 
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */