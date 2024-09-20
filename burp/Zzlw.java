package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzlw implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    String str = Zbnt.ZW();
    if (paramObject1 instanceof Zz4) {
      Zz4 zz4 = (Zz4)paramObject1;
      if (paramObject2 instanceof Zz4) {
        Zz4 zz41 = (Zz4)paramObject2;
        if (str == null)
          return zz4.Zru().compareTo(zz41.Zru()); 
      } 
    } 
    Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzlw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */