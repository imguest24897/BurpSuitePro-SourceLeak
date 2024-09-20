package burp;

import java.time.Duration;
import java.util.Optional;

public class Zn5 extends Zni implements Zrfu {
  private Duration ZH;
  
  private Duration ZG;
  
  public Optional<Duration> ZZ9() {
    return Optional.ofNullable(this.ZH);
  }
  
  public void ZU(Duration paramDuration) {
    this.ZH = paramDuration;
  }
  
  public Optional<Duration> ZZy() {
    return Optional.ofNullable(this.ZG);
  }
  
  public void ZI(Duration paramDuration) {
    this.ZG = paramDuration;
  }
  
  @Zzvo(1)
  private int Zyu() {
    return (this.ZH != null) ? (int)this.ZH.toSeconds() : -1;
  }
  
  @Zzvo(2)
  private int Zy_() {
    return (this.ZG != null) ? (int)this.ZG.toSeconds() : -1;
  }
  
  public Zeu4<? extends Zrfu> ZF() {
    return ZA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zn5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */