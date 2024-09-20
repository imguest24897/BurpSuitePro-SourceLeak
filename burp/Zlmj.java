package burp;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

class Zlmj extends ContainerAdapter {
  final Zbc2 Zn;
  
  Zlmj(Zbc2 paramZbc2) {}
  
  public void componentAdded(ContainerEvent paramContainerEvent) {
    this.Zn.setVisible(true);
  }
  
  public void componentRemoved(ContainerEvent paramContainerEvent) {
    if ((this.Zn.getComponents()).length == 0)
      this.Zn.setVisible(false); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlmj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */