package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;

class Zep9 implements Zky2 {
  final Zl21 ZV;
  
  final Zbwi Zn;
  
  Zep9(Zbwi paramZbwi, Zl21 paramZl21) {}
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    List<Zkvj> list = this.Zn.Zb(paramPoint);
    if (!list.isEmpty())
      this.ZV.Za(list, paramPoint); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zep9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */