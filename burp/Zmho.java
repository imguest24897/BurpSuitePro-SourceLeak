package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

class Zmho extends MouseAdapter {
  final Zbds Zq;
  
  Zmho(Zbds paramZbds) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    boolean bool = ((paramMouseEvent.getModifiersEx() & 0x400) != 0) ? true : false;
    ImageIcon imageIcon1 = bool ? Zbz3.ZK(Zxpj.INSPECTOR_ARROW_UP_PRESSED) : Zbz3.ZK(Zxpj.INSPECTOR_ARROW_UP_HOVER);
    ImageIcon imageIcon2 = bool ? Zbz3.ZK(Zxpj.INSPECTOR_ARROW_DOWN_PRESSED) : Zbz3.ZK(Zxpj.INSPECTOR_ARROW_DOWN_HOVER);
    this.Zq.Zy.setIcon(this.Zq.ZU ? imageIcon1 : imageIcon2);
    this.Zq.Zy.Ze(bool ? Zlkk.ACTION_PRESSED : Zlkk.ACTION_HOVER);
    this.Zq.Zy.ZO(bool ? Zlkk.INSPECTOR_SEE_MORE_PRESSED_BACKGROUND : Zlkk.INSPECTOR_SEE_MORE_HOVER_BACKGROUND);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.Zq.Zy.setIcon(Zbz3.ZK(this.Zq.ZU ? Zxpj.INSPECTOR_ARROW_UP : Zxpj.INSPECTOR_ARROW_DOWN));
    this.Zq.Zy.Ze(Zlkk.ACTION_NORMAL);
    this.Zq.Zy.ZO(Zlkk.INSPECTOR_TABLE_BACKGROUND);
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.Zq.Zy.setIcon(Zbz3.ZK(this.Zq.ZU ? Zxpj.INSPECTOR_ARROW_UP_PRESSED : Zxpj.INSPECTOR_ARROW_DOWN_PRESSED));
    this.Zq.Zy.Ze(Zlkk.ACTION_PRESSED);
    this.Zq.Zy.ZO(Zlkk.INSPECTOR_SEE_MORE_PRESSED_BACKGROUND);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (!this.Zq.Zy.contains(paramMouseEvent.getPoint()))
      return; 
    this.Zq.Zy.setIcon(Zbz3.ZK(this.Zq.ZU ? Zxpj.INSPECTOR_ARROW_UP : Zxpj.INSPECTOR_ARROW_DOWN));
    this.Zq.Zy.Ze(Zlkk.ACTION_NORMAL);
    this.Zq.Zy.ZO(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    if (this.Zq.ZX) {
      this.Zq.Zi = this.Zq.Zw();
      this.Zq.ZC = this.Zq.ZQ();
    } 
    this.Zq.ZU = !this.Zq.ZU;
    this.Zq.ZI();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmho.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */