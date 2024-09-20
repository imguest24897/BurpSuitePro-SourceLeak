package burp;

import java.util.Collections;
import java.util.Set;

public class Zxkk implements Zrcg, Zmgr {
  private final Zz_q Zy;
  
  private final Zbnt Zl;
  
  private final Zb9t ZB;
  
  Zxkk(Zz_q paramZz_q, Zbnt paramZbnt, Zb9t paramZb9t) {
    this.Zy = paramZz_q;
    this.Zl = paramZbnt;
    this.ZB = paramZb9t;
  }
  
  public Set<? extends Zmgr> Zc() {
    return Collections.singleton(this);
  }
  
  public void Za(Zrj paramZrj, Zlsy paramZlsy) {
    Ze3n ze3n = this.ZB.ZG();
    if (ze3n != null)
      this.Zy.ZN(Zspj.Zg(this.Zl, ze3n.ZA().ZF(), ze3n.Zp())); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxkk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */