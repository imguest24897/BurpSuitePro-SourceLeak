package burp;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

public class Zbos implements Zrcg {
  private final Zrbc ZU;
  
  private Zbos(Zrbc paramZrbc) {
    this.ZU = paramZrbc;
  }
  
  public Set<? extends Zmgr> Zc() {
    return Collections.singleton(this::lambda$getPassiveWorkItems$0);
  }
  
  public static Zrcg ZR(Zrbc paramZrbc) {
    return new Zbos(paramZrbc);
  }
  
  private void lambda$getPassiveWorkItems$0(Zrj paramZrj, Zlsy paramZlsy) {
    Objects.requireNonNull(paramZlsy);
    this.ZU.Zs().forEach(paramZlsy::ZR);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbos.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */