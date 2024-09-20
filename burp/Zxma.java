package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxma extends Zxsr implements Zkcp {
  Zxma(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public void Zi(Zz_r paramZz_r) {
    paramZz_r.Zg(Zeew.SCANNER, this.Za.<Zll9>ZJ(this, (Zekb)Zksh.Zp));
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return paramZbx0.Zp(this.Za.<Zll9>ZJ(this, (Zekb)Zksh.Zp));
  }
  
  public Zzi8 ZMJ() {
    return this.Za.<Zzi8>ZJ(this, Zksh.Zp);
  }
  
  public void Zg(Zb03 paramZb03) {
    paramZb03.ZC(this.Za.<Zzi8>ZJ(this, Zksh.Zp));
  }
  
  public Zll7 Zub() {
    return Zriz.Zi(this.Za.<Zll7>ZJ(this, Zksh.ZE));
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
    this.Za.Zq(this, Zksh.Zp, zkcp.ZMJ());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxma.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */