package burp;

import java.util.Optional;

class Zx93 extends Zxsr implements Zg4y {
  Zx93(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Optional<Zszw> Zz(Zrp0 paramZrp0, Zlru paramZlru) {
    return Zvx.Zu(ZzO(), paramZrp0, paramZlru);
  }
  
  public Zszw ZD(Zrp0 paramZrp0, Zlru paramZlru) {
    return Zvx.Z_(ZzO(), paramZrp0, paramZlru, this.Za);
  }
  
  public Zszw ZV9() {
    Zszw zszw = this.Za.<Zszw>ZJ(this, Zkn8.ZW);
    if (zszw == null) {
      zszw = this.Za.<Zszw>ZH(Zszw.Zj());
      this.Za.Zq(this, Zkn8.ZW, zszw);
    } 
    return zszw;
  }
  
  private Zzwo<Zr8, Zszw> ZzO() {
    return this.Za.<Zzwo<Zr8, Zszw>>ZJ(this, Zkn8.Zq);
  }
  
  public Zeu4<? extends Zg4y> ZF() {
    return ZD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx93.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */