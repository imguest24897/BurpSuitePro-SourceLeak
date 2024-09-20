package burp;

import java.util.Collections;
import java.util.Set;

class Zm07 {
  private final Zxz8 Za;
  
  Zm07(Zxz8 paramZxz8) {
    this.Za = paramZxz8;
  }
  
  public long ZW(long paramLong) {
    Zltc zltc = this.Za.Zmh();
    if (zltc == null)
      return 0L; 
    Long long_ = zltc.Zg(paramLong);
    return (long_ == null) ? 0L : long_.longValue();
  }
  
  public void Zg(long paramLong1, long paramLong2) {
    Zltc zltc = this.Za.Zmh();
    if (zltc == null)
      zltc = this.Za.Zmb(); 
    zltc.ZN(paramLong1, Long.valueOf(paramLong2));
  }
  
  public Set<Long> Zn() {
    Zltc zltc = this.Za.Zmh();
    return (zltc == null) ? Collections.emptySet() : zltc.ZxV();
  }
  
  public void Zk() {
    Zltc zltc = this.Za.Zmh();
    if (zltc != null)
      zltc.Zx0(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm07.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */