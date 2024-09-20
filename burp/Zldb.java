package burp;

import java.awt.Component;

public class Zldb {
  private Component ZX;
  
  private Zt80 ZF;
  
  public Zldb(Component paramComponent, Zt80 paramZt80) {
    this.ZX = paramComponent;
    this.ZF = paramZt80;
  }
  
  public boolean ZT(Ze3h paramZe3h) {
    if (!paramZe3h.ZF() && ((Zxya)paramZe3h.ZJ().Z_()).Zm() != null)
      this.ZF.Zf(((Zxya)paramZe3h.ZJ().Z_()).Zq(), ((Zxya)paramZe3h.ZJ().Z_()).Zm(), this.ZX, (byte)0); 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */