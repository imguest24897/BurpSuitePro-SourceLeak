package net.portswigger.browser;

import java.time.Duration;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

class Zc implements Zv {
  private final Map<Ztw, Zd4> Zf;
  
  private final Zeq Zk;
  
  private final Duration ZZ;
  
  private Zc(Ztw paramZtw, Zd4 paramZd4, Duration paramDuration) {
    this.ZZ = paramDuration;
    this.Zf = new ConcurrentHashMap<>((paramZd4 == null) ? Collections.<Ztw, Zd4>emptyMap() : Map.<Ztw, Zd4>of(paramZtw, paramZd4));
    this.Zk = new Zeq(new Zcc(paramDuration, new int[] { 2 }), 20, paramZd4);
  }
  
  static Zc Zq(Ztw paramZtw, Duration paramDuration) {
    return new Zc(paramZtw, null, paramDuration);
  }
  
  static Zc Zs(Ztw paramZtw, Duration paramDuration) {
    return new Zc(paramZtw, new Zde(paramDuration.multipliedBy(10L)), paramDuration);
  }
  
  public void ZW() throws InterruptedException {
    this.Zk.ZW();
  }
  
  public void Zf() {
    this.Zk.Zf();
  }
  
  void ZN(Ztw paramZtw) {
    Zc_ zc_ = new Zc_(this.ZZ.multipliedBy(10L));
    Zd4 zd4 = this.Zf.put(paramZtw, zc_);
    this.Zk.Zz(zc_);
    if (zd4 != null)
      zd4.ZY(paramZtw); 
  }
  
  void Zl(Ztw paramZtw) {
    Zd4 zd4 = this.Zf.get(paramZtw);
    if (zd4 != null)
      zd4.ZF(paramZtw); 
  }
  
  public void ZX(Zjt paramZjt, CompletableFuture<?> paramCompletableFuture) {
    Zd4 zd4 = this.Zf.get(paramZjt.Zj());
    if (zd4 != null)
      zd4.ZJ(paramZjt, paramCompletableFuture); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */