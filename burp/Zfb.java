package burp;

import java.util.Optional;

class Zfb extends Zni implements Zg4y {
  @Zzvo(1)
  private final Zzwo<Zr8, Zszw> ZF;
  
  @Zzvo(2)
  private final Zszw ZL;
  
  private final Zr_4 Zg;
  
  Zfb(Zzwo<Zr8, Zszw> paramZzwo, Zszw paramZszw, Zr_4 paramZr_4) {
    this.ZF = paramZzwo;
    this.ZL = paramZszw;
    this.Zg = paramZr_4;
  }
  
  public Optional<Zszw> Zz(Zrp0 paramZrp0, Zlru paramZlru) {
    return Zvx.Zu(this.ZF, paramZrp0, paramZlru);
  }
  
  public Zszw ZD(Zrp0 paramZrp0, Zlru paramZlru) {
    return Zvx.Z_(this.ZF, paramZrp0, paramZlru, this.Zg);
  }
  
  public Zszw ZV9() {
    return this.ZL;
  }
  
  public Zeu4<? extends Zg4y> ZF() {
    return ZD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zfb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */