package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zkgc implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    if (!(paramObject1 instanceof String) || !(paramObject2 instanceof String)) {
      Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
      return 0;
    } 
    return ((String)paramObject1).compareTo((String)paramObject2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkgc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */