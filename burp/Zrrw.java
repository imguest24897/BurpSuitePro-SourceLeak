package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrrw extends Zrgr {
  public Zrrw(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe, false);
  }
  
  public boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    Zuh.Zb(false, Zqf.ZC);
    return false;
  }
  
  public boolean ZQ(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    short s = (paramZml3.ZP()).ZH.Zj;
    try {
      if (0 == s)
        return false; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      try {
        switch (ZC()) {
          case 0:
          case 1:
            try {
            
            } catch (Exception exception) {
              throw a(null);
            } 
            try {
            
            } catch (Exception exception) {
              throw a(null);
            } 
            return (Zk8m.Zu(s) == ((ZC() == 0)));
          case 2:
          case 3:
            try {
            
            } catch (Exception exception) {
              throw a(null);
            } 
            try {
            
            } catch (Exception exception) {
              throw a(null);
            } 
            return (Zk8m.ZA(s) == ((ZC() == 2)));
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
  
  public String Zf() {
    return null;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrrw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */