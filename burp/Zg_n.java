package burp;

import java.util.function.BiFunction;

public class Zg_n {
  private final Zlgm Zn;
  
  private final boolean ZN;
  
  private final Zxgr ZL;
  
  private final BiFunction<Zxs7, Boolean, Zi4> Zz;
  
  private Zg_n(Ztcd paramZtcd) {
    this.Zn = paramZtcd.Zg;
    this.ZN = paramZtcd.Zp;
    this.ZL = paramZtcd.Za;
    this.Zz = paramZtcd.ZR;
  }
  
  Zlgm ZK() {
    return this.Zn;
  }
  
  boolean ZS() {
    return this.ZN;
  }
  
  Zi4 Zo(Zxs7 paramZxs7, boolean paramBoolean) {
    return this.Zz.apply(paramZxs7, Boolean.valueOf(paramBoolean));
  }
  
  Zxgr ZC() {
    return this.ZL;
  }
  
  Ztcd ZX() {
    return new Ztcd(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */