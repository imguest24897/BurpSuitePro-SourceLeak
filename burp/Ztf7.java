package burp;

import java.util.Objects;

class Ztf7 {
  private final int Zc;
  
  private final Zrag Zr;
  
  private final Zmkx ZU;
  
  private final Zgrn ZJ;
  
  private final Runnable Zu;
  
  private final Ztwv Zw;
  
  private Ztf7(Zlli<Zt1n> paramZlli, int paramInt, Zrag paramZrag, Zmkx paramZmkx, Ztwv paramZtwv, Runnable paramRunnable) {
    this.Zc = paramInt;
    this.Zr = paramZrag;
    this.ZU = paramZmkx;
    this.Zw = paramZtwv;
    this.Zu = paramRunnable;
    this.ZJ = paramZlli.ZE(Zt1n.ZY, this::lambda$new$0);
  }
  
  private void ZH() {
    this.ZJ.ZZ();
    this.Zr.Za(this.Zc);
    Objects.requireNonNull(this.ZU);
    this.Zw.Zx(this.ZU::ZY);
    this.Zu.run();
  }
  
  private void lambda$new$0(Zxr8 paramZxr8) {
    ZH();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztf7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */