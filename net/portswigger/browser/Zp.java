package net.portswigger.browser;

import burp.Zbqc;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class Zp implements Zv {
  private final Zeq ZL;
  
  private final Map<Zef, Integer> ZT;
  
  public Zp(Duration paramDuration, int paramInt) {
    this.ZL = new Zeq(new Zzx(paramDuration), paramInt);
    this.ZT = new HashMap<>();
    int[] arrayOfInt = Ztr.Z_();
    if (Zbqc.Zwu() == null)
      Ztr.ZP(new int[2]); 
  }
  
  public void ZW() throws InterruptedException {
    this.ZL.ZW();
  }
  
  public void Zf() {
    this.ZL.Zf();
  }
  
  public void ZJ(Zjt paramZjt, CompletableFuture<?> paramCompletableFuture) {
    if (Zm(paramZjt))
      return; 
    Zg zg = new Zg(paramCompletableFuture);
    this.ZL.Zz(zg);
  }
  
  private synchronized boolean Zm(Zjt paramZjt) {
    if (paramZjt.ZD().equals(Zec.DOCUMENT))
      return false; 
    Zef zef = Zef.Zp(paramZjt);
    int i = ((Integer)this.ZT.getOrDefault(zef, Integer.valueOf(0))).intValue() + 1;
    this.ZT.put(zef, Integer.valueOf(i));
    return (i > 3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */