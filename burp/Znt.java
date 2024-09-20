package burp;

import java.time.Duration;
import java.util.Optional;

public class Znt extends Zni implements Zlzm {
  private Duration Z_;
  
  @Zzvo(2)
  private int ZZ;
  
  @Zzvo(3)
  private int ZE;
  
  public Optional<Duration> Zkt() {
    return Optional.ofNullable(this.Z_);
  }
  
  public void Zc(int paramInt) {
    this.Z_ = (paramInt != 0) ? Duration.ofMinutes(paramInt) : null;
  }
  
  public int ZkL() {
    return this.ZZ;
  }
  
  public void Zh(int paramInt) {
    this.ZZ = paramInt;
  }
  
  public int ZkG() {
    return this.ZE;
  }
  
  public void ZX(int paramInt) {
    this.ZE = paramInt;
  }
  
  @Zzvo(1)
  private int ZRB() {
    return (this.Z_ != null) ? (int)this.Z_.toMinutes() : 0;
  }
  
  public Zeu4<? extends Zlzm> ZF() {
    return ZG;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Znt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */