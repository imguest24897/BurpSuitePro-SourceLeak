package burp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;

public class Ztdj implements Zeak {
  private final Map<Zmzk, Lock> Zc;
  
  private final Ztbb ZF;
  
  public Ztdj(Ztbb paramZtbb) {
    this.ZF = paramZtbb;
    this.Zc = new ConcurrentHashMap<>();
  }
  
  public Lock ZA(Zmzk paramZmzk, Zxtv paramZxtv) {
    return (!paramZxtv.ZK() || !paramZmzk.ZJZ() || this.ZF.ZQ(paramZmzk)) ? Zrjh.ZP : this.Zc.computeIfAbsent(paramZmzk, Ztdj::lambda$retrieveLockFor$0);
  }
  
  private static Lock lambda$retrieveLockFor$0(Zmzk paramZmzk) {
    return new Zlj6();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztdj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */