package burp;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Znn {
  private final Set<Zloc> ZB = ConcurrentHashMap.newKeySet();
  
  public boolean ZO(Ztj paramZtj, Zmzk paramZmzk) {
    return !this.ZB.add(new Zloc(paramZtj.Zc(), paramZmzk));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Znn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */