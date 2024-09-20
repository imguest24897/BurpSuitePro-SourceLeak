package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zkd9 implements Zkfj {
  private final Zkb4 Zc;
  
  Zkd9(Zkb4 paramZkb4) {
    this.Zc = paramZkb4;
  }
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    Zs2i zs2i = paramZbll.Zk.Zu(paramZxs7);
    List<Zl1r> list = ZJ(zs2i);
    Zvow zvow = paramZe3n.ZI().Zp(zs2i.ZE()).ZK(paramZbll.ZR).ZK(list);
    return Zlyy.Zf(paramZe3n.Za(), paramZe3n.ZN(), zvow, paramZxs7, this.Zc.Zm, this.Zc.ZR, 0, paramZbll.ZP);
  }
  
  private List<Zl1r> ZJ(Zs2i paramZs2i) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Zl8v.Za(Zkb.Zy(this.Zc.ZR), paramZs2i.ZE(), arrayList);
    Zl8v.Za(Zkb.Zy("&" + this.Zc.Zm + ";"), paramZs2i.ZE(), arrayList);
    if (arrayList.size() < 2) {
      arrayList.clear();
      Zuh.Zb((paramZs2i.ZL() == 0), Zqf.Zk);
      arrayList.addAll(paramZs2i.ZO());
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkd9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */