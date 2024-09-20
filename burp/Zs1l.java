package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zs1l extends MouseAdapter {
  final Zb50 ZP;
  
  Zs1l(Zb50 paramZb50) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    Ztpl ztpl = this.ZP.ZBC();
    if (paramMouseEvent.getClickCount() == 2) {
      Zvo1 zvo1 = ztpl.ZH();
      if (zvo1 instanceof Zg9m) {
        Zg9m zg9m = (Zg9m)zvo1;
        ztpl.ZL(zg9m);
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs1l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */