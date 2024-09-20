package burp;

import java.util.Collections;
import java.util.List;

public class Zzsj extends Zzpg {
  public Zzsj(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    int i = this.ZC.ZC().size();
    Zb3t zb3t = this.ZC.ZC().get(1);
    String str = Zzpg.Zr();
    this.Zy.Zf(paramList, zb3t);
    this.ZR.addAll(this.Zy.Zf(Collections.singletonList(zb3t), this.ZC.ZC().get(2)));
    if (i > 4) {
      this.ZR.addAll(this.Zy.Zf(Collections.singletonList(zb3t), this.ZC.ZC().get(4)));
      if (str != null) {
        this.ZR.add(zb3t);
        ZB();
        return this.ZR;
      } 
      ZB();
      return this.ZR;
    } 
    this.ZR.add(zb3t);
    ZB();
    return this.ZR;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzsj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */