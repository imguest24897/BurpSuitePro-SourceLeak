package burp;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Zgvx implements Zrbc, Zrcg {
  private final Zl5x ZK;
  
  private final Zm8t ZM;
  
  private final List<Ze3n> Zu;
  
  private final List<Zts2> Zx;
  
  private Zgvx(Zl5x paramZl5x, Zm8t paramZm8t, List<Ze3n> paramList, List<Zts2> paramList1) {
    this.ZK = paramZl5x;
    this.ZM = paramZm8t;
    this.Zu = paramList;
    this.Zx = paramList1;
  }
  
  static <T extends Zlm2> T ZV(Zl5x paramZl5x, Zm8t paramZm8t, List<Ze3n> paramList, List<Zts2> paramList1) {
    return (T)new Zgvx(paramZl5x, paramZm8t, paramList, paramList1);
  }
  
  public Set<? extends Zmgr> Zc() {
    return Collections.singleton(this::lambda$getPassiveWorkItems$0);
  }
  
  public Set<? extends Zz09> Zs() {
    return Collections.emptySet();
  }
  
  private void lambda$getPassiveWorkItems$0(Zrj paramZrj, Zlsy paramZlsy) {
    this.Zu.clear();
    this.Zx.forEach(Zts2::Zo);
    this.Zx.clear();
    this.ZM.ZL(this.ZK);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */