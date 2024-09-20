package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zrr3 extends Zrgr {
  Zrr3(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe, true);
  }
  
  public boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    try {
      try {
        switch (ZC()) {
          case 0:
          case 1:
            try {
              this.ZN.reset((paramZml3.Zi()).Zo.toString());
            } catch (Exception exception) {
              throw a(null);
            } 
            try {
            
            } catch (Exception exception) {
              throw a(null);
            } 
            return (this.ZN.find() == ((ZC() == 0)));
          case 2:
            return paramZz28.ZG((paramZml3.Zi()).Zo);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      Zuh.Zv(false, Zqf.Zk, ZC());
      return false;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrr3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */