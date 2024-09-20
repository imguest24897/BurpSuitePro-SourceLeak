package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zg5h extends MouseAdapter {
  final String ZJ;
  
  final Zr94 Zq;
  
  Zg5h(Zr94 paramZr94, String paramString) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.Zq.ZF.setText(this.ZJ);
    this.Zq.ZF.ZM("");
    this.Zq.ZF.removeMouseListener(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg5h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */