package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zv8s extends Zv84 {
  private final Ze73 ZN;
  
  public Zv8s(Ze73 paramZe73) {
    this.ZN = paramZe73;
  }
  
  protected Zvb Zb(Zvb paramZvb) {
    Zuh.Zb(paramZvb instanceof Zx6_, Zqf.Zr);
    if (paramZvb instanceof Zx6_) {
      Zx6_ zx6_ = (Zx6_)paramZvb;
      return ZJ(zx6_);
    } 
    return null;
  }
  
  private Zx6f ZJ(Zx6_ paramZx6_) {
    Zb0_ zb0_ = paramZx6_.Zl();
    Zm0f zm0f = paramZx6_.ZT();
    Zszw zszw = zb0_.Zv();
    Zrp0 zrp0 = zb0_.Zo();
    Zlru zlru = zb0_.ZR();
    Zeu9 zeu9 = zb0_.Zl();
    Zbj5 zbj51 = zm0f.ZI();
    Zem4<Zm9l> zem4 = ZT(zbj51, zszw, zrp0, zlru, zeu9);
    Zbj5 zbj52 = zem4.Zv() ? zem4.Zk().ZG() : zbj51;
    Zzcs zzcs = new Zzcs(zm0f, zbj52);
    return zem4.Zv() ? (((Zm9l)zem4.Zk().ZF()).ZD().equals(zeu9) ? new Zx66(zb0_, zzcs, zeu9) : new Zx6z(zb0_, zzcs, ((Zm9l)zem4.Zk().ZF()).ZD())) : new Zx6x(zb0_, zzcs);
  }
  
  private Zem4<Zm9l> ZT(Zbj5 paramZbj5, Zszw paramZszw, Zrp0 paramZrp0, Zlru paramZlru, Zeu9 paramZeu9) {
    return this.ZN.Zc(paramZbj5, new Zk2z(paramZeu9, paramZrp0, paramZlru, paramZszw));
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */