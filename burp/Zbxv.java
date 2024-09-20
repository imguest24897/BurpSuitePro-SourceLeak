package burp;

import java.util.HashSet;
import java.util.Set;

public class Zbxv {
  private final Set<Zvs> Zw = new HashSet<>();
  
  private final Ztai Zg;
  
  Zbxv(Ztai paramZtai) {
    this.Zg = paramZtai;
  }
  
  public boolean Zp(Zvs paramZvs) {
    return this.Zw.contains(paramZvs) ? false : ((paramZvs == Zzu2.XSS_STORED) ? this.Zg.ZS(Zzu2.XSS_STORED, Zr3z.IN_BAND) : ((paramZvs == Zzu2.XSS_REFLECTED) ? this.Zg.ZS(Zzu2.XSS_REFLECTED, Zr3z.CLIENT_SIDE_BREAKOUT) : this.Zg.Zr(paramZvs)));
  }
  
  public void Zn(Zvs paramZvs) {
    this.Zw.add(paramZvs);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbxv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */