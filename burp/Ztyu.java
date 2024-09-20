package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Ztyu extends MouseAdapter {
  final Zgol ZU;
  
  Ztyu(Zgol paramZgol) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (this.ZU.Zu.isSelected()) {
      boolean bool = this.ZU.Zv.isSelected();
      this.ZU.Zv.setSelected(!bool);
      this.ZU.Zn.setEnabled(!bool);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztyu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */