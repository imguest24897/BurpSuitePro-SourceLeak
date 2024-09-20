package burp;

import java.util.Objects;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ztz4 {
  final Zmaz Zy;
  
  private Ztz4(Zmaz paramZmaz) {}
  
  public void Zg(Ztj1 paramZtj1) {
    int i = Zb56.ZxE();
    Zrbm zrbm = paramZtj1.Zi();
    if (zrbm instanceof Zriy) {
      Zriy zriy = (Zriy)zrbm;
      if (i != 0) {
        Objects.requireNonNull(zriy);
        this.Zy.Zh.forEach(zriy::Zy);
        return;
      } 
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztz4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */