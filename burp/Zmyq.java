package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class Zmyq extends MouseAdapter {
  final Zr8o ZE;
  
  private Zmyq(Zr8o paramZr8o) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (this.ZE.Zc.isEditable())
      return; 
    if (SwingUtilities.isLeftMouseButton(paramMouseEvent) && this.ZE.ZE && paramMouseEvent.getClickCount() == 2)
      this.ZE.ZO(); 
    this.ZE.Z_(paramMouseEvent, this.ZE.Zc);
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.ZE.Zc.isEditable())
      return; 
    this.ZE.Z_(paramMouseEvent, this.ZE.Zc);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (this.ZE.Zc.isEditable())
      return; 
    this.ZE.Z_(paramMouseEvent, this.ZE.Zc);
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    if (this.ZE.Zc.isEditable())
      return; 
    this.ZE.Z_(paramMouseEvent, this.ZE.Zc);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    if (this.ZE.Zc.isEditable())
      return; 
    this.ZE.Z_(paramMouseEvent, this.ZE.Zc);
  }
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (this.ZE.Zc.isEditable())
      return; 
    this.ZE.Z_(paramMouseEvent, this.ZE.Zc);
  }
  
  public void mouseMoved(MouseEvent paramMouseEvent) {
    if (this.ZE.Zc.isEditable())
      return; 
    this.ZE.Z_(paramMouseEvent, this.ZE.Zc);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmyq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */