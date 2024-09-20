package burp;

import net.portswigger.Zrmr;
import net.portswigger.Zs7;
import net.portswigger.Zt0;
import net.portswigger.Zzz;

public class Zrcz extends Zrc8 {
  public Zrcz(Zio paramZio) {
    super(paramZio);
  }
  
  public void ZC(Zrmr paramZrmr) {
    int[] arrayOfInt = Zrc8.Zp();
    if (!paramZrmr.Zm9().isEmpty()) {
      this.Zx.ZG(Zmtz.ENUMERATION);
      if (arrayOfInt == null) {
        this.Zx.ZG(Zmtz.TEXT);
        return;
      } 
      return;
    } 
    this.Zx.ZG(Zmtz.TEXT);
  }
  
  public void ZY(Zs7 paramZs7) {
    this.Zx.ZG(Zmtz.NUMBER);
    this.Zx.ZR(Zxaq.NUMBER);
  }
  
  public void Zz(Zzz paramZzz) {
    this.Zx.ZG(Zmtz.NUMBER);
    this.Zx.ZR(Zxaq.NUMBER);
  }
  
  public void Zr(Zt0 paramZt0) {
    this.Zx.ZG(Zmtz.BOOLEAN);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrcz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */