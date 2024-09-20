package burp;

import java.time.Duration;
import java.util.Optional;

public class Zg77 implements Zzu3 {
  private final Zr69 ZJ;
  
  private final Zgna ZX;
  
  private final Zz1m<Zt18> ZB;
  
  private boolean Zz = false;
  
  public Zg77(Zr69 paramZr69, Zgna paramZgna, Zz1m<Zt18> paramZz1m) {
    this.ZJ = paramZr69;
    this.ZX = paramZgna;
    this.ZB = paramZz1m;
  }
  
  public boolean Zw() {
    if (this.Zz)
      return true; 
    Optional<Duration> optional = this.ZJ.ZG();
    if (optional.isEmpty())
      return false; 
    Duration duration = this.ZX.ZPB();
    if (duration.compareTo(optional.get()) > 0) {
      this.ZB.ZD(Zt18.Zw);
      this.Zz = true;
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg77.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */