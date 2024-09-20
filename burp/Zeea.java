package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;

class Zeea implements Zky2 {
  private final Zli2 Zr;
  
  private final Zeda Zb;
  
  Zeea(Zli2 paramZli2, Zgso paramZgso, Zzzt paramZzzt) {
    this.Zr = paramZli2;
    this.Zb = new Zeda(paramZgso, paramZzzt);
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    Zgz6 zgz6 = this.Zr.Z_(paramPoint);
    if (zgz6.ZY()) {
      Zkj9 zkj9 = this.Zb.Za(zgz6.ZL(), paramComponent, new Zm3h(zgz6, paramComponent), zgz6.ZS(), paramMouseEvent);
      zkj9.show(paramComponent.getParent(), paramPoint.x, paramPoint.y);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeea.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */