package burp;

import java.time.Duration;
import java.util.Optional;

public class Zur extends Zni implements Zb_b {
  private Duration ZW;
  
  private Duration Zb;
  
  public Optional<Duration> ZT1() {
    return Optional.ofNullable(this.ZW);
  }
  
  public void Zn(Duration paramDuration) {
    this.ZW = paramDuration;
  }
  
  public Optional<Duration> ZTa() {
    return Optional.ofNullable(this.Zb);
  }
  
  public void ZY(Duration paramDuration) {
    this.Zb = paramDuration;
  }
  
  @Zzvo(1)
  private int ZW() {
    return (this.ZW != null) ? (int)this.ZW.toSeconds() : -1;
  }
  
  @Zzvo(2)
  private int Zy() {
    return (this.Zb != null) ? (int)this.Zb.toSeconds() : -1;
  }
  
  public Zeu4<? extends Zb_b> ZF() {
    return ZY;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zur.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */