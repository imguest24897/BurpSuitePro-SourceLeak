package burp;

import java.util.List;

public class Zzpy extends Zzpg {
  public Zzpy(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    return ZS(paramList, this.ZC);
  }
  
  public List<Zb3t> ZS(List<Zb3t> paramList, Zb3t paramZb3t) {
    String str = Zzpg.Zr();
    for (Zb3t zb3t : paramList) {
      this.Zy.Zv(zb3t, paramZb3t);
      if (str != null)
        break; 
    } 
    List<Zb3t> list = paramZb3t.ZI().ZC();
    byte b = 0;
    for (Zb3t zb3t : list) {
      b++;
      if (zb3t == paramZb3t || str != null)
        break; 
    } 
    if (b == paramZb3t.ZI().ZC().size())
      return paramList; 
    this.ZR.clear();
    this.ZR.add(paramZb3t);
    while (!this.ZR.isEmpty() && b < list.size()) {
      Zb3t zb3t = list.get(b++);
      if (Zl19.ZU(zb3t) || Zl19.ZQ(zb3t))
        break; 
      if (this.Zy.Zi(zb3t))
        this.ZR = this.Zy.Zf(this.ZR, zb3t); 
      if (str != null)
        break; 
    } 
    return this.ZR;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */