package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zp_ extends Zni implements Zkcp {
  @Zzvo(32)
  private final Zll7 Zo;
  
  @Zzvo(33)
  private Zzi8 ZY;
  
  Zp_(Zll7 paramZll7, Zzi8 paramZzi8) {
    Zuh.Zb((paramZzi8 != null), Zqf.Zv);
    this.Zo = paramZll7;
    this.ZY = paramZzi8;
  }
  
  public void Zi(Zz_r paramZz_r) {
    paramZz_r.Zg(Zeew.SCANNER, this.ZY);
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return paramZbx0.Zp(this.ZY);
  }
  
  public Zzi8 ZMJ() {
    return this.ZY;
  }
  
  public void Zg(Zb03 paramZb03) {
    paramZb03.ZC(this.ZY);
  }
  
  public Zll7 Zub() {
    return Zriz.Zi(this.Zo);
  }
  
  public int Zuj() {
    return 1;
  }
  
  public void ZY(Zb_h paramZb_h) {
    Zsi6.ZO(this, paramZb_h);
  }
  
  public Zeu4<? extends Zgkc> ZF() {
    return (Zeu4)Zkcp.Zz;
  }
  
  public Zte7 ZC(Zr9a paramZr9a) {
    return paramZr9a.ZJ(this);
  }
  
  public Zte7 Zq(Zr9a paramZr9a) {
    return ZC(paramZr9a);
  }
  
  public Zzk5 Zu(Zgkc paramZgkc, Zz1h paramZz1h) {
    return (paramZgkc instanceof Zkcp) ? Zzk5.EVIDENCE_EXISTS : Zzk5.CONTINUE;
  }
  
  public Zzi8 Zuz() {
    return ZMJ();
  }
  
  public void ZT(Zrde paramZrde) {
    if (!(paramZrde instanceof Zkcp)) {
      Zuh.ZT(false, Zqf.Zr, paramZrde.getClass().getName());
      return;
    } 
    Zkcp zkcp = (Zkcp)paramZrde;
    this.ZY = zkcp.ZMJ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zp_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */