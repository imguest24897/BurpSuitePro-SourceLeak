package burp;

import java.time.Duration;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zxvr extends Zxvk implements Zlog {
  Zxvr(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zkcl ZNs() {
    return Zkcl.SCAN_CRAWL;
  }
  
  public Zl7h ZnH() {
    return this.Za.<Zl7h>ZJ(this, Zkp7.ZK);
  }
  
  public Zb4g Zd5() {
    Zb4g zb4g = this.Za.<Zb4g>ZJ(this, Zkp7.ZQ);
    if (zb4g == null) {
      zb4g = Zbit.Zw(this.Za, ZPo());
      this.Za.Zq(this, Zkp7.ZQ, zb4g);
      Zrpc.ZF(zb4g);
    } 
    return zb4g;
  }
  
  public void Zr(Duration paramDuration) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZHG() {
    this.Za.ZM(this, Zkp7.Zl, 0);
  }
  
  public Zeu4<? extends Zgna> ZF() {
    return (Zeu4)Zlog.ZD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxvr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */