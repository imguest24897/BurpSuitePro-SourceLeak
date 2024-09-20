package burp;

import java.util.List;

public class Zzpt extends Zzpg {
  public Zzpt(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    String str1 = Zzpg.Zr();
    for (Zb3t zb3t1 : paramList) {
      this.Zy.Zv(zb3t1, this.ZC);
      if (str1 != null)
        break; 
    } 
    String str2 = ZN();
    Zb3t zb3t = Ze(this.ZC, (str2 == null));
    if (str2 != null)
      while (zb3t != null && !ZE(zb3t, str2)) {
        zb3t = Ze(zb3t, false);
        if (str1 != null)
          break; 
      }  
    if (zb3t != null) {
      this.ZR.clear();
      Zf(str2, this.ZC);
      if (str1 != null) {
        this.ZR.add(this.ZC);
        return this.ZR;
      } 
      return this.ZR;
    } 
    this.ZR.add(this.ZC);
    return this.ZR;
  }
  
  private Zb3t Ze(Zb3t paramZb3t, boolean paramBoolean) {
    String str = Zzpg.Zr();
    Zb3t zb3t = paramZb3t.ZI();
    if (paramBoolean)
      while (zb3t != null && !Zl19.Zt(zb3t)) {
        zb3t = zb3t.ZI();
        if (str != null)
          break; 
      }  
    return zb3t;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */