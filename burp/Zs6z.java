package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zs6z extends MouseAdapter {
  final Zrha ZG;
  
  Zs6z(Zrha paramZrha) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (this.ZG.Zf.isSelected()) {
      boolean bool = this.ZG.Zc.isSelected();
      this.ZG.Zc.setSelected(!bool);
      this.ZG.Zl.setEnabled(!bool);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs6z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */