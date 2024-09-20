package burp;

import java.util.Collection;
import java.util.Collections;

public class Zjz extends Zni implements Zkmk {
  @Zzvo(1)
  private final Zefg<Zrp0> Zk;
  
  private final Zr_4 ZD;
  
  Zjz(Zefg<Zrp0> paramZefg, Zr_4 paramZr_4) {
    this.Zk = paramZefg;
    this.ZD = paramZr_4;
  }
  
  public void ZK(Zrp0 paramZrp0) {
    this.Zk.add(paramZrp0);
  }
  
  public Collection<Zrp0> ZEN() {
    return Collections.unmodifiableCollection(this.Zk);
  }
  
  public void ZQ(Zrp0 paramZrp0, Zszw paramZszw, Zlru paramZlru, Zeu9 paramZeu9, Ztk0 paramZtk0, Zt1i paramZt1i, Zz1m<Zt35> paramZz1m, Zr69 paramZr69) {
    Zs2q.Zp(paramZrp0, paramZszw, paramZlru, paramZeu9, this, paramZtk0, paramZt1i, this.ZD, paramZz1m, paramZr69);
  }
  
  public Zeu4<? extends Zkmk> ZF() {
    return Zkmk.Zq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zjz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */