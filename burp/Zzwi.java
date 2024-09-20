package burp;

import java.util.List;
import java.util.Objects;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zzwi {
  private final List<Zeo2> ZQ;
  
  private Zzwi(List<Zeo2> paramList) {
    this.ZQ = paramList;
  }
  
  void Zp(Ztj1 paramZtj1) {
    boolean bool = Zmue.ZH();
    Zrbm zrbm = paramZtj1.Zi();
    if (zrbm instanceof Zriy) {
      Zriy zriy = (Zriy)zrbm;
      if (!bool) {
        Objects.requireNonNull(zriy);
        this.ZQ.forEach(zriy::Zy);
        return;
      } 
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzwi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */