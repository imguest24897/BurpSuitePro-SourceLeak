package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zxww extends MouseAdapter {
  final Zm9e Zk;
  
  Zxww(Zm9e paramZm9e) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    if (this.Zk.Za)
      return; 
    this.Zk.Ze(Zlkk.TASK_ACTION_HOVER);
    this.Zk.setIcon(this.Zk.ZT);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    if (this.Zk.Za)
      return; 
    this.Zk.Ze(Zlkk.FOREGROUND);
    this.Zk.setIcon(this.Zk.ZQ);
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.Zk.Za)
      return; 
    this.Zk.Ze(Zlkk.TASK_ACTION_PRESSED);
    this.Zk.setIcon(this.Zk.Zh);
    if (this.Zk.isFocusable())
      this.Zk.requestFocusInWindow(); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.Zk.Za || !this.Zk.contains(paramMouseEvent.getPoint()))
      return; 
    this.Zk.Ze(Zlkk.TASK_ACTION_HOVER);
    this.Zk.setIcon(this.Zk.ZT);
    this.Zk.ZG.run();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxww.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */