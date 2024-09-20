package burp;

import java.util.Collections;
import java.util.List;

public class Zzsx extends Zzpg {
  public Zzsx(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    Zb3t zb3t = this.ZC.ZC().get(1);
    this.Zy.Zf(paramList, zb3t);
    String str = Zzpg.Zr();
    this.ZR.addAll(this.Zy.Zf(Collections.singletonList(zb3t), this.ZC.ZC().get(2)));
    for (Zb3t zb3t1 : this.ZR) {
      this.Zy.Zv(zb3t1, zb3t);
      if (str != null)
        break; 
    } 
    this.ZR.clear();
    this.ZR.add(zb3t);
    ZQ();
    return this.ZR;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzsx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */