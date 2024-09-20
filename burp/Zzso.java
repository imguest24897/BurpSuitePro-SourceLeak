package burp;

import java.util.Collections;
import java.util.List;

public class Zzso extends Zzpg {
  public Zzso(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    Zb3t zb3t1 = this.ZC.ZC().get(1);
    Zb3t zb3t2 = this.ZC.ZC().get(3);
    String str = Zzpg.Zr();
    this.ZR.addAll(this.Zy.Zf(Collections.singletonList(zb3t2), zb3t1));
    for (Zb3t zb3t : this.ZR) {
      this.Zy.Zv(zb3t, zb3t2);
      if (str != null)
        break; 
    } 
    List list = zb3t2.<List>ZO(Zxc6.ExecutionHops);
    if (list != null)
      for (Zb3t zb3t : list) {
        for (Zb3t zb3t3 : paramList) {
          this.Zy.Zv(zb3t3, zb3t);
          if (str != null)
            break; 
        } 
        if (str != null)
          break; 
      }  
    this.ZR.clear();
    this.ZR.add(zb3t2);
    ZQ();
    return this.ZR;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzso.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */