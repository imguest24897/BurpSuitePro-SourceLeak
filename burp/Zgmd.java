package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgmd implements Comparator<Object> {
  private final boolean ZV;
  
  public Zgmd(boolean paramBoolean) {
    this.ZV = paramBoolean;
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    if (!(paramObject1 instanceof Long) || !(paramObject2 instanceof Long)) {
      Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
      return 0;
    } 
    long l1 = ((Long)paramObject1).longValue();
    long l2 = ((Long)paramObject2).longValue();
    return (l1 == l2) ? 0 : ((l1 == 0L) ? (this.ZV ? -1 : 1) : ((l2 == 0L) ? (this.ZV ? 1 : -1) : ((l1 < l2) ? -1 : 1)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgmd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */