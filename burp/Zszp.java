package burp;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Zszp implements Zrbc, Zmgr {
  private final Zbnt ZQ;
  
  private final Zb9t Zu;
  
  private final Zm7h ZL;
  
  private final Zrry Zz;
  
  Zszp(Zbnt paramZbnt, Zb9t paramZb9t, Zm7h paramZm7h, Zrry paramZrry) {
    this.ZQ = paramZbnt;
    this.Zu = paramZb9t;
    this.ZL = paramZm7h;
    this.Zz = paramZrry;
  }
  
  public Set<? extends Zmgr> Zc() {
    return Collections.singleton(this);
  }
  
  public Set<? extends Zz09> Zs() {
    return Collections.emptySet();
  }
  
  public void Za(Zrj paramZrj, Zlsy paramZlsy) {
    int i = Zz45.ZU();
    Ze3n ze3n = this.Zu.ZG();
    List list = (List)((ze3n == null) ? Collections.emptyList() : ze3n.Zo());
    for (Zxs7 zxs7 : list) {
      for (Ztbx ztbx : this.ZL.Zz(zxs7)) {
        Zz_q zz_q = new Zz_q();
        zz_q.ZN(Zspj.Zg(this.ZQ, ztbx.Zf.ZF(), ztbx.Zt));
        this.Zz.ZL(ztbx, zz_q);
        if (i != 0)
          break; 
      } 
      if (i != 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zszp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */