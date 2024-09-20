package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;

class Zti2 implements Zky2 {
  final Zba8 ZQ;
  
  private Zti2(Zba8 paramZba8) {}
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (!this.ZQ.Zl)
      return; 
    paramInt1 = this.ZQ.Zf.convertRowIndexToModel(paramInt1);
    if (paramInt2 == 0)
      this.ZQ.ZN(paramInt1); 
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    this.ZQ.ZC.ZS(paramPoint, this.ZQ.Zl);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zti2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */