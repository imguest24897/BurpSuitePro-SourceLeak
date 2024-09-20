package burp;

import java.util.List;

public class Zzp5 extends Zzpg {
  public Zzp5(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    String str1 = Zzpg.Zr();
    for (Zb3t zb3t : paramList) {
      this.Zy.Zv(zb3t, this.ZC);
      if (str1 != null)
        break; 
    } 
    String str2 = ZN();
    Zb3t zb3t1 = Zs(this.ZC);
    Zb3t zb3t2 = zb3t1;
    while (str2 != null && zb3t2 != null && !ZE(zb3t2, str2)) {
      zb3t2 = Zs(zb3t2);
      if (str1 != null)
        break; 
    } 
    if (zb3t2 == null)
      zb3t2 = zb3t1; 
    if (zb3t2 != null) {
      int i = ZW(zb3t2);
      if (i != -1)
        this.Zy.Zv(this.ZC, zb3t2.ZC().get(i)); 
      this.ZR.clear();
      if (str1 != null) {
        this.ZR.add(this.ZC);
        return this.ZR;
      } 
      return this.ZR;
    } 
    this.ZR.add(this.ZC);
    return this.ZR;
  }
  
  private Zb3t Zs(Zb3t paramZb3t) {
    String str = Zzpg.Zr();
    Zb3t zb3t = paramZb3t.ZI();
    while (zb3t != null && !Zl19.Zv(zb3t)) {
      zb3t = zb3t.ZI();
      if (str != null)
        break; 
    } 
    return zb3t;
  }
  
  private int ZW(Zb3t paramZb3t) {
    switch (Zmh2.Zl[(((Zgcc)paramZb3t.ZC().get(0)).ZK()).ZE.ordinal()]) {
      case 1:
        return Zx(paramZb3t);
      case 2:
        return 1;
      case 3:
        return 3;
      case 4:
        return 1;
    } 
    return -1;
  }
  
  private int Zx(Zb3t paramZb3t) {
    int i = paramZb3t.ZC().size();
    switch (i) {
      case 9:
        return 6;
      case 8:
        return Zl19.ZR(paramZb3t.ZC().get(4)) ? 4 : 5;
      case 7:
        return 2;
      case 5:
        return 2;
    } 
    return -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzp5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */