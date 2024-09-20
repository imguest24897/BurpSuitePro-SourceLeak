package burp;

import java.time.Duration;
import java.util.Optional;

class Zxmp extends Zxsr implements Zb_b {
  Zxmp(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Optional<Duration> ZT1() {
    int i = this.Za.Zx(this, Zks6.ZS);
    return (i > -1) ? Optional.<Duration>of(Duration.ofSeconds(i)) : Optional.<Duration>empty();
  }
  
  public void Zn(Duration paramDuration) {
    boolean bool = (paramDuration != null) ? (int)paramDuration.toSeconds() : true;
    this.Za.ZM(this, Zks6.ZS, bool);
  }
  
  public Optional<Duration> ZTa() {
    Zbqc[] arrayOfZbqc = Zkqe.ZU();
    int i = this.Za.Zx(this, Zks6.ZE);
    if (Zbqc.Zwu() == null)
      Zkqe.ZA(new Zbqc[1]); 
    return (i > -1) ? Optional.<Duration>of(Duration.ofSeconds(i)) : Optional.<Duration>empty();
  }
  
  public void ZY(Duration paramDuration) {
    Zbqc[] arrayOfZbqc = Zkqe.ZU();
    boolean bool = (paramDuration != null) ? (int)paramDuration.toSeconds() : true;
    this.Za.ZM(this, Zks6.ZE, bool);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zeu4<? extends Zb_b> ZF() {
    return ZY;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxmp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */