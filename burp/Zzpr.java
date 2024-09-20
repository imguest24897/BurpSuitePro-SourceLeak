package burp;

import java.util.List;

public class Zzpr extends Zzpg {
  public Zzpr(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    String str = Zzpg.Zr();
    if (!this.Zy.Zi(this.ZC))
      return paramList; 
    for (Zb3t zb3t : paramList) {
      this.Zy.Zv(zb3t, this.ZC);
      if (str != null)
        break; 
    } 
    this.ZR.add(this.ZC);
    return this.ZR;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */