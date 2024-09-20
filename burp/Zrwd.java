package burp;

import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrwd implements Zkfj {
  private final Zzi5 ZW;
  
  public Zrwd(Zzi5 paramZzi5) {
    this.ZW = paramZzi5;
  }
  
  public Zsqx<Zrdb> Zt(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List<Zer0> paramList) {
    Zlp9 zlp9 = paramZbll.Zk.ZG();
    switch (Zgbq.Zv[zlp9.ordinal()]) {
      case 1:
        return (new Zmzo()).Zt(paramZe3n, paramZxs7, paramZer0, paramZbll, paramList);
      case 2:
        return Zg24.Zi(paramZe3n, paramZxs7, paramZbll);
      case 3:
        return Zg20.ZX(this.ZW, paramZe3n, paramZxs7, paramZbll);
      case 4:
      case 5:
        return Zg2_.ZF(paramZe3n, paramZxs7, Zi(zlp9), paramZbll);
    } 
    Zuh.Zv(false, Zqf.Zk, zlp9.Zz());
    return null;
  }
  
  private static byte Zi(Zlp9 paramZlp9) {
    switch (Zgbq.Zv[paramZlp9.ordinal()]) {
      case 4:
        return 18;
      case 5:
        return 19;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrwd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */