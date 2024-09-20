package burp;

import java.util.Comparator;
import java.util.Date;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zgg2 implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    if (paramObject1 == null && paramObject2 == null)
      return 0; 
    if (paramObject1 == null)
      return -1; 
    if (paramObject2 == null)
      return 1; 
    if (!(paramObject1 instanceof Date) || !(paramObject2 instanceof Date)) {
      Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
      return 0;
    } 
    return ((Date)paramObject1).compareTo((Date)paramObject2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgg2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */