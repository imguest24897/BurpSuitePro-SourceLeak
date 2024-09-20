package burp;

import java.time.Duration;
import java.util.Optional;

class Zx33 extends Zxsr implements Zlzm {
  Zx33(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Optional<Duration> Zkt() {
    String[] arrayOfString = Zt9v.Zx();
    int i = this.Za.Zx(this, Zkle.ZD);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
    return (i != 0) ? Optional.<Duration>of(Duration.ofMinutes(i)) : Optional.<Duration>empty();
  }
  
  public void Zc(int paramInt) {
    this.Za.ZM(this, Zkle.ZD, paramInt);
  }
  
  public int ZkL() {
    return this.Za.Zx(this, Zkle.Zv);
  }
  
  public void Zh(int paramInt) {
    this.Za.ZM(this, Zkle.Zv, paramInt);
  }
  
  public int ZkG() {
    return this.Za.Zx(this, Zkle.ZN);
  }
  
  public void ZX(int paramInt) {
    this.Za.ZM(this, Zkle.ZN, paramInt);
  }
  
  public Zeu4<? extends Zlzm> ZF() {
    return ZG;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx33.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */