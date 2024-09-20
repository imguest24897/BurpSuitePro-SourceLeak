package burp;

import java.util.Iterator;
import java.util.List;

public class Zxol implements Zkol {
  private final Zgtz ZY;
  
  public Zxol() {
    this(new Zggr());
  }
  
  public Zxol(Zgtz paramZgtz) {
    this.ZY = paramZgtz;
  }
  
  public Zb3t Zu(Ztx4 paramZtx4, List<Zb3t> paramList) {
    List<Zb3t> list = this.ZY.ZO(paramList);
    Iterator<Zb3t> iterator = list.iterator();
    Zb3t zb3t = iterator.next();
    String str = Ze_k.Zv();
    while (iterator.hasNext()) {
      Zb3t zb3t1 = iterator.next();
      for (Zb3t zb3t2 : zb3t1.ZC()) {
        zb3t2.ZN(zb3t);
        if (str != null)
          break; 
      } 
      if (str != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Ze_k.ZT("mRsZQc"); 
    return zb3t;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxol.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */