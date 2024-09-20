package burp;

import java.util.List;

public class Ztjs implements Zkol {
  private final Zgtz Zp;
  
  public Ztjs() {
    this(new Zggr());
  }
  
  public Ztjs(Zgtz paramZgtz) {
    this.Zp = paramZgtz;
  }
  
  public Zb3t Zu(Ztx4 paramZtx4, List<Zb3t> paramList) {
    List<Zb3t> list = this.Zp.ZO(paramList);
    Zb3t zb3t = list.get(0);
    return Zl19.ZI(zb3t) ? zb3t : new Zgcb(list);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztjs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */