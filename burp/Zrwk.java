package burp;

import java.util.Objects;
import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrwk extends Zrwm {
  private final Zz2h ZS;
  
  private final Zzq2 ZV;
  
  private final Zz4i Zr;
  
  public Zrwk(Zz2h paramZz2h, Zzq2 paramZzq2, Zz4i paramZz4i) {
    this.ZS = paramZz2h;
    this.ZV = paramZzq2;
    this.Zr = paramZz4i;
  }
  
  public void Zr(Zrdb paramZrdb) {
    boolean bool = Zrwm.Zl();
    Zs37 zs37 = this.ZS.ZB(paramZrdb);
    if (zs37 == null) {
      Zuh.Zb(false, Zqf.Zr);
      this.Zr.ZK(paramZrdb);
      if (bool) {
        Zbqc.Zr(new Zbqc[1]);
      } else {
        return;
      } 
    } 
    if (zs37.Zvr()) {
      synchronized (zs37.Zz6()) {
        Optional<Zrdb> optional = this.ZV.Zq(paramZrdb, zs37);
        Objects.requireNonNull(this.Zr);
        optional.ifPresent(this.Zr::ZK);
      } 
      if (bool) {
        this.Zu.Zr(paramZrdb);
        return;
      } 
      return;
    } 
    this.Zu.Zr(paramZrdb);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrwk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */