package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zlr1 implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    if (!(paramObject1 instanceof Boolean) || !(paramObject2 instanceof Boolean)) {
      Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
      return 0;
    } 
    return ((Boolean)paramObject1).compareTo((Boolean)paramObject2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlr1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */