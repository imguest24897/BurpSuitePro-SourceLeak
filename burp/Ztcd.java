package burp;

import java.util.function.BiFunction;

public class Ztcd {
  private Zlgm Zg = Ztcd::lambda$new$0;
  
  private boolean Zp = false;
  
  private Zxgr Za = Ztcd::lambda$new$1;
  
  private BiFunction<Zxs7, Boolean, Zi4> ZR = Ztcd::lambda$new$2;
  
  Ztcd() {}
  
  private Ztcd(Zg_n paramZg_n) {
    this.Zg = paramZg_n.Zn;
    this.Zp = paramZg_n.ZN;
    this.Za = paramZg_n.ZL;
    this.ZR = paramZg_n.Zz;
  }
  
  public Ztcd ZM(Zlgm paramZlgm) {
    this.Zg = paramZlgm;
    return this;
  }
  
  public Ztcd Zg(boolean paramBoolean) {
    this.Zp = paramBoolean;
    return this;
  }
  
  public Ztcd ZP(Zxgr paramZxgr) {
    this.Za = paramZxgr;
    return this;
  }
  
  public Ztcd ZE(BiFunction<Zxs7, Boolean, Zi4> paramBiFunction) {
    this.ZR = paramBiFunction;
    return this;
  }
  
  Zg_n ZW() {
    return new Zg_n(this);
  }
  
  private static Zi4 lambda$new$2(Zxs7 paramZxs7, Boolean paramBoolean) {
    return new Zi4(paramZxs7.Zl().ZEp(), paramZxs7.Z_(), paramZxs7.ZN());
  }
  
  private static boolean lambda$new$1(Zxs7 paramZxs7) {
    return false;
  }
  
  private static boolean lambda$new$0(Zrdu paramZrdu, String paramString) {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztcd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */