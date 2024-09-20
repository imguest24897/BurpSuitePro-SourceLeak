package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zkgu extends MouseAdapter {
  final Zm2z ZV;
  
  private Zkgu(Zm2z paramZm2z) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.ZV.ZE = this.ZV.ZQ;
    if (this.ZV.ZK != null)
      this.ZV.ZK.ZQ(this.ZV.ZE); 
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.ZV.ZQ = this.ZV.ZE;
    this.ZV.repaint();
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    this.ZV.ZQ = 100 * (1 + paramMouseEvent.getX() / Zbz3.ZK(Zxpj.PANEL_STAR_EMPTY).getIconWidth());
    this.ZV.repaint();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkgu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */