package burp;

import java.util.Objects;
import java.util.Optional;

public class Zxni implements Zzcu {
  private final Zsiv ZE;
  
  private final Zt02 Zj;
  
  private final Zg0y Zh;
  
  private final Zz1m<Zt18> ZA;
  
  private final Zmv7 Zm;
  
  public Zxni(Zg0y paramZg0y, Zz1m<Zt18> paramZz1m, Zr69 paramZr69, Zl7h paramZl7h) {
    this.ZE = paramZl7h.ZVv();
    this.Zj = paramZr69.Zf();
    this.Zh = paramZg0y;
    this.ZA = paramZz1m;
    this.Zm = paramZr69.ZD();
  }
  
  public synchronized Optional<Ztc6> ZV(Ztiq paramZtiq) {
    boolean bool = this.ZE.ZZk();
    if (bool) {
      this.Zm.Zy(Zrp6.DEBUG, Zlq7.NO_PENDING_EXITS, new Object[0]);
      return Optional.empty();
    } 
    this.Zm.Zy(Zrp6.DEBUG, Zlq7.FIND_NEXT_PATH_FROM, new Object[] { paramZtiq });
    this.Zm.Zy(Zrp6.DEBUG, Zlq7.PENDING_EXITS, new Object[] { this.ZE });
    Objects.requireNonNull(this.ZE);
    Optional<Ztc6> optional = this.Zh.ZE(paramZtiq.ZO(this.Zj.Zf()).ZY(this.ZE::ZL));
    optional.ifPresentOrElse(this::lambda$getNextPath$0, this::lambda$getNextPath$1);
    return optional;
  }
  
  private void lambda$getNextPath$1() {
    this.Zm.Zy(Zrp6.INFO, Zlq7.NO_PATH_TO_NEXT_EXIT, new Object[0]);
  }
  
  private void lambda$getNextPath$0(Ztc6 paramZtc6) {
    this.ZA.ZD(new Zxr8(Zt18.Zp, paramZtc6.ZY()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxni.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */