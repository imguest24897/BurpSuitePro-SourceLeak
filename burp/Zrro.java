package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zrro extends Zrgr {
  Zrro(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe, true);
  }
  
  public boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    Zz1p zz1p;
    switch (ZC()) {
      case 0:
      case 1:
        zz1p = paramZml3.Zi();
        return (Z_(zz1p.ZG()) == ((ZC() == 0)));
    } 
    Zuh.Zv(false, Zqf.Zk, ZC());
    return false;
  }
  
  public boolean ZQ(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    Zs68 zs68;
    switch (ZC()) {
      case 0:
      case 1:
        return ZV(paramZml3, paramZrgd, paramZgb6, paramZz28, paramZr1j, paramZkh7);
      case 2:
      case 3:
        zs68 = paramZml3.ZP();
        return (Z_(zs68.ZP) == ((ZC() == 2)));
    } 
    Zuh.Zv(false, Zqf.Zk, ZC());
    return false;
  }
  
  private boolean Z_(List<String> paramList) {
    int i = Zrgr.ZU();
    for (String str : paramList) {
      try {
        this.ZN.reset(str);
        if (this.ZN.find())
          return true; 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      } 
      if (i != 0)
        break; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrro.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */