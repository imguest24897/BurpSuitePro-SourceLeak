package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zmk9 implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    if (!(paramObject1 instanceof Zsyx) || !(paramObject2 instanceof Zsyx)) {
      Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
      return 0;
    } 
    int i = ((Zsyx)paramObject1).Zm();
    int j = ((Zsyx)paramObject2).Zm();
    return Integer.compare(i, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmk9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */