package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zrkm extends MouseAdapter {
  final Zkt1 Zn;
  
  Zrkm(Zkt1 paramZkt1) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    this.Zn.ZG = this.Zn.ZY.getSelectedIndex();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrkm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */