package burp;

import java.util.Objects;

public class Ztfx {
  private final Zs98 Zp;
  
  private final Zlit Zz;
  
  private final Zz28 Zb;
  
  public Ztfx(Zs98 paramZs98, Zlit paramZlit, Zz28 paramZz28) {
    this.Zp = paramZs98;
    this.Zz = paramZlit;
    this.Zb = paramZz28;
  }
  
  public boolean Zw() {
    return (this.Zp.ZCZ().contains(Ze48.EVERYTHING) || this.Zp.ZCZ().contains(Ze48.ITEM_ITSELF));
  }
  
  public boolean ZW(Zlit paramZlit) {
    return this.Zp.ZCZ().contains(Ze48.EVERYTHING) ? true : ((this.Zp.ZCZ().contains(Ze48.SAME_DOMAIN) && Zz(this.Zz, paramZlit)) ? true : ((this.Zp.ZCZ().contains(Ze48.LOOK_AT_SCOPE) && this.Zb.ZG(paramZlit))));
  }
  
  private static boolean Zz(Zlit paramZlit1, Zlit paramZlit2) {
    return Objects.equals(paramZlit1.Zd1(), paramZlit2.Zd1());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztfx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */