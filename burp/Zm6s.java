package burp;

import java.util.Collections;
import java.util.Set;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zm6s<T extends Zm75> {
  private final Set<T> ZY;
  
  private Zm6s(Set<T> paramSet) {
    this.ZY = paramSet;
  }
  
  public static <T extends Zm75> Zm6s<T> ZQ(T paramT) {
    return Zc(Collections.singleton(paramT));
  }
  
  public static <T extends Zm75> Zm6s<T> Zc(Set<T> paramSet) {
    Zuh.Zb((paramSet != null && !paramSet.isEmpty()), Zqf.Zk);
    return new Zm6s<>(paramSet);
  }
  
  public static <T extends Zm75> Zm6s<T> ZG() {
    return new Zm6s<>(Collections.emptySet());
  }
  
  public Set<T> Za() {
    return this.ZY;
  }
  
  public int ZF() {
    return this.ZY.size();
  }
  
  public boolean ZJ() {
    return (this.ZY == null || this.ZY.isEmpty());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm6s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */