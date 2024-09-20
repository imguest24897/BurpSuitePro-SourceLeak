package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zrgt extends Zrgr {
  protected Zrgt(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe, true);
  }
  
  public boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    switch (ZC()) {
      case 0:
      case 1:
        return (ZH((paramZml3.Zi()).ZV) == ((ZC() == 0)));
    } 
    Zuh.Zv(false, Zqf.Zk, ZC());
    return false;
  }
  
  public boolean ZQ(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    switch (ZC()) {
      case 0:
      case 1:
        return ZV(paramZml3, paramZrgd, paramZgb6, paramZz28, paramZr1j, paramZkh7);
      case 2:
      case 3:
        return (ZO((paramZml3.ZP()).ZN) == ((ZC() == 2)));
    } 
    Zuh.Zv(false, Zqf.Zk, ZC());
    return false;
  }
  
  protected abstract boolean ZH(List<Zt8g> paramList);
  
  protected abstract boolean ZO(List<Ztbr> paramList);
  
  protected boolean ZS(String paramString) {
    try {
      this.ZN.reset(paramString);
      if (this.ZN.find())
        return true; 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrgt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */