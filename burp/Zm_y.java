package burp;

import java.util.Iterator;
import java.util.List;

public class Zm_y implements Zkol {
  private final Zgtz Zx;
  
  public Zm_y() {
    this(new Zggr());
  }
  
  public Zm_y(Zgtz paramZgtz) {
    this.Zx = paramZgtz;
  }
  
  public Zb3t Zu(Ztx4 paramZtx4, List<Zb3t> paramList) {
    List<Zb3t> list = this.Zx.ZO(paramList);
    Iterator<Zb3t> iterator = list.iterator();
    Zb3t zb3t = iterator.next();
    String str = Ze_k.Zv();
    while (iterator.hasNext()) {
      ((Zb3t)iterator.next()).ZN(zb3t);
      if (str != null) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    return zb3t;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm_y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */