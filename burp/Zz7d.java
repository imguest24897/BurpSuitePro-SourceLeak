package burp;

import java.awt.Component;

public class Zz7d {
  private final boolean ZL;
  
  private final Zgxf ZV;
  
  private final Component Zt;
  
  private final Zt80 Z_;
  
  private final Zr_4 Zl;
  
  public Zz7d(boolean paramBoolean, Zgxf paramZgxf, Component paramComponent, Zt80 paramZt80, Zr_4 paramZr_4) {
    this.ZL = paramBoolean;
    this.ZV = paramZgxf;
    this.Zt = paramComponent;
    this.Z_ = paramZt80;
    this.Zl = paramZr_4;
  }
  
  public boolean ZL(Ze3h paramZe3h) {
    if (paramZe3h.ZF())
      return true; 
    Zz_1 zz_1 = paramZe3h.ZJ();
    Zxya zxya = (Zxya)zz_1.Z_();
    Zstu zstu = zxya.Zh();
    if (zstu == null)
      zstu = this.ZV.ZU(zz_1).Zp(this.Zl); 
    this.Z_.Zj(zxya.Zq(), zstu, this.ZL, this.Zt);
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz7d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */