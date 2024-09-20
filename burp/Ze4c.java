package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ze4c implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    if (paramObject1 == null && paramObject2 == null)
      return 0; 
    if (paramObject1 == null)
      return -1; 
    if (paramObject2 == null)
      return 1; 
    if (!(paramObject1 instanceof String) || !(paramObject2 instanceof String)) {
      Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
      return 0;
    } 
    byte b1 = Zls9.Zq((String)paramObject1);
    byte b2 = Zls9.Zq((String)paramObject2);
    return Byte.compare(b1, b2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze4c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */