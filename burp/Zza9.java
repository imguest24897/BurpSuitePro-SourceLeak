package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zza9 extends MouseAdapter {
  final Zbc6 Zn;
  
  final Zm99 Zi;
  
  final Zbcz Zt;
  
  Zza9(Zbcz paramZbcz, Zbc6 paramZbc6, Zm99 paramZm99) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.Zt.ZW = true;
    this.Zt.Zt(this.Zt.Za.isVisible(), this.Zt.ZW);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.Zt.ZW = false;
    this.Zt.Zt(this.Zt.Za.isVisible(), this.Zt.ZW);
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.Zt.isEnabled() && this.Zt.isFocusable())
      this.Zt.requestFocusInWindow(); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.Zt.isEnabled() && this.Zt.contains(paramMouseEvent.getPoint())) {
      this.Zi.setIcon(this.Zt.Zi);
      this.Zt.ZD(this.Zi, this.Zi.getWidth(), this.Zi.getHeight() / 2);
      this.Zt.Zt(true, true);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zza9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */