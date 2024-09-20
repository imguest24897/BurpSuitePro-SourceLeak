package burp;

import java.util.IdentityHashMap;
import java.util.Map;

class Zrry {
  private final Map<Ztbx, Zz_q> ZL = new IdentityHashMap<>();
  
  void ZL(Ztbx paramZtbx, Zz_q paramZz_q) {
    this.ZL.put(paramZtbx, paramZz_q);
  }
  
  Iterable<Zz_q> ZE() {
    return this.ZL.values();
  }
  
  Zrcw Za(Ztbx paramZtbx) {
    Zz_q zz_q = this.ZL.get(paramZtbx);
    return (new Zg22()).Zn(zz_q, paramZtbx.Zf, paramZtbx.ZP, paramZtbx.Zt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */