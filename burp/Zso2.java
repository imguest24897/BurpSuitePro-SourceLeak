package burp;

import java.util.Collections;
import java.util.Set;

public class Zso2 implements Zrbc, Zrcg {
  private final Zl5x Zk;
  
  private final Zbza Zh;
  
  private final Zr46 ZK;
  
  public Zso2(Zl5x paramZl5x, Zbza paramZbza, Zr46 paramZr46) {
    this.Zk = paramZl5x;
    this.Zh = paramZbza;
    this.ZK = paramZr46;
  }
  
  public Set<? extends Zmgr> Zc() {
    return Collections.singleton(this::lambda$getPassiveWorkItems$0);
  }
  
  public Set<? extends Zz09> Zs() {
    return Collections.emptySet();
  }
  
  private void lambda$getPassiveWorkItems$0(Zrj paramZrj, Zlsy paramZlsy) {
    this.ZK.ZD(this.Zh, this.Zk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zso2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */