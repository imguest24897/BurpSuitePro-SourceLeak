package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zl9k extends Zl9l {
  final int Zy;
  
  final Zlit Zi;
  
  final Zlbu ZR;
  
  Zl9k(Zlbu paramZlbu, int paramInt, Zlit paramZlit) {}
  
  public boolean Zy(Zzhb paramZzhb) {
    return (this.Zy > 0) ? true : (this.ZR.ZK.Za5() ? false : (!(this.ZR.ZK.Zal() && !this.ZR.Zi.ZB(this.Zi.Zdz()))));
  }
  
  public boolean Ze(Zrtx paramZrtx) {
    return (this.Zy > 0) ? true : (this.ZR.ZK.Za5() ? false : (!(this.ZR.ZK.Zal() && !this.ZR.Zi.ZG(this.Zi))));
  }
  
  public boolean Zt(Zmxt paramZmxt) {
    return this.ZR.ZK.ZaD() ? false : ((paramZmxt.Zq7().ZTU() == 4) ? false : this.ZR.ZL(this.Zi, paramZmxt, paramZmxt.Zq7(), paramZmxt.Zqf(), paramZmxt.ZuE()));
  }
  
  public boolean Za(Zg6u paramZg6u) {
    Zuh.Zb((paramZg6u.Zx4().ZTU() != 4), Zqf.Zr);
    return this.ZR.ZL(this.Zi, paramZg6u, paramZg6u.Zx4(), paramZg6u.Zxo(), paramZg6u.ZuE());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl9k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */