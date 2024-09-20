package burp;

import java.awt.Window;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

class Zzo8 extends FocusAdapter implements HierarchyListener {
  final Zljk Zn;
  
  private Zzo8(Zljk paramZljk) {}
  
  void Zi(JTextComponent paramJTextComponent) {
    paramJTextComponent.addFocusListener(this);
    paramJTextComponent.addHierarchyListener(this);
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    this.Zn.ZJ();
  }
  
  public void hierarchyChanged(HierarchyEvent paramHierarchyEvent) {
    Window window = this.Zn.ZX;
    this.Zn.ZX = SwingUtilities.getWindowAncestor(this.Zn.ZI);
    if (this.Zn.ZX != window) {
      if (window != null)
        this.Zn.ZS.ZA(window); 
      if (this.Zn.ZX != null)
        this.Zn.ZS.Zu(this.Zn.ZX); 
    } 
  }
  
  public void Zl(JTextComponent paramJTextComponent) {
    paramJTextComponent.removeFocusListener(this);
    paramJTextComponent.removeHierarchyListener(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzo8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */