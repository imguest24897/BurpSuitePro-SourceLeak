package burp;

import java.time.Duration;
import java.util.Optional;
import net.portswigger.browser.Zcv;
import net.portswigger.browser.Zd6;
import net.portswigger.browser.Ze6;
import net.portswigger.browser.Zjq;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zth;

public class Zgbv<F> extends Zgb7<F> {
  private final F Zs;
  
  Zgbv(Ztgw paramZtgw, Zsxd paramZsxd, F paramF) {
    super(paramZtgw, paramZsxd);
    this.Zs = paramF;
  }
  
  public static <F> Zgbv<F> ZU(Ztgw paramZtgw, F paramF) {
    return new Zgbv<>(paramZtgw, null, paramF);
  }
  
  public Zlve ZW(Zjw paramZjw, Zbnt paramZbnt, Zjq paramZjq, Ze6 paramZe6, Zcv paramZcv) {
    Optional<Zsxd> optional = Zk();
    if (optional.isPresent() && ((Zsxd)optional.get()).ZG().Ze() != null) {
      Zt70 zt70 = Zt70.Zt(Zb().Zd(), ((Zsxd)optional.get()).ZG().Ze(), optional.<Duration>map(Zsxd::ZE).orElse(Duration.ZERO), paramZbnt);
      return (new Zzpi()).Zv(zt70).Zi(zt70).Zu();
    } 
    return (new Zzpi()).ZU(Zb().Zd()).Zu();
  }
  
  public Optional<F> Zy() {
    return Optional.ofNullable(this.Zs);
  }
  
  public Zd6 Zm() {
    return (Zd6)new Zth();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */