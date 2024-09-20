package burp;

import java.time.Duration;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zxvd extends Zxvk implements Zr5h {
  Zxvd(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zkcl ZNs() {
    return Zkcl.SCAN_AUDIT;
  }
  
  public Zz1i Zdm() {
    return this.Za.<Zz1i>ZJ(this, Zkpq.Zm);
  }
  
  public Zb4g Zd5() {
    Zb4g zb4g = this.Za.<Zb4g>ZJ(this, Zkpq.ZE);
    if (zb4g == null) {
      zb4g = Zbit.Zw(this.Za, ZPo());
      this.Za.Zq(this, Zkpq.ZE, zb4g);
      Zrpc.ZF(zb4g);
    } 
    return zb4g;
  }
  
  public void Zr(Duration paramDuration) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZHG() {
    this.Za.ZM(this, Zkpq.Z_, 0);
  }
  
  public Zeu4<? extends Zgna> ZF() {
    return (Zeu4)Zr5h.Zx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxvd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */