package net.portswigger.browser;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class Zde implements Zd4 {
  private final Zp Zb;
  
  public Zde(Duration paramDuration) {
    this.Zb = new Zp(paramDuration, 500);
  }
  
  public void ZW() throws InterruptedException {
    this.Zb.ZW();
  }
  
  public void Zf() {
    this.Zb.Zf();
  }
  
  public void ZY(Ztw paramZtw) {
    this.Zb.Zf();
  }
  
  public void ZF(Ztw paramZtw) {}
  
  public void ZJ(Zjt paramZjt, CompletableFuture<?> paramCompletableFuture) {
    this.Zb.ZJ(paramZjt, paramCompletableFuture);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zde.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */