package burp;

import java.time.Instant;

public class Zwx extends Zni implements Zk21 {
  @Zzvo(0)
  private long Zc;
  
  public Zwx(Instant paramInstant) {
    ZE(paramInstant);
  }
  
  public Instant ZBy() {
    return Zsq3.ZW(this.Zc);
  }
  
  private void ZE(Instant paramInstant) {
    String str = Zsq3.Zb();
    if (paramInstant == null) {
      this.Zc = -1L;
      if (str != null) {
        this.Zc = paramInstant.toEpochMilli();
        return;
      } 
      return;
    } 
    this.Zc = paramInstant.toEpochMilli();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */