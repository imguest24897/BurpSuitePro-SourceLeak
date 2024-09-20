package burp;

import java.util.Comparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsgt implements Comparator<Object> {
  private final boolean ZT;
  
  public Zsgt(boolean paramBoolean) {
    this.ZT = paramBoolean;
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    if (!(paramObject1 instanceof Integer) || !(paramObject2 instanceof Integer)) {
      Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
      return 0;
    } 
    int i = ((Integer)paramObject1).intValue();
    int j = ((Integer)paramObject2).intValue();
    return (i == j) ? 0 : ((i == 0) ? (this.ZT ? -1 : 1) : ((j == 0) ? (this.ZT ? 1 : -1) : ((i < j) ? -1 : 1)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsgt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */