package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbe implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    if (!(paramObject1 instanceof Zzog) || !(paramObject2 instanceof Zzog)) {
      Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
      return 0;
    } 
    int i = ((Zzog)paramObject1).Zk();
    int j = ((Zzog)paramObject2).Zk();
    return Integer.compare(i, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */