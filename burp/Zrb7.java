package burp;

import java.awt.Window;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.WindowListener;
import javax.swing.SwingUtilities;

class Zrb7 implements HierarchyListener {
  private Window ZY = null;
  
  private final WindowListener ZJ = new Zzw5(this);
  
  final Zbk5 Zn;
  
  private Zrb7(Zbk5 paramZbk5, Window paramWindow) {
    ZT(paramWindow);
  }
  
  public void hierarchyChanged(HierarchyEvent paramHierarchyEvent) {
    ZT(SwingUtilities.getWindowAncestor(paramHierarchyEvent.getComponent()));
  }
  
  private void ZT(Window paramWindow) {
    if (this.ZY != null)
      this.ZY.removeWindowListener(this.ZJ); 
    this.ZY = paramWindow;
    if (this.ZY != null)
      this.ZY.addWindowListener(this.ZJ); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrb7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */