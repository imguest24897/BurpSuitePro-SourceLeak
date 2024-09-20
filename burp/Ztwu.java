package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztwu implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    String str = Zbnt.ZW();
    if (paramObject1 instanceof Zmzk) {
      Zmzk zmzk = (Zmzk)paramObject1;
      if (paramObject2 instanceof Zmzk) {
        Zmzk zmzk1 = (Zmzk)paramObject2;
        if (str == null)
          return zmzk.ZJ1().compareTo(zmzk1.ZJ1()); 
      } 
    } 
    Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */