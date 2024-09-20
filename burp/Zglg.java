package burp;

import java.awt.Component;
import java.util.List;
import java.util.function.BiFunction;
import java.util.prefs.Preferences;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zglg implements Ztun {
  private final Zbqa ZF;
  
  private final Zt33 Zk;
  
  private final Ztd8 ZC;
  
  private final List<Ztm_> ZR;
  
  private final Zk97 Z_;
  
  private final BiFunction<Component, List<Ztm_>, Zr7o> Ze;
  
  private final Preferences Zg = Preferences.userNodeForPackage(StartBurp.class);
  
  public Zglg(Zbqa paramZbqa, Zt33 paramZt33, Ztd8 paramZtd8, List<Ztm_> paramList, Zk97 paramZk97) {
    this(paramZbqa, paramZt33, paramZtd8, paramList, paramZk97, Zr7o::new);
  }
  
  public Zglg(Zbqa paramZbqa, Zt33 paramZt33, Ztd8 paramZtd8, List<Ztm_> paramList, Zk97 paramZk97, BiFunction<Component, List<Ztm_>, Zr7o> paramBiFunction) {
    this.ZF = paramZbqa;
    this.Zk = paramZt33;
    this.ZC = paramZtd8;
    this.ZR = paramList;
    this.Z_ = paramZk97;
    this.Ze = paramBiFunction;
  }
  
  public Zb07 Z_(Component paramComponent) {
    if (Zb12.ZG())
      return Zb07.Zu; 
    Zr7o zr7o = this.Ze.apply(paramComponent, this.ZR);
    zr7o.addComponentListener(new Zzlp(this, zr7o));
    this.ZF.Zc(new Zsgz(this.ZC, this.Zg, zr7o, this.Z_));
    return zr7o;
  }
  
  private Zspz ZF() {
    return this.ZR.stream().filter(this::lambda$getFilterDialogPanel$0).map(Ztm_::ZcW).findFirst().orElseGet(this::lambda$getFilterDialogPanel$1);
  }
  
  private Zspz lambda$getFilterDialogPanel$1() {
    Zuh.Zb(false, Zqf.Zr);
    return this.ZC;
  }
  
  private boolean lambda$getFilterDialogPanel$0(Ztm_ paramZtm_) {
    return (paramZtm_.Zcp() == this.Zk.Zb());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zglg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */