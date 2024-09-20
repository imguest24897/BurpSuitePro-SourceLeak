package burp;

import java.time.Duration;
import java.util.Optional;

class Zxvg extends Zxvk implements Zzep {
  Zxvg(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zkcl ZNs() {
    Zkcl zkcl = Zkcl.ZR(this.Za.Zx(this, Zkph.Zq));
    return (zkcl == null) ? Zkcl.SCAN_CRAWL_AND_AUDIT : zkcl;
  }
  
  public Zl7h ZnH() {
    return this.Za.<Zl7h>ZJ(this, Zkph.Zb);
  }
  
  public Zz1i Zdm() {
    return this.Za.<Zz1i>ZJ(this, Zkph.ZZ);
  }
  
  public Zb4g Zd5() {
    Zb4g zb4g = this.Za.<Zb4g>ZJ(this, Zkph.ZR);
    if (zb4g == null) {
      zb4g = Zbit.Zw(this.Za, ZPo());
      this.Za.Zq(this, Zkph.ZR, zb4g);
      Zrpc.ZF(zb4g);
    } 
    return zb4g;
  }
  
  public Optional<Duration> ZPf() {
    long l = this.Za.ZL(this, Zkpa.ZF);
    return (l <= 0L) ? Optional.empty() : Optional.of(Duration.ofMillis(l));
  }
  
  public void Zr(Duration paramDuration) {
    this.Za.ZV(this, Zkpa.ZF, (paramDuration == null) ? 0L : paramDuration.toMillis());
  }
  
  public Duration Zd2() {
    return Duration.ofMillis(this.Za.ZL(this, Zkph.ZI));
  }
  
  public void Zl(Duration paramDuration) {
    this.Za.ZV(this, Zkph.ZI, (paramDuration == null) ? 0L : paramDuration.toMillis());
  }
  
  public void ZV(Zx6t paramZx6t, Zrbm paramZrbm) {
    Zkr5.Zy(paramZx6t, ZnH(), Zdm(), ((Zxn8)paramZrbm).ZH());
  }
  
  public void ZHG() {
    this.Za.ZM(this, Zkph.ZO, 0);
  }
  
  public Zeu4<? extends Zgna> ZF() {
    return (Zeu4)Zzep.Zs;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxvg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */