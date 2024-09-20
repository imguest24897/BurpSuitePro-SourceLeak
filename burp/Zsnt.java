package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zsnt {
  private final Iterator<Zb3t> ZF;
  
  private final Zb3t Zw;
  
  public Zsnt(Zb3t paramZb3t) {
    this.Zw = paramZb3t;
    List<Zb3t> list = paramZb3t.<List>ZO(Zxc6.ExecutionHops);
    if (list == null)
      list = new ArrayList(0); 
    this.ZF = list.iterator();
  }
  
  public Zb3t Zn() {
    return this.ZF.hasNext() ? this.ZF.next() : null;
  }
  
  public Zb3t ZX() {
    return this.Zw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsnt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */