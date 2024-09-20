package burp;

import java.awt.Component;

public class Zre_ {
  private final Zmrj Zt;
  
  private final Ztwv Zb;
  
  private Zsqc Zv;
  
  public Zre_(Zmrj paramZmrj, Ztwv paramZtwv) {
    this.Zb = paramZtwv;
    this.Zt = paramZmrj.Zn();
  }
  
  public void ZQ(Zsqc paramZsqc) {
    this.Zv = paramZsqc;
  }
  
  public Zmrj ZY() {
    return this.Zt;
  }
  
  public Component Zg() {
    return this.Zt.ZC();
  }
  
  public void ZH() {
    this.Zb.Zx(this::lambda$dispose$0);
  }
  
  private void lambda$dispose$0() {
    this.Zt.Zm.ZB();
    this.Zv.Zg();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zre_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */