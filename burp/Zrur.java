package burp;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JTabbedPane;

class Zrur extends ContainerAdapter {
  final JTabbedPane Zt;
  
  final Zl0q Zr;
  
  Zrur(Zl0q paramZl0q, JTabbedPane paramJTabbedPane) {}
  
  public void componentRemoved(ContainerEvent paramContainerEvent) {
    this.Zr.setVisible((this.Zt.getTabCount() != 0));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrur.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */