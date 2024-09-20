package burp;

import java.awt.Component;

public class Zltv {
  private final Component ZQ;
  
  private final Zgxf Zb;
  
  private final Zb0h ZO;
  
  private final Zskh Z_;
  
  private final Zbnt ZR;
  
  public Zltv(Component paramComponent, Zgxf paramZgxf, Zb0h paramZb0h, Zskh paramZskh, Zbnt paramZbnt) {
    this.ZQ = paramComponent;
    this.Zb = paramZgxf;
    this.ZO = paramZb0h;
    this.Z_ = paramZskh;
    this.ZR = paramZbnt;
  }
  
  public boolean ZR(Ze3h paramZe3h) {
    if (paramZe3h.Zw() == 1) {
      Zstu zstu = this.Zb.ZU(paramZe3h.ZJ());
      Zz1p zz1p = Zghc.ZY(((Zxya)paramZe3h.ZJ().Z_()).Zy(), zstu, (byte)2, this.ZR);
      String str = Zt5w.ZP(zz1p, zstu, this.ZQ, this.Z_);
      if (!str.isEmpty())
        this.ZO.ZR(str); 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zltv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */