package burp;

import java.util.Objects;
import java.util.stream.Stream;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zsz0 {
  final Zqy Zz;
  
  private Zsz0(Zqy paramZqy) {}
  
  public void ZD(Ztj1 paramZtj1) {
    String str = Zl41.ZU();
    Zrbm zrbm = paramZtj1.Zi();
    if (zrbm instanceof Zriy) {
      Zriy zriy = (Zriy)zrbm;
      if (str == null) {
        Objects.requireNonNull(zriy);
        Stream.<Zll9>of(this.Zz.ZX).forEach(zriy::Zy);
        return;
      } 
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsz0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */