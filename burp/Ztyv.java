package burp;

import java.time.Instant;

class Ztyv {
  private final Instant Zj;
  
  private int ZR = 0;
  
  private Ztyv(Instant paramInstant) {
    this.Zj = paramInstant.plusSeconds(1L);
  }
  
  boolean Zk(Instant paramInstant) {
    return paramInstant.isBefore(this.Zj);
  }
  
  void Zf(int paramInt) {
    this.ZR += paramInt;
  }
  
  int Zx() {
    return this.ZR;
  }
  
  Ztyv ZZ() {
    return new Ztyv(this.Zj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztyv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */