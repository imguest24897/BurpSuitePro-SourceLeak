package net.portswigger.browser;

import burp.Zbqc;
import java.time.Duration;

public class Zzr {
  private Duration ZP = Duration.ofSeconds(20L);
  
  private Duration ZE = Duration.ofMillis(500L);
  
  private Duration ZU;
  
  private int Zi = 10;
  
  private boolean Zm = false;
  
  private Duration Zn;
  
  private Duration ZK;
  
  public Zzr() {
    boolean bool = Zcb.ZZ();
    this.Zn = Duration.ofMillis(50L);
    this.ZK = Duration.ofMillis(50L);
    if (!bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public Zzr Zm(Duration paramDuration) {
    this.ZE = paramDuration;
    return this;
  }
  
  public Zzr ZP(Duration paramDuration) {
    this.ZU = paramDuration;
    return this;
  }
  
  public Zzr ZO(boolean paramBoolean) {
    this.Zm = paramBoolean;
    return this;
  }
  
  public Zdu Zp() {
    return new Zdu(this);
  }
  
  public Zzr ZK(Duration paramDuration) {
    this.Zn = paramDuration;
    return this;
  }
  
  public Zzr Zg(Duration paramDuration) {
    this.ZK = paramDuration;
    return this;
  }
  
  public static Zzr ZU() {
    return new Zzr();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zzr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */