package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ze3_ implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    if (!(paramObject1 instanceof Long) || !(paramObject2 instanceof Long)) {
      Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
      return 0;
    } 
    return ((Long)paramObject1).compareTo((Long)paramObject2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze3_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */