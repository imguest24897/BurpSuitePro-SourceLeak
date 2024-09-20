package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zrrs extends Zrgr {
  Zrrs(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe, true);
  }
  
  public boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    Zuh.Zb(false, Zqf.ZC);
    return false;
  }
  
  public boolean ZQ(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    try {
      try {
        this.ZN.reset(Short.toString((paramZml3.ZP()).Zb));
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      return (this.ZN.find() == ((ZC() == 0)));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrrs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */