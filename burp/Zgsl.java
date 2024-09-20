package burp;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

class Zgsl implements HierarchyListener {
  final Component Zk;
  
  final Zmt5[] ZM;
  
  final Zm6x ZI;
  
  Zgsl(Zbiq paramZbiq, Component paramComponent, Zmt5[] paramArrayOfZmt5, Zm6x paramZm6x) {}
  
  public void hierarchyChanged(HierarchyEvent paramHierarchyEvent) {
    if ((paramHierarchyEvent.getChangeFlags() & 0x4L) == 4L && this.Zk.isVisible()) {
      Window window = Zt2m.ZF(this.Zk);
      window.addWindowListener(new Zl2f(this));
      this.Zk.removeHierarchyListener(this);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgsl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */