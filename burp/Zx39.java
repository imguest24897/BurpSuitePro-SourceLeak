package burp;

import java.time.Duration;
import java.util.Optional;

class Zx39 extends Zxsr implements Zrfu {
  Zx39(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Optional<Duration> ZZ9() {
    int i = this.Za.Zx(this, Zkld.ZU);
    return (i > -1) ? Optional.<Duration>of(Duration.ofSeconds(i)) : Optional.<Duration>empty();
  }
  
  public void ZU(Duration paramDuration) {
    boolean bool = (paramDuration != null) ? (int)paramDuration.toSeconds() : true;
    this.Za.ZM(this, Zkld.ZU, bool);
  }
  
  public Optional<Duration> ZZy() {
    String[] arrayOfString = Zmd1.Z_();
    int i = this.Za.Zx(this, Zkld.ZY);
    if (Zbqc.Zwu() == null)
      Zmd1.ZF(new String[3]); 
    return (i > -1) ? Optional.<Duration>of(Duration.ofSeconds(i)) : Optional.<Duration>empty();
  }
  
  public void ZI(Duration paramDuration) {
    String[] arrayOfString = Zmd1.Z_();
    boolean bool = (paramDuration != null) ? (int)paramDuration.toSeconds() : true;
    this.Za.ZM(this, Zkld.ZY, bool);
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zeu4<? extends Zrfu> ZF() {
    return ZA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx39.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */