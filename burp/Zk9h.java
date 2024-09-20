package burp;

import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zk9h {
  private final Ze3n ZL;
  
  private final Zz1i ZO;
  
  Zk9h(Ze3n paramZe3n, Zz1i paramZz1i) {
    this.ZO = paramZz1i;
    this.ZL = paramZe3n;
  }
  
  void Za() {
    boolean bool = Zr12.ZJ();
    Zs68 zs68 = this.ZL.Zp();
    if (zs68 != null && zs68.ZQ != null)
      for (Zx8_ zx8_ : zs68.ZQ) {
        Zuh.Zv((zx8_.ZZa() != null), Zqf.Zr, 1L);
        Zuh.Zv((this.ZL.ZA() != null), Zqf.Zr, 2L);
        Zuh.Zv((this.ZL.ZA().ZF() != null), Zqf.Zr, 3L);
        Zl5e zl5e = (this.ZO.ZDT(zx8_.ZZa().Zd1())).ZO;
        zl5e.Zz(Zkb.ZG(this.ZL.ZA().ZF().ZdH()), zx8_);
        if (!bool)
          break; 
      }  
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk9h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */