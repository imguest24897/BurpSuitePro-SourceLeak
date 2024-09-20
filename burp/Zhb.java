package burp;

import java.util.Collection;
import java.util.Collections;

public class Zhb extends Zni implements Zeg1 {
  @Zzvo(1)
  private final Zzwo<Zgqa, Zbg> ZH;
  
  Zhb(Zzwo<Zgqa, Zbg> paramZzwo) {
    this.ZH = paramZzwo;
  }
  
  public Zbg ZP(Zgqa paramZgqa) {
    return this.ZH.Zd(paramZgqa);
  }
  
  public void ZA(Zgqa paramZgqa, Zbg paramZbg) {
    this.ZH.Zu(paramZgqa, paramZbg);
  }
  
  public Collection<Zbg> ZPI() {
    return Collections.unmodifiableCollection(this.ZH.ZlZ());
  }
  
  public Zgqa Zi(Zl_ paramZl_) {
    return Zlrg.Z_(new Zruo(), paramZl_);
  }
  
  public Zbg ZD(Zgqa paramZgqa, Zl_ paramZl_) {
    return Zlrg.ZS(new Zruo(), paramZgqa, paramZl_);
  }
  
  public Zeu4<? extends Zeg1> ZF() {
    return Zm;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zhb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */