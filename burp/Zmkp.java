package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zmkp {
  private final Zm6x Zb;
  
  private final Zk9d Ze;
  
  Zmkp(Zm6x paramZm6x, Zk9d paramZk9d) {
    this.Zb = paramZm6x;
    this.Ze = paramZk9d;
  }
  
  void ZC(Zrxp paramZrxp) {
    Object object = paramZrxp.ZF6();
    Zb4k zb4k = paramZrxp.ZFR();
    if (zb4k.Z_())
      try {
        zb4k.Zy(object);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.RETHROWN);
        this.Ze.Zr(this.Zb, zb4k.ZY(), object, throwable);
      }  
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmkp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */