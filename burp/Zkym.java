package burp;

import java.awt.Component;

public class Zkym extends Zkyq {
  private final Zzys Zb;
  
  public Zkym(Ztj1 paramZtj1, Zzys paramZzys, Zmau paramZmau, Ztef paramZtef) {
    super(paramZtj1, paramZmau, paramZtef);
    this.Zb = paramZzys;
  }
  
  public void Zp(Component paramComponent) {}
  
  public boolean Za() {
    return (!ZX() && !ZY());
  }
  
  public boolean ZX() {
    return this.Zb.ZPw();
  }
  
  public boolean ZY() {
    return (this.Zb.ZNJ().Zf7().Zyq() == Zev0.FINISHED);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkym.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */