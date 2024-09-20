package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zrrz extends Zrgr {
  Zrrz(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe, true);
  }
  
  public boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    switch (ZC()) {
      case 0:
      case 1:
        try {
          byte[] arrayOfByte = paramZml3.ZC();
          Zz1p zz1p = paramZml3.Zi();
          try {
            this.ZN.reset(Zkb.Zo(arrayOfByte, zz1p.ZO(), arrayOfByte.length - zz1p.ZO()));
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
    Zuh.Zv(false, Zqf.Zk, ZC());
    return false;
  }
  
  public boolean ZQ(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    try {
      switch (ZC()) {
        case 0:
        case 1:
          return ZV(paramZml3, paramZrgd, paramZgb6, paramZz28, paramZr1j, paramZkh7);
        case 2:
        case 3:
          try {
            byte[] arrayOfByte = paramZml3.Zh();
            Zs68 zs68 = paramZml3.ZP();
            try {
              this.ZN.reset(Zkb.Zo(arrayOfByte, zs68.Zk, arrayOfByte.length - zs68.Zk));
            } catch (Exception exception) {
              throw a(null);
            } 
            try {
            
            } catch (Exception exception) {
              throw a(null);
            } 
            return (this.ZN.find() == ((ZC() == 2)));
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.UNEXPECTED);
            return false;
          } 
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, ZC());
    return false;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrrz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */