package burp;

import java.util.Objects;

class Zj7 extends Zni implements Zg8m {
  @Zzvo(1)
  private final Zszy Zg;
  
  @Zzvo(3)
  private final Zszw Zk;
  
  @Zzvo(4)
  private final Zlru ZV;
  
  @Zzvo(2)
  private final Zeu9 ZY;
  
  Zj7(Zszy paramZszy, Zszw paramZszw, Zlru paramZlru, Zeu9 paramZeu9) {
    this.Zg = paramZszy;
    this.Zk = paramZszw;
    this.ZV = paramZlru;
    this.ZY = paramZeu9;
  }
  
  public Zeu4<? extends Zg8m> ZF() {
    return ZD;
  }
  
  public Zszy Z_5() {
    return this.Zg;
  }
  
  public Zeu9 ZR(Zl_ paramZl_) {
    Objects.requireNonNull(paramZl_);
    return Objects.<Zeu9>requireNonNullElseGet(this.ZY, paramZl_::Znq);
  }
  
  public Zszw Z_x() {
    return this.Zk;
  }
  
  public Zlru Z_Z() {
    return this.ZV;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zj7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */