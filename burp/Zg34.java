package burp;

import java.awt.Component;

public class Zg34 {
  private final Zmrj Zb;
  
  private final Zxgc ZO;
  
  private final int Zi;
  
  private final Object Zc = new Object();
  
  private Component ZT;
  
  private int Zy = 0;
  
  Zg34(Zmrj paramZmrj, Zxgc paramZxgc, int paramInt) {
    this.Zb = paramZmrj;
    this.ZO = paramZxgc;
    this.Zi = paramInt;
  }
  
  private void Zf() {
    synchronized (this.Zc) {
      if (this.Zy++ == 0) {
        this.ZT = this.ZO.ZJ(Zeew.TARGET).getComponentAt(this.Zi);
        this.ZO.ZJ(Zeew.TARGET).setComponentAt(this.Zi, new Zg81());
        this.Zb.Z_();
      } 
    } 
  }
  
  private void Zv() {
    synchronized (this.Zc) {
      if (--this.Zy == 0) {
        this.Zb.Zy();
        this.ZO.ZJ(Zeew.TARGET).setComponentAt(this.Zi, this.ZT);
        this.ZT.repaint();
      } 
    } 
  }
  
  public void Zu(Zlli<Zt10> paramZlli) {
    paramZlli.ZE(Zt10.ZC, this::lambda$subscribeTo$0);
    paramZlli.ZE(Zt10.ZY, this::lambda$subscribeTo$1);
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    Zv();
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    Zf();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg34.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */