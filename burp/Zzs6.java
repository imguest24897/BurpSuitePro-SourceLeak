package burp;

import java.util.List;

public class Zzs6 extends Zzpg {
  public Zzs6(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    Zb3t zb3t1 = this.ZC.ZC().get(1);
    this.Zy.Zf(paramList, zb3t1);
    Zb3t zb3t2 = this.ZC.ZC().get(2);
    String str = Zzpg.Zr();
    for (Zb3t zb3t : zb3t2.ZC()) {
      if ((Zl19.ZU(zb3t) || Zl19.ZQ(zb3t)) && !Zj(zb3t1, zb3t)) {
        this.ZR.add(zb3t1);
        this.ZR = this.Zy.Zf(this.ZR, zb3t);
      } 
      if (str != null)
        break; 
    } 
    ZQ();
    this.ZR.add(zb3t1);
    return this.ZR;
  }
  
  private boolean Zj(Zb3t paramZb3t1, Zb3t paramZb3t2) {
    List list = paramZb3t1.<List>ZO(Zxc6.ExecutionHops);
    return (list == null) ? false : (list.contains(paramZb3t2));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzs6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */