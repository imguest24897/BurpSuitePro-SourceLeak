package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Zmpw implements Zt02 {
  private final Map<Integer, Integer> ZX = new HashMap<>();
  
  public void ZB(Zlli<Zt35> paramZlli) {
    paramZlli.ZE(Zt35.ZW, this::lambda$subscribeTo$0);
  }
  
  private void ZW(Ztas paramZtas) {
    Zrp0 zrp0 = paramZtas.ZUi().Zsg();
    Zl_ zl_ = (Zl_)zrp0;
    boolean bool = (zrp0 instanceof Zl_) ? Zd(zl_, paramZtas.ZUi().ZsD()) : true;
    if (bool != -1)
      this.ZX.compute(Integer.valueOf(bool), Zmpw::lambda$roomEntered$1); 
  }
  
  private int Zd(Zl_ paramZl_, Zlru paramZlru) {
    Zeun zeun = new Zeun();
    paramZl_.Zfy().ZmJ().forEach(zeun::lambda$getLinkTextChecksum$2);
    zeun.Zh(paramZlru.hashCode());
    return zeun.ZS();
  }
  
  public Zsw9 Zf() {
    return new Ztze(this);
  }
  
  private static void lambda$getLinkTextChecksum$2(Zeun paramZeun, Zzjv paramZzjv) {
    paramZeun.Zh((paramZzjv.Zxl()).id);
    paramZeun.Zk(paramZzjv.ZxZ());
  }
  
  private static Integer lambda$roomEntered$1(Integer paramInteger1, Integer paramInteger2) {
    return Integer.valueOf(((Integer)Objects.<Integer>requireNonNullElse(paramInteger2, Integer.valueOf(0))).intValue() + 1);
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZW);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmpw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */